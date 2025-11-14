public class Bicicleta {
    private String nome;
    private double velocidade;
    private int marcha;
    private int numMaxMarcha;
    
    public Bicicleta(String nome) {
        this.nome = nome;
        this.velocidade = 0;
        this.marcha = 0;
        this.numMaxMarcha = 18;
    }
    
    public Bicicleta(String nome, int numMaxMarcha) {
        this.nome = nome;
        this.velocidade = 0;
        this.marcha = 0;
        this.numMaxMarcha = numMaxMarcha;
    }
    
    
    public int getMarcha () {
        return this.marcha;
    }
    
    public int getNumMaxMarcha () {
        return this.numMaxMarcha;
    }
    
    public void setMarcha(int novoValor) {
        if (novoValor >= 0 && novoValor < getNumMaxMarcha()) {
            marcha = novoValor;
        } else {
            System.out.println("O valor " + novoValor + " excede o número máximo de marchas possível.");
        }
    }
    
    public void pedalar(int pedalada, double forca){
        velocidade = velocidade + (pedalada * forca);
    }
    
    public void frear(double forca){
        velocidade = velocidade - (forca * velocidade);
        if (velocidade < 0) {
            velocidade = 0;
        }
    }
    
    public void imprimeEstado(){
        System.out.println(
            "===== Bicicleta "+nome+" =====\n"+
            "Velocidade = "+velocidade+"\n"+
            "Marcha = "+marcha+"\n");
    }
}
