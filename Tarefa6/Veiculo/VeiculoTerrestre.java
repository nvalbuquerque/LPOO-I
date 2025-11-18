public abstract class VeiculoTerrestre extends Veiculo {
    protected String placa;
    protected double quilometragem;
    
    public VeiculoTerrestre (int id, String modelo, String cor, int anoModelo, String placa, double quilometragem) {
        super(id, modelo, cor, anoModelo);
        this.placa = placa;
        this.quilometragem = quilometragem;
    }

    public abstract void andar();

    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String inputPlaca) {
        this.placa = inputPlaca;
    }
    
    public double getQuilometragem() {
        return this.quilometragem;
    }
    
    public void setQuilometragem(double inputQuilometragem) {
        this.quilometragem = inputQuilometragem;
    }
}