package sistemarh;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    private List<String> funcionariosGerenciados;

    public Gerente (String nome, int cpf, String endereco, double salario) {
        super(nome, cpf, endereco, salario);
        this.funcionariosGerenciados = new ArrayList<>();
    }
    
    public void adicionarFuncionario(String nomeFuncionario) {
        funcionariosGerenciados.add(nomeFuncionario);
    }
    
    public void removerFuncionario(String nomeFuncionario) {
        funcionariosGerenciados.remove(nomeFuncionario);
    }
    
    public int qtdeFuncionariosGerenciados() {
        return funcionariosGerenciados.size();
    }
    
    public double getBonus() {
        double bonus = (this.getSalario() * 2) + 100 * qtdeFuncionariosGerenciados();
        this.setSalario(this.getSalario() + bonus);
        return bonus;
    }
    
    public List<String> getFuncionariosGerenciados() {
        return new ArrayList<>(funcionariosGerenciados);
    }
}
