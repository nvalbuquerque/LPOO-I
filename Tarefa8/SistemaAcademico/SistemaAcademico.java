package alunos;

import java.util.Scanner;

public class SistemaAcademico {
    private static Aluno[] alunos;
    private static Professor[] professores;
    private static Disciplinas[] disciplinas;
    private static int quantidadeAlunos;
    private static int quantidadeProfessores;
    private static int quantidadeDisciplinas;
    private static int maximoAlunos;
    private static int maximoProfessores;
    private static int maximoDisciplinas;
    
    public static void inicializarSistema(int maxAlunos, int maxProfessores, int maxDisc, int qtdAlunosIniciais) {            
        maximoAlunos = maxAlunos;
        maximoProfessores = maxProfessores;
        maximoDisciplinas = maxDisc;
        
        alunos = new Aluno[maximoAlunos];
        professores = new Professor[maximoProfessores];
        disciplinas = new Disciplinas[maximoDisciplinas];
        
        quantidadeAlunos = 0;
        quantidadeProfessores = 0;
        quantidadeDisciplinas = 0;

        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < qtdAlunosIniciais; i++) {
            System.out.println("Iniciando o cadastro do aluno " + (i+1) + " de " + qtdAlunosIniciais + ". Pressione ENTER para continuar.");
            scanner.nextLine();
            cadastrarAluno(scanner);
        }
    }
    
    public static void cadastrarAluno(Scanner scanner) {
        if (quantidadeAlunos >= maximoAlunos) {
            System.out.println("Limite máximo de alunos atingido.");
            return;
        }

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

    public static void excluirAlunoPorNome(Scanner scanner) {
        if (quantidadeAlunos == 0) {
            System.out.println("Não há alunos cadastrados no sistema.");
            return;
        }

        scanner.nextLine();
        System.out.println("Insira o nome do aluno a ser excluído: ");
        String nomeAluno = scanner.nextLine();

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
        
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            Disciplinas disc = disciplinas[i];
            for (int j = 0; j < disc.getQuantidadeAlunosMatriculados(); j++) {
                if (disc.getAlunosMatriculados().get(j).getNome().equalsIgnoreCase(nomeAluno)) {
                    disc.cancelarMatriculaAluno(alunos[indice]);
                    break;
                }
            }
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

    public static void cadastrarProfessor(Scanner scanner) {
        if (quantidadeProfessores >= maximoProfessores) {
            System.out.println("Limite máximo de professores atingido.");
            return;
        }

        scanner.nextLine();
        System.out.println("Nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Matrícula:");
        String matricula = scanner.nextLine();
        
        System.out.println("Idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Endereço:");
        String endereco = scanner.nextLine();
        
        System.out.println("Quantidade de disciplinas permitidas:");
        int quantidadeDiscPermitidas = scanner.nextInt();
        scanner.nextLine();
        
        Professor novoProfessor = new Professor(nome, matricula, idade, endereco, quantidadeDiscPermitidas);
        professores[quantidadeProfessores] = novoProfessor;
        quantidadeProfessores++;
        
        System.out.println("Professor cadastrado com sucesso!");
    }

    public static void listarProfessores() {
        if (quantidadeProfessores == 0) {
            System.out.println("Não há professores cadastrados no sistema.");
            return;
        }
        
        System.out.println("Lista de professores cadastrados:");
        for (int i = 0; i < quantidadeProfessores; i++) {
            System.out.println("Professor " + (i+1) + ": " + professores[i].getNome() + 
                             " - Matrícula: " + professores[i].getMatricula());
        }
    }

    public static void cadastrarDisciplina(Scanner scanner) {
        if (quantidadeDisciplinas >= maximoDisciplinas) {
            System.out.println("Limite máximo de disciplinas atingido.");
            return;
        }

        scanner.nextLine();
        System.out.println("Nome da disciplina:");
        String nome = scanner.nextLine();
        
        System.out.println("Código:");
        String codigo = scanner.nextLine();
        
        System.out.println("Carga horária:");
        int cargaHoraria = scanner.nextInt();
        
        System.out.println("Capacidade máxima de alunos:");
        int capacidade = scanner.nextInt();
        scanner.nextLine();
        
        Disciplinas novaDisciplina = new Disciplinas(nome, codigo, cargaHoraria, capacidade);
        disciplinas[quantidadeDisciplinas] = novaDisciplina;
        quantidadeDisciplinas++;
        
        System.out.println("Disciplina cadastrada com sucesso!");
    }

    public static void listarDisciplinas() {
        if (quantidadeDisciplinas == 0) {
            System.out.println("Não há disciplinas cadastradas no sistema.");
            return;
        }
        
        System.out.println("Lista de disciplinas cadastradas:");
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            disciplinas[i].exibirInformacoes();
        }
    }

    public static void matricularAlunoEmDisciplina(Scanner scanner) {
        if (quantidadeAlunos == 0 || quantidadeDisciplinas == 0) {
            System.out.println("É necessário ter alunos e disciplinas cadastrados.");
            return;
        }

        scanner.nextLine();
        
        // Selecionar aluno
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();
        
        Aluno alunoEncontrado = null;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(nomeAluno)) {
                alunoEncontrado = alunos[i];
                break;
            }
        }
        
        if (alunoEncontrado == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        // Selecionar disciplina
        System.out.println("Digite o nome da disciplina:");
        String nomeDisciplina = scanner.nextLine();
        
        Disciplinas disciplinaEncontrada = null;
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            if (disciplinas[i].getNome().equalsIgnoreCase(nomeDisciplina)) {
                disciplinaEncontrada = disciplinas[i];
                break;
            }
        }
        
        if (disciplinaEncontrada == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        // Fazer matrícula
        String resultado = disciplinaEncontrada.matricularAluno(alunoEncontrado);
        System.out.println(resultado);
    }

    public static void cancelarMatricula(Scanner scanner) {
        if (quantidadeAlunos == 0 || quantidadeDisciplinas == 0) {
            System.out.println("É necessário ter alunos e disciplinas cadastrados.");
            return;
        }

        scanner.nextLine();
        
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();
        
        Aluno alunoEncontrado = null;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(nomeAluno)) {
                alunoEncontrado = alunos[i];
                break;
            }
        }
        
        if (alunoEncontrado == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.println("Digite o nome da disciplina:");
        String nomeDisciplina = scanner.nextLine();
        
        Disciplinas disciplinaEncontrada = null;
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            if (disciplinas[i].getNome().equalsIgnoreCase(nomeDisciplina)) {
                disciplinaEncontrada = disciplinas[i];
                break;
            }
        }
        
        if (disciplinaEncontrada == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        String resultado = disciplinaEncontrada.cancelarMatriculaAluno(alunoEncontrado);
        System.out.println(resultado);
    }

    public static void definirProfessorDisciplina(Scanner scanner) {
        if (quantidadeProfessores == 0 || quantidadeDisciplinas == 0) {
            System.out.println("É necessário ter professores e disciplinas cadastrados.");
            return;
        }

        scanner.nextLine();
        
        System.out.println("Digite o nome do professor:");
        String nomeProfessor = scanner.nextLine();
        
        Professor professorEncontrado = null;
        for (int i = 0; i < quantidadeProfessores; i++) {
            if (professores[i].getNome().equalsIgnoreCase(nomeProfessor)) {
                professorEncontrado = professores[i];
                break;
            }
        }
        
        if (professorEncontrado == null) {
            System.out.println("Professor não encontrado.");
            return;
        }

        System.out.println("Digite o nome da disciplina:");
        String nomeDisciplina = scanner.nextLine();
        
        Disciplinas disciplinaEncontrada = null;
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            if (disciplinas[i].getNome().equalsIgnoreCase(nomeDisciplina)) {
                disciplinaEncontrada = disciplinas[i];
                break;
            }
        }
        
        if (disciplinaEncontrada == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        String resultado = disciplinaEncontrada.definirProfessorResponsavel(professorEncontrado);
        System.out.println(resultado);
    }

    public static void imprimirListaDeAlunoseDisciplinas() {
        if (quantidadeDisciplinas == 0) {
            System.out.println("Não há disciplinas cadastradas.");
            return;
        }
        
        System.out.println("Relatório completo do sistema:");
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            disciplinas[i].exibirInformacoes();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean controle = false;

        // Inicialização do sistema
        System.out.println("Inicializar sistema acadêmico:");
        System.out.println("Digite o número máximo de alunos:");
        int maxAlunos = scanner.nextInt();
        System.out.println("Digite o número máximo de professores:");
        int maxProfessores = scanner.nextInt();
        System.out.println("Digite o número máximo de disciplinas:");
        int maxDisciplinas = scanner.nextInt();
        System.out.println("Digite a quantidade inicial de alunos a serem cadastrados:");
        int qtdAlunosIniciais = scanner.nextInt();
        
        if (maxAlunos <= 0 || maxProfessores <= 0 || maxDisciplinas <= 0 || qtdAlunosIniciais < 0) {
            System.out.println("Os valores devem ser maiores que 0.");
            return;
        }
        
        if (maxAlunos < qtdAlunosIniciais) {
            System.out.println("A quantidade de alunos inicial não pode ser maior que o máximo.");
            return;
        }

        inicializarSistema(maxAlunos, maxProfessores, maxDisciplinas, qtdAlunosIniciais);
        controle = true;

        // Menu principal
        while (controle) {
            System.out.println("\n=== MENU SISTEMA ACADÊMICO ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Cadastrar disciplina");
            System.out.println("4 - Excluir aluno por nome");
            System.out.println("5 - Listar alunos");
            System.out.println("6 - Listar professores");
            System.out.println("7 - Listar disciplinas");
            System.out.println("8 - Matricular aluno em disciplina");
            System.out.println("9 - Cancelar matrícula de aluno em disciplina");
            System.out.println("10 - Definir professor para disciplina");
            System.out.println("11 - Imprimir relatório completo");
            System.out.println("0 - Sair do sistema");
            System.out.println("Escolha a opção desejada:");
            
            int op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    cadastrarAluno(scanner);
                    break;
                case 2:
                    cadastrarProfessor(scanner);
                    break;
                case 3:
                    cadastrarDisciplina(scanner);
                    break;
                case 4:
                    excluirAlunoPorNome(scanner);
                    break;
                case 5:
                    listaAlunos();
                    break;
                case 6:
                    listarProfessores();
                    break;
                case 7:
                    listarDisciplinas();
                    break;
                case 8:
                    matricularAlunoEmDisciplina(scanner);
                    break;
                case 9:
                    cancelarMatricula(scanner);
                    break;
                case 10:
                    definirProfessorDisciplina(scanner);
                    break;
                case 11:
                    imprimirListaDeAlunoseDisciplinas();
                    break;
                case 0:
                    controle = false;
                    System.out.println("Saindo do sistema acadêmico. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}