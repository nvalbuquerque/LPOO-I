public class Barco extends VeiculoAquatico {
    private String nome;
    private String material;
    private String tipoCasco;
    
    public Barco (int id, String modelo, String cor, int anoModelo, String bandeira, double horasMotor, String nome, String material, String tipoCasco) {
        super(id, modelo, cor, anoModelo, bandeira, horasMotor);
        this.nome = nome;
        this.material = material;
        this.tipoCasco = tipoCasco;
    }
    
    @Override
    public void andar() {
        System.out.println("O barco "+ getNome() + " esta navegando.");
    };

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String inputNome) {
        this.nome = inputNome;
    }
    
    public String getMaterial() {
        return this.material;
    }
    
    public void setMaterial(String inputMaterial) {
        this.material = inputMaterial;
    }

    public String getTipoCasco() {
        return this.tipoCasco;
    }
    
    public void setTipoCasco(String inputTipoCasco) {
        this.tipoCasco = inputTipoCasco;
    }
    
    public String toString() {
        return "Barco [ID=" + id + ", Modelo=" + modelo + ", Nome=" + nome + 
               ", Material=" + material + ", Casco=" + tipoCasco + "]";
    }
}