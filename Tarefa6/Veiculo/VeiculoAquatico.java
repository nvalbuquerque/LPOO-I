public abstract class VeiculoAquatico extends Veiculo {
    private String bandeira;
    private double horasMotor;
    
    public VeiculoAquatico (int id, String modelo, String cor, int anoModelo, String bandeira, double horasMotor) {
        super(id, modelo, cor, anoModelo);
        this.bandeira = bandeira;
        this.horasMotor = horasMotor;
    }
    
    public abstract void andar();
    
    public String getBandeira() {
        return this.bandeira;
    }
    
    public void setBandeira(String inputBandeira) {
        this.bandeira = inputBandeira;
    }
    
    public double getHorasMotor() {
        return this.horasMotor;
    }
    
    public void setHorasMotor(double inputHorasMotor) {
        this.horasMotor = inputHorasMotor;
    }
}