public abstract class VeiculoAereo extends Veiculo {
    private String registroAeronautico;
    private double horasVoo;
    
    public VeiculoAereo(int id, String modelo, String cor, int anoModelo, String registroAeronautico, double horasVoo) {
        super(id, modelo, cor, anoModelo);
        this.registroAeronautico = registroAeronautico;
        this.horasVoo = horasVoo;
    }
    
    public abstract void andar();
    
    public String getRegistroAeronautico() {
        return this.registroAeronautico;
    }
    
    public void setRegistroAeronautico(String inputRegistroAeronautico) {
        this.registroAeronautico = inputRegistroAeronautico;
    }
    
    public double getHorasVoo() {
        return this.horasVoo;
    }
    
    public void setHorasVoo(double inputHorasVoo) {
        this.horasVoo = inputHorasVoo;
    }
}
