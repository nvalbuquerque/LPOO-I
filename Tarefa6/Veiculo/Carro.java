public class Carro extends VeiculoTerrestre {
    private String nome;
    private int numeroPortas;
    private String tipoCombustivel;
    
    public Carro(int id, String modelo, String cor, int anoModelo, String placa, double quilometragem, String nome, int numeroPortas, String tipoCombustivel) {
        super(id, modelo, cor, anoModelo, placa, quilometragem);
        this.nome = nome;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    @Override
    public void andar() {
        System.out.println("O carro "+ getNome() + " esta andando.");
    };

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String inputNome) {
        this.nome = inputNome;
    }
    
    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }
    
    public void setTipoCombustivel(String inputTipoCombustivel) {
        this.tipoCombustivel = inputTipoCombustivel;
    }
    
    public int getNumeroPortas() { 
        return this.numeroPortas;
    }
    
    public void setNumeroPortas(int inputNumeroPortas) { 
        this.numeroPortas = inputNumeroPortas;
    }
    
    public String toString() {
        return "Carro [ID=" + id + ", Modelo=" + modelo + ", Nome=" + nome + 
               ", Portas=" + numeroPortas + ", Combustivel=" + tipoCombustivel + "]";
    }
}