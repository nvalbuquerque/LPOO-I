///// RASCUNHO

// FUNCIONARIO
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

// GERENTE

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
        this.setSalario = (this.getSalario() + bonus);
        return bonus;
    }
    
    public List<String> getFuncionariosGerenciados() {
        return new ArrayList<>(funcionariosGerenciados);
    }
}

// DIRETOR

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
    
    public double getBonus() {
        double bonus = (this.getSalario() * 4) + 3000 * qtdeDepartamentosGerenciados();
        this.setSalario = (this.getSalario() + bonus);
        return bonus;
    }
}

// ANALISTA

public class Analista extends Funcionario {
    private String gerente;
    private String departamento;
    
    public Analista (String nome, int cpf, String endereco, double salario, String gerente, String departamento) {
        super(nome, cpf, endereco, salario);
        this.gerente = gerente; 
        this.departamento = departamento;
    }
    
    public String getGerente() {
        return this.gerente;
    }
    
    public double getBonus() {
        double bonus = this.getSalario();
        this.setSalario = (this.getSalario() + bonus);
        return bonus;
    }
}

// PROGRMADOR

public class Programador extends Funcionario {
    private String gerente;
    private String departamento;
    
    public Programador (String nome, int cpf, String endereco, double salario, String gerente, String departamento) {
        super(nome, cpf, endereco, salario);
        this.gerente = gerente; 
        this.departamento = departamento;
    }

    public String getGerente() {
        return this.gerente;
    }
    
    public double getBonus() {
        double bonus = this.getSalario() * 0.8;
        this.setSalario = (this.getSalario() + bonus);
        return bonus;
    }
    
}

// AUXILIAR DE LIMPEZA

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
    

    public double getBonus() {
        double bonus = this.getSalario() * 0.5;
        this.setSalario = (this.getSalario() + bonus);
        return bonus;
    }
}

import java.util.Scanner;

public class SistemaRH {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

		System.out.println("Informações bicicletas:");

	}
}
