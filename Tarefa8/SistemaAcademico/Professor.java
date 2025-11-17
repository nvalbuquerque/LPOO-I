package alunos;

public class Professor extends Pessoa {
    private String[] disciplinasMinistradas;
    private int quantidadeDiscPermitidas;
    private int contadorDisciplinasMinistradas;
    
    public Professor (String nome, String matricula, int idade, String endereco, int quantidadeDiscPermitidas){
        super(nome, matricula, idade, endereco);
        this.quantidadeDiscPermitidas = quantidadeDiscPermitidas;
        this.contadorDisciplinasMinistradas = 0;
        
        if (quantidadeDiscPermitidas > 0) {
            this.disciplinasMinistradas = new String[quantidadeDiscPermitidas];
        } else {
            this.disciplinasMinistradas = new String[0]; 
        }
    }
    
    public String adicionarDisciplinas(String disciplina) {
        if(quantidadeDiscPermitidas == 0) {
            return "Este professor não pode ser associado com nenhuma disciplina, por favor, fale com a secretaria.";
        } else if (contadorDisciplinasMinistradas < quantidadeDiscPermitidas) {
            disciplinasMinistradas[contadorDisciplinasMinistradas] = disciplina;
            contadorDisciplinasMinistradas++;
            return "Matrícula na disciplina " + disciplina + " executada.";
        } else {
            return "Quantidade de disciplinas ministradas exedida. O limite de disciplinas para este professor é de " + quantidadeDiscPermitidas;
        } 
    }
    
    public String removerDisciplinas (String disciplina) {
            int indice = -1;

            for(int i = 0; i < contadorDisciplinasMinistradas; i++) {
                if (this.disciplinasMinistradas[i] != null && disciplinasMinistradas[i].equalsIgnoreCase(disciplina)) {
                    indice = i;
                    break;
                }
            }
            
            if (indice == -1) {
                return "O professor não ministra a disciplina " + disciplina + " , portanto, não é possível removê-la.";
            }
            
            for (int i = indice; i < contadorDisciplinasMinistradas - 1; i++) {
                disciplinasMinistradas[i] = disciplinasMinistradas[i+1];
            }
            
            disciplinasMinistradas[contadorDisciplinasMinistradas - 1] = null;
            contadorDisciplinasMinistradas--;
            
            return "Remoção da disciplina " + disciplina + " executado com sucesso.";
    }
}
