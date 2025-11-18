public class Trem extends VeiculoTerrestre {
    private String nome;
    private int numeroVagoes;
    private double comprimentoTrilho;
    
    public Trem (int id, String modelo, String cor, int anoModelo, String placa, double quilometragem, String nome, int numeroVagoes, double comprimentoTrilho) {
        super(id, modelo, cor, anoModelo, placa, quilometragem);
        this.nome = nome;
        this.numeroVagoes = numeroVagoes;
        this.comprimentoTrilho = comprimentoTrilho;
    }
    
    @Override
    public void andar() {
        System.out.println("O trem "+ getNome() + " esta andando.");
    };

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String inputNome) {
        this.nome = inputNome;
    }
    
    public int getNumeroVagoes() {
        return this.numeroVagoes;
    }
    
    public void setNumeroVagoes(int inputNumeroVagoes) {
        this.numeroVagoes = inputNumeroVagoes;
    }
    
    public double getComprimentoTrilho() {
        return this.comprimentoTrilho;
    }
    
    public void setComprimentoTrilho(double inputComprimentoTrilho) {
        this.comprimentoTrilho = inputComprimentoTrilho;
    }
    
    public String toString() {
        return "Trem [ID=" + id + ", Modelo=" + modelo + ", Nome=" + nome + 
               ", Vagoes=" + numeroVagoes + ", Comprimento do Trilho=" + comprimentoTrilho + "]";
    }
}