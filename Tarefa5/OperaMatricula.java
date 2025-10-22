import java.util.Scanner;
import java.util.List;

class Aluno {
    public String nome;
    public String matricula;
    public String curso;
    public int periodo;
    public int idade;
    public String[] disciplinasMatriculadas;
    public String endereco;
    public int quantidadeDisciplinasPermitidas;
    
    public Aluno(String nome, String matricula, String curso, int periodo, int idade, String endereco, int quantidadeDisciplinasPermitidas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.idade = idade;
        this.endereco = endereco;
        this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
    }
    
    public String getNome() {
        return nome;
    }

    public void imprime() {
            System.out.println("----------------------------");
            System.out.println("Nome do aluno: " + this.nome);
            System.out.println("Matricula: " + this.matricula);
            System.out.println("Curso: " + this.curso);
            System.out.println("Período: " + this.periodo);
            System.out.println("Disciplinas matriculadas: " + this.disciplinasMatriculadas);
            System.out.println("----------------------------");
    }
    
    public String fazMatricula(String disciplina) {
        if(quantidadeDisciplinasPermitidas == 0) {
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
        } else if (disciplinasMatriculadas.size() < quantidadeDisciplinasPermitidas) {
            disciplinasMatriculadas.add(disciplina);
            return "Matrícula na disciplina " + disciplina + " executada.";
        } else {
            return "Quantidade de disciplinas exedida. O limite de disciplinas para este aluno é de " + quantidadeDisciplinasPermitidas + " disciplinas. Se desejar, cancele a matrícula de uma das disciplinas e faça a nova matricula.";
        } 
    }
    
    public String cancelarMatricula (String disciplina) {
        for (String elemento : disciplinasMatriculadas) {
            int indice = -1;
            for(int i = 0; i < quantidadeDisciplinasPermitidas; i++) {
                if (disciplinasMatriculadas[i].equalsIgnoreCase(disciplina)) {
                    indice = i;
                    break;
                }
            }
            
            if (indice == = -1) {
                return "O aluno não está matriculado na " + disciplina + " , portanto, não é possível cancelar esta matrícula";
            }
            
            for (int i = indice; i < quantidadeDisciplinasPermitidas - 1; i++) {
                disciplinasMatriculadas[i] = disciplinasMatriculadas[i+1];
            }
            
            disciplinasMatriculadas[quantidadeDisciplinasPermitidas - 1] = null;
            quantidadeDisciplinasPermitidas--;
            
            return "Cancelamento da matrícula da disciplina " + disciplina + " executado com sucesso.";
        }
    }
    
public class SistemaAcademico {
        private Aluno[] alunos;
        private int quantidadeAlunos;
        private int maximoAlunos
        
        public SistemaAcademico(int maximoAlunos) {
            this.maximoAlunos = maximoAlunos;
            this.alunos = new Aluno[maximoAlunos];
            this.quantidadeAlunos = 0;
        }
        
        public static void inicializarSistema (int maximo, int quantidade) {
            if (maximo <= 0 || quantidade <= 0) {
                System.out.println("Os valores inseridos devem ser maiores que 0.");
                return;
            }
            
            if (maximo < quantidade) {
                System.out.println("A quantidade de alunos a serem cadastrados é maior do que o máximo estipulado.");
                return;
            }
            
            maximoAlunos = maximo;
            alunos = new Aluno[maximoAlunos];
            quantidadeAlunos = 0;
            
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Cadastrando o aluno " + (i+1) + " de " + quantidade + ":");
                cadastrarAluno();
            }
        }
        
        public static void cadastrarAluno() {
            if (quantidadeAlunos >= maximoAlunos) {
                System.out.println("Limite máximo de alunos atingido.");
                return;
            }
            
            Scanner scanner = new Scanner(System.in);	
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

        public static void Aluno[] listaAlunos() {
            if (quantidadeAlunos == 0) {
                System.out.println("Não há alunos cadastrados no sistema.");
                return;
            }
            
            System.out.println("Lista de alunos cadastrados:")
            for (int i = 0; i < quantidadeAlunos; i++) {
                System.out.println("Aluno " + (i+1) + ":");
                alunos[i].imprime();
            }
        }

        public static String matricularAlunoEmDisciplina(Aluno aluno, String disciplina) {
            
        }
        
        public static String cancelarMatricula(Aluno aluno, String disciplina) {

        }
        
        public static void imprimirListaDeAlunoseDisciplinas() {

        }
        
        public static void main(String[] args) {
            System.out.println("Menu sistema acadêmico");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Excluir aluno por nome");
            System.out.println("3 - Listar alunos");
            System.out.println("4 - Matricular aluno");
            System.out.println("5 - Cancelar matrícula");
            System.out.println("6 - Imprimir lista de alunos e disciplinas matriculadas");
            System.out.println("Escolha a desejada:");
            
            int op = 0;
            
            Scanner scanner = new Scanner(System.in);
            int op = scanner.nextInt();
            
            switch (op) {
                case (1):
                    break;
                case (2):
                    break;
                case (3):
                    break;
                case (4):
                    break;
                case (5):
                    break;
                case (6): 
                    break;
            }


        }
}
