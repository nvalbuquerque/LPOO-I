public abstract class Veiculo {
    protected int id;
    protected String modelo;
    protected String cor;
    protected int anoModelo;
    
    public Veiculo(int id, String modelo, String cor, int anoModelo) {
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
        this.anoModelo = anoModelo;
    }
    
    public abstract void andar();
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int inputId) {
        this.id = inputId;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String inputModelo) {
        this.modelo = inputModelo;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String inputCor) {
        this.cor = inputCor;
    }
    
    public int getAnoModelo() {
        return this.anoModelo;
    }
    
    public void setAnoModelo(int inputAnoModelo) {
        this.anoModelo = inputAnoModelo;
    }
    
    public String getInfos() {
        return "Veiculo [ID: " + id + ", Modelo: " + modelo + ", Cor: " + cor + 
               ", Ano do Modelo: " + anoModelo + "]";
    }
}