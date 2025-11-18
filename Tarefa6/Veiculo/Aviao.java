public class Aviao extends VeiculoAereo {
    private String nome;
    private String companhiaAerea;
    private double pesoMaxDecolagem;
    
    public Aviao (int id, String modelo, String cor, int anoModelo, 
    String registroAeronautico, double horasVoo, 
    String nome, String companhiaAerea, double pesoMaxDecolagem) {
        super(id, modelo, cor, anoModelo, registroAeronautico, horasVoo);
        this.nome = nome;
        this.companhiaAerea = companhiaAerea;
        this.pesoMaxDecolagem = pesoMaxDecolagem;
    }
    
    @Override
    public void andar() {
        System.out.println("O aviao "+ getNome() + " esta voando.");
    };

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String inputNome) {
        this.nome = inputNome;
    }

    public String getCompanhiaAerea() {
        return this.companhiaAerea;
    }
    
    public void setCompanhiaAerea(String inputCompanhiaAerea) {
        this.companhiaAerea = inputCompanhiaAerea;
    }
    
    public double getPesoMaxDecolagem() {
        return this.pesoMaxDecolagem;
    }
    
    public void setPesoMaxDecolagem(double inputPesoMaxDecolagem) {
        this.pesoMaxDecolagem = inputPesoMaxDecolagem;
    }
    
    public String toString() {
        return "Aviao [ID=" + id + ", Modelo=" + modelo + ", Nome=" + nome + 
               ", Companhia=" + companhiaAerea + ", Peso Max=" + pesoMaxDecolagem + "]";
    }
}