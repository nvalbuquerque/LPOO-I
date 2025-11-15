package sistemarh;

import java.util.Scanner;

public class SistemaRH {
        public static void imprimeRelatorio(Funcionario[] listaFuncionarios) {
            System.out.println("RELATÓRIO DE FUNCIONÁRIOS\n");
            
            for (Funcionario f : listaFuncionarios) {
                if (f == null) continue;
                
                System.out.println("Cargo: " + f.getClass().getSimpleName());
                System.out.println("Nome: " + f.getNome());
                System.out.println("CPF: " + f.getCpf());
                System.out.println("Endereço: " + f.getEndereco());
                System.out.println("Salário Atual: " + f.getSalario());

                double bonus = f.getBonus();
                System.out.println("Bônus anual: " + bonus);
                System.out.println("Salário após bônus anual: " + f.getSalario()+"\n");
            } 
        }
    
	public static void main(String[] args) {
                Gerente gerente1 = new Gerente("João", 54321, "Rua 1", 100000);
                Gerente gerente2 = new Gerente("José", 12345, "Rua 2", 100000);
                Gerente gerente3 = new Gerente("Carolina", 23456, "Rua 3", 100000);
                
                Diretor diretor1 = new Diretor("Maria", 67890, "Rua 4", 30000);
                Diretor diretor2 = new Diretor("Mariana", 78901, "Rua 5", 30000);
                
                Analista analista1 = new Analista("Henrique", 54321, "Rua 6", 5000, "João", "Financeiro");
                
                Programador programador1 = new Programador("Ana", 45678, "Rua 7", 8000, "José", "TI");
                
                AuxiliarLimpeza auxiliarlimpeza1 = new AuxiliarLimpeza("Carlos", 34567, "Rua 8", 3000, "Carolina", "Administrativo");
                AuxiliarLimpeza auxiliarlimpeza2 = new AuxiliarLimpeza("Joana", 76543, "Rua 9", 3000, "Carolina", "Administrativo");
                
                gerente1.adicionarFuncionario("Henrique");
                gerente2.adicionarFuncionario("Ana");
                gerente3.adicionarFuncionario("Carlos");
                gerente3.adicionarFuncionario("Joana");
                
                diretor1.adicionarDepartamento("Financeiro");
                diretor1.adicionarDepartamento("Comercial");
                diretor2.adicionarDepartamento("Administrativo");
                diretor2.adicionarDepartamento("Logistica");
                
                Funcionario[] lista = {gerente1, gerente2, gerente3, 
                    diretor1, diretor2, 
                    analista1, programador1, 
                    auxiliarlimpeza1, auxiliarlimpeza2};
                
                imprimeRelatorio(lista);
	}
}
