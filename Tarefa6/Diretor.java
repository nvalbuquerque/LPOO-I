package sistemarh;

import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario {
    private List<String> departamentos;

    public Diretor (String nome, int cpf, String endereco, double salario) {
        super(nome, cpf, endereco, salario);
        this.departamentos = new ArrayList<>();
    }
    
    public void adicionarDepartamento(String nomeDepartamento) {
        departamentos.add(nomeDepartamento);
    }
    
    public void removerDepartamento(String nomeDepartamento) {
        departamentos.remove(nomeDepartamento);
    }
    
    public int qtdeDepartamentosGerenciados() {
        return departamentos.size();
    }
    
    @Override
    public double getBonus() {
        double bonus = (this.getSalario() * 4) + 3000 * qtdeDepartamentosGerenciados();
        this.setSalario(this.getSalario() + bonus);
        return bonus;
    }
}
