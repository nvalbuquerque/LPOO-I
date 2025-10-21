import java.util.Scanner;

public class Pessoa {
    public String nome;
    public int idade;
    public String endereco;
    
    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    public int fazAniversario () {
        idade++;
        return idade;
    }
    
    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		String nome = scanner.nextLine();
		System.out.println("\nDigite a idade da pessoa: ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		System.out.println("\nDigite o endereço da pessoa: ");
		String endereco = scanner.nextLine();
		
		Pessoa pessoa1 = new Pessoa(nome, idade, endereco);
		
		System.out.println("\nDados inseridos:");
		pessoa1.imprime();
		
		System.out.println("\nA idade de " + pessoa1.nome + " em 2026 é de " + pessoa1.fazAniversario() + ".");
		System.out.println("\nA idade de " + pessoa1.nome + " em 2027 é de " + pessoa1.fazAniversario() + ".");
		System.out.println("\nA idade de " + pessoa1.nome + " em 2028 é de " + pessoa1.fazAniversario() + ".");
	}
}
