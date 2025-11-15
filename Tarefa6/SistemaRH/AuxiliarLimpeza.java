package sistemarh;

public class AuxiliarLimpeza extends Funcionario {
    private String gerente;
    private String departamento;

    public AuxiliarLimpeza (String nome, int cpf, String endereco, double salario, String gerente, String departamento) {
        super(nome, cpf, endereco, salario);
        this.gerente = gerente; 
        this.departamento = departamento;
    }

    public String getGerente() {
        return this.gerente;
    }
    
    public String getDepartamento() {
        return this.departamento;
    }
    
    @Override
    public double getBonus() {
        double bonus = this.getSalario() * 0.5;
        this.setSalario(this.getSalario() + bonus);
        return bonus;
    }
}
