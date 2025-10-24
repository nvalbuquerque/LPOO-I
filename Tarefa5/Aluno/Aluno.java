public class Aluno {
    public String nome;
    public String matricula;
    public String curso;
    public int periodo;
    public int idade;
    public String[] disciplinasMatriculadas;
    public String endereco;
    public int quantidadeDisciplinasPermitidas;
    public int contadorDisciplinasMatriculadas;
    
    public Aluno(String nome, String matricula, String curso, int periodo, int idade, String endereco, int quantidadeDisciplinasPermitidas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.idade = idade;
        this.endereco = endereco;
        this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
        this.contadorDisciplinasMatriculadas = 0;

        if (quantidadeDisciplinasPermitidas > 0) {
            this.disciplinasMatriculadas = new String[quantidadeDisciplinasPermitidas];
        } else {
            this.disciplinasMatriculadas = new String[0]; 
        }
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
            if (this.contadorDisciplinasMatriculadas == 0) {
                System.out.println("Disciplinas matriculadas: Nenhuma disciplina matriculada.");
            } else {
                System.out.print("Disciplinas matriculadas: ");
                for (int i = 0; i < this.contadorDisciplinasMatriculadas; i++) {
                    System.out.print(this.disciplinasMatriculadas[i]);
                    if (i < this.contadorDisciplinasMatriculadas - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
            System.out.println("----------------------------");
    }
    
    public String fazMatricula(String disciplina) {
        if(quantidadeDisciplinasPermitidas == 0) {
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
        } else if (contadorDisciplinasMatriculadas < quantidadeDisciplinasPermitidas) {
            disciplinasMatriculadas[contadorDisciplinasMatriculadas] = disciplina;
            contadorDisciplinasMatriculadas++;
            return "Matrícula na disciplina " + disciplina + " executada.";
        } else {
            return "Quantidade de disciplinas exedida. O limite de disciplinas para este aluno é de " + quantidadeDisciplinasPermitidas + " disciplinas. Se desejar, cancele a matrícula de uma das disciplinas e faça a nova matricula.";
        } 
    }
    
    public String cancelarMatriculaAluno (String disciplina) {
            int indice = -1;

            for(int i = 0; i < contadorDisciplinasMatriculadas; i++) {
                if (this.disciplinasMatriculadas[i] != null && disciplinasMatriculadas[i].equalsIgnoreCase(disciplina)) {
                    indice = i;
                    break;
                }
            }
            
            if (indice == -1) {
                return "O aluno não está matriculado na " + disciplina + " , portanto, não é possível cancelar esta matrícula";
            }
            
            for (int i = indice; i < contadorDisciplinasMatriculadas - 1; i++) {
                disciplinasMatriculadas[i] = disciplinasMatriculadas[i+1];
            }
            
            disciplinasMatriculadas[contadorDisciplinasMatriculadas - 1] = null;
            contadorDisciplinasMatriculadas--;
            
            return "Cancelamento da matrícula da disciplina " + disciplina + " executado com sucesso.";
    }
}

    
