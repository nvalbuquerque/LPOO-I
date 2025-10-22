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
    
    class SistemaAcademico {
        private Aluno[] alunos;
        private int quantidadeAlunos;
        private int maximoAlunos
        
        public SistemaAcademico(int maximoAlunos) {
            this.maximoAlunos = maximoAlunos;
            this.alunos = new Aluno[maximoAlunos];
            this.quantidadeAlunos = 0;
        }
        
        public static void cadastrarAluno(Aluno aluno) {
            
        }

        public static void excluirAlunoPorNome(String  nomeAluno) {
            
        }

        public static Aluno[] listaAlunos() {
            
        }

        public static String matricularAlunoEmDisciplina(Aluno aluno, String disciplina) {
            
        }
        
        public static String cancelarMatricula(Aluno aluno, String disciplina) {
            
        }
        
        public static String imprimirListaDeAlunoseDisciplinas() {
            
        }
        
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

public class OperaMatricula {
	public static void main(String[] args) {
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
		
		Aluno A1 = new Aluno(nome, matricula, curso, periodo, idade, endereco, quantidadeDisciplinasPermitidas);
		
		A1.imprime();
		
		A1.fazMatricula();
	}
}
