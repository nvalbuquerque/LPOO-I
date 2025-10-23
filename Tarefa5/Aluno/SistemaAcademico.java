import java.util.Scanner;
import java.util.List;

public class SistemaAcademico {
        private static Aluno[] alunos;
        private static int quantidadeAlunos;
        private static int maximoAlunos;
        
        public static void inicializarSistema (int maximo, int quantidade) {            
            maximoAlunos = maximo;
            alunos = new Aluno[maximoAlunos];
            quantidadeAlunos = 0;

            Scanner scanner = new Scanner(System.in);
            
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Cadastrando o aluno " + (i+1) + " de " + quantidade + ":");
                cadastrarAluno(scanner);
            }
        }
        
        public static void cadastrarAluno(Scanner scanner) {
            if (quantidadeAlunos >= maximoAlunos) {
                System.out.println("Limite máximo de alunos atingido.");
                return;
            }

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            	
    		System.out.println("Cadastrar aluno:");
    		
    		System.out.println("Nome:");
    		String nome = scanner.nextLine();
    		
    		System.out.println("Matrícula:");
    		String matricula = scanner.nextLine();
    		
    		System.out.println("Curso:");
    		String curso = scanner.nextLine();
    		
    		System.out.println("Período:");
    		int periodo = scanner.nextInt();
    		scanner.nextLine();
    		
    		System.out.println("Idade:");
    		int idade = scanner.nextInt();
    		scanner.nextLine();
    		
    		System.out.println("Endereço:");
    		String endereco = scanner.nextLine();
    		
    		System.out.println("Quantidade de disciplinas permitidas:");
    		int quantidadeDisciplinasPermitidas = scanner.nextInt();
    		scanner.nextLine();
    		
    		Aluno novoAluno = new Aluno(nome, matricula, curso, periodo, idade, endereco, quantidadeDisciplinasPermitidas);
    		alunos[quantidadeAlunos] = novoAluno;
    		quantidadeAlunos++;
    		
    		System.out.println("Aluno cadastrado com sucesso!");
        }

        public static void excluirAlunoPorNome(String nomeAluno) {
            if (quantidadeAlunos == 0) {
                System.out.println("Não há alunos cadastrados no sistema.");
                return;
            }
            
            int indice = -1;

            for (int i = 0; i < quantidadeAlunos; i++) {
                if (alunos[i].getNome().equalsIgnoreCase(nomeAluno)) {
                    indice = i;
                    break;
                }
            }
            
            if (indice == -1) {
                System.out.println("Não há aluno cadastrado com esse nome.");
                return;
            }
            
            for (int i = indice; i < quantidadeAlunos-1; i++) {
                alunos[i] = alunos[i+1];
            }
            
            alunos[quantidadeAlunos - 1] = null;
            quantidadeAlunos--;
            
            System.out.println("Exclusão do aluno feita com sucesso!");
        }

        public static void listaAlunos() {
            if (quantidadeAlunos == 0) {
                System.out.println("Não há alunos cadastrados no sistema.");
                return;
            }
            
            System.out.println("Lista de alunos cadastrados:");
            for (int i = 0; i < quantidadeAlunos; i++) {
                System.out.println("Aluno " + (i+1) + ":");
                alunos[i].imprime();
            }
        }

        public static void matricularAlunoEmDisciplina(Scanner scanner) {
                String nomeMatricula = "";
                String disciplinaMatricula = "";

                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }

                while (true) {
                    System.out.println("Digite o nome do aluno a ser matriculado:");
                    nomeMatricula = scanner.nextLine().trim();

                    if(!nomeMatricula.trim().isEmpty()) {
                        break;
                    }
                    System.out.println("O nome do aluno não pode estar vazio. Tente novamente.");
                }

                Aluno alunoEncontrado = null;
                for (int i = 0; i < quantidadeAlunos; i++) {
                    if (alunos[i] != null && alunos[i].getNome().equalsIgnoreCase(nomeMatricula)) {
                        alunoEncontrado = alunos[i];
                        break;
                    }
                }

                if (alunoEncontrado == null) {
                    System.out.println("Aluno não encontrado: " + nomeMatricula);
                    return;
                }

                int quantidadeRestante = alunoEncontrado.quantidadeDisciplinasPermitidas - alunoEncontrado.contadorDisciplinasMatriculadas;

                if (quantidadeRestante <= 0) {
                    System.out.println("O aluno " + nomeMatricula + " já atingiu o limite de matrículas em disciplinas.");
                    return;
                }

                System.out.println("O aluno " + nomeMatricula + " pode se matricular em mais " + quantidadeRestante + " disciplinas.");


                for (int i = 0; i < quantidadeRestante; i++) {
                    System.out.println("Digite o nome da disciplina para matrícula:");
                    disciplinaMatricula = scanner.nextLine().trim();

                    String resultado = alunoEncontrado.fazMatricula(disciplinaMatricula);
                    System.out.println(resultado);
                }
                System.out.println("Matrícula concluída para o aluno " + nomeMatricula);
        }
        
        /* 
        public static String cancelarMatricula(Aluno aluno, String disciplina) {

        } */
        
        public static void imprimirListaDeAlunoseDisciplinas() {
            if (quantidadeAlunos == 0) {
                System.out.println("Não há alunos cadastrados no sistema.");
                return;
            }
            
            System.out.println("Lista de alunos e suas disciplinas matriculadas:");
            for (Aluno aluno : alunos) {
                aluno.imprime();
                System.out.println("Disciplinas matriculadas:");
                for (String disciplina : aluno.disciplinasMatriculadas) {
                    System.out.println("- " + disciplina);
                }
                System.out.println();
            }

        }
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int maximo = 0;
            int quantidade = 0;
            boolean controle = false;
            SistemaAcademico sistema = null;

            do {
                System.out.println("Inicializar sistema acadêmico:");
                System.out.println("Digite o número máximo de alunos:");
                maximo = scanner.nextInt();
                System.out.println("Digite a quantidade inicial de alunos a serem cadastrados:");
                quantidade = scanner.nextInt();
                scanner.nextLine();
                            
                if (maximo <= 0 || quantidade <= 0) {
                    System.out.println("Os valores inseridos devem ser maiores que 0.");
                    continue;
                }
            
                if (maximo < quantidade) {
                    System.out.println("A quantidade de alunos a serem cadastrados é maior do que o máximo estipulado.");
                    continue;
                }

                sistema.inicializarSistema(maximo, quantidade);
                controle = true;
            } while (controle == false);

            while (controle == true) {
                System.out.println("Menu sistema acadêmico");
                System.out.println("1 - Cadastrar aluno");
                System.out.println("2 - Excluir aluno por nome");
                System.out.println("3 - Listar alunos");
                System.out.println("4 - Matricular aluno em disciplina");
                System.out.println("5 - Cancelar matrícula");
                System.out.println("6 - Imprimir lista de alunos e disciplinas matriculadas");
                System.out.println("0 - Sair do sistema");
                System.out.println("Escolha a desejada:");
                
                int op = 0;
                
                op = scanner.nextInt();
                
                switch (op) {
                    case (1):
                        sistema.cadastrarAluno(scanner);
                        break;
                    case (2):
                        System.out.println("Digite o nome do aluno a ser excluído:");
                        String nomeAluno = scanner.nextLine();
                        sistema.excluirAlunoPorNome(nomeAluno);
                        break;
                    case (3):
                        sistema.listaAlunos();
                        break;
                    case (4):
                        sistema.matricularAlunoEmDisciplina(scanner);
                        break;
                    case (5):
                        break;
                    case (6): 
                        sistema.imprimirListaDeAlunoseDisciplinas();
                        break;
                    case (0):
                        controle = false;
                        System.out.println("Saindo do sistema acadêmico. Até mais!");
                        break;
                }
            }
        }
}
