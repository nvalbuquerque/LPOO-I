package alunos;

import java.util.ArrayList;
import java.util.List;

public class Disciplinas {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private Professor professorResponsavel;
    private List<Aluno> alunosMatriculados;
    private int capacidadeMaxima;

    public Disciplinas(String nome, String codigo, int cargaHoraria, int capacidadeMaxima) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = new ArrayList<>();
        this.professorResponsavel = null;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public List<Aluno> getAlunosMatriculados() {
        return new ArrayList<>(alunosMatriculados);
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String definirProfessorResponsavel(Professor professor) {
        if (this.professorResponsavel != null) {
            return "Esta disciplina já possui um professor responsável: " + this.professorResponsavel.getNome();
        }
        
        this.professorResponsavel = professor;
        String resultado = professor.adicionarDisciplinas(this.nome);
        
        if (resultado.contains("executada")) {
            return "Professor " + professor.getNome() + " definido como responsável pela disciplina " + this.nome;
        } else {
            this.professorResponsavel = null;
            return "Não foi possível definir o professor responsável: " + resultado;
        }
    }

    public String removerProfessorResponsavel() {
        if (this.professorResponsavel == null) {
            return "Esta disciplina não possui professor responsável.";
        }
        
        Professor professor = this.professorResponsavel;
        String resultado = professor.removerDisciplinas(this.nome);
        
        if (resultado.contains("sucesso")) {
            this.professorResponsavel = null;
            return "Professor removido da disciplina " + this.nome + " com sucesso.";
        } else {
            return "Erro ao remover professor: " + resultado;
        }
    }

    public String matricularAluno(Aluno aluno) {
        if (alunosMatriculados.contains(aluno)) {
            return "O aluno " + aluno.getNome() + " já está matriculado nesta disciplina.";
        }
        
        if (alunosMatriculados.size() >= capacidadeMaxima) {
            return "Capacidade máxima da disciplina atingida. Não é possível matricular mais alunos.";
        }
        
        String resultado = aluno.fazMatricula(this.nome);
        
        if (resultado.contains("executada")) {
            alunosMatriculados.add(aluno);
            return "Aluno " + aluno.getNome() + " matriculado na disciplina " + this.nome + " com sucesso.";
        } else {
            return "Não foi possível matricular o aluno: " + resultado;
        }
    }

    public String cancelarMatriculaAluno(Aluno aluno) {
        if (!alunosMatriculados.contains(aluno)) {
            return "O aluno " + aluno.getNome() + " não está matriculado nesta disciplina.";
        }
        
        String resultado = aluno.cancelarMatriculaAluno(this.nome);
        
        if (resultado.contains("sucesso")) {
            alunosMatriculados.remove(aluno);
            return "Matrícula do aluno " + aluno.getNome() + " cancelada na disciplina " + this.nome + " com sucesso.";
        } else {
            return "Erro ao cancelar matrícula: " + resultado;
        }
    }

    public void exibirInformacoes() {
        System.out.println("==================================");
        System.out.println("Disciplina: " + this.nome);
        System.out.println("Código: " + this.codigo);
        System.out.println("Carga Horária: " + this.cargaHoraria + " horas");
        System.out.println("Capacidade: " + alunosMatriculados.size() + "/" + capacidadeMaxima + " alunos");
        
        if (professorResponsavel != null) {
            System.out.println("Professor Responsável: " + professorResponsavel.getNome());
        } else {
            System.out.println("Professor Responsável: Não definido");
        }
        
        System.out.println("Alunos Matriculados (" + alunosMatriculados.size() + "):");
        if (alunosMatriculados.isEmpty()) {
            System.out.println("  Nenhum aluno matriculado.");
        } else {
            for (Aluno aluno : alunosMatriculados) {
                System.out.println("  - " + aluno.getNome() + " (" + aluno.getMatricula() + ")");
            }
        }
        System.out.println("==================================");
    }

    public int getQuantidadeAlunosMatriculados() {
        return alunosMatriculados.size();
    }

    public boolean temVagas() {
        return alunosMatriculados.size() < capacidadeMaxima;
    }
}