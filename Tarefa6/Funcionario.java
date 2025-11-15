package sistemarh;

public abstract class Funcionario {
    private String nome;
    private int cpf;
    private String endereco;
    private double salario;
    
    public Funcionario (String nome, int cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String inputNome) {
        this.nome = inputNome;
    }
    
    public int getCpf() {
        return this.cpf;
    }
    
    public void setCpf(int inputCpf) {
        this.cpf = inputCpf;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String inputEndereco) {
        this.endereco = inputEndereco;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double inputSalario) {
        this.salario = inputSalario;
    }
    
    public abstract double getBonus();
}
