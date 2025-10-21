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
        System.out.println("Endereço: " + endereco + "\n");
    }
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3];
		
		for (int i = 0; i < pessoas.length; i++) {
		    System.out.println("Digite o nome da pessoa: ");
		    String nome = scanner.nextLine();
		    
		    System.out.println("Digite a idade da pessoa: ");
		    int idade = Integer.parseInt(scanner.nextLine());
		    
		    System.out.println("Digite o endereço da pessoa: ");
		    String endereco = scanner.nextLine();
		    
		    pessoas[i] = new Pessoa(nome, idade, endereco);
		}
		
		System.out.println("\nDados inseridos:");
        for(int i = 0; i < pessoas.length; i++) {
            pessoas[i].imprime(); 
            int novaIdade = pessoas[i].fazAniversario(); 
            System.out.println("A idade de " + pessoas[i].nome + " em 2026 será de " + novaIdade + ".\n");
        }
	}
}
