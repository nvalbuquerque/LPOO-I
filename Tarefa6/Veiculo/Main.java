import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos veiculos deseja cadastrar?");
		int max = scanner.nextInt();
		scanner.nextLine();
		
		Veiculo[] veiculos = new Veiculo[max];
		int i = 0;
		
		while (i < max) {
		    System.out.println("Digite a tipo de veiculo a ser cadastrado:\n");
    		System.out.println("1 - Carro\n");
    		System.out.println("2 - Trem\n");
    		System.out.println("3 - Aviao\n");
    		System.out.println("4 - Barco\n");
    		
    		int op = scanner.nextInt();
    		scanner.nextLine();
    		
    		int inputId;
            String inputModelo;
            String inputCor;
            int inputAnoModelo;
            String inputNome;
    		
    		switch(op) {
    		  case 1:
    		      System.out.println("Cadastro do carro.");
    		      
    		      System.out.println("Informe o ID do veiculo:");
    		      inputId = scanner.nextInt();
    		      scanner.nextLine();
    		      
    		      System.out.println("Informe o modelo do veiculo:");
    		      inputModelo = scanner.nextLine();
    		      
    		      System.out.println("Informe a cor do veiculo:");
    		      inputCor = scanner.nextLine();
    		      
    		      System.out.println("Informe o ano do modelo do veiculo:");
    		      inputAnoModelo = scanner.nextInt();
    		      scanner.nextLine();
    		      
    		      System.out.println("Informe a placa do veiculo:");
    		      String inputPlaca = scanner.nextLine();
    		      
    		      System.out.println("Informe a quilometragem do veiculo:");
    		      double inputQuilometragem = scanner.nextDouble();
    		      scanner.nextLine();
    		      
    		      System.out.println("Informe o nome do veiculo:");
    		      inputNome = scanner.nextLine();
    		      
    		      System.out.println("Informe o numero de portas do veiculo:");
    		      int inputNumeroPortas = scanner.nextInt();
    		      scanner.nextLine();
    		      
    		      System.out.println("Informe o tipo de combustivel do veiculo:");
    		      String inputTipoCombustivel = scanner.nextLine();

    		      veiculos[i] = new Carro(inputId, inputModelo, inputCor, inputAnoModelo, 
    		      inputPlaca, inputQuilometragem, inputNome, inputNumeroPortas, 
    		      inputTipoCombustivel);
    		      
    		      i++; 
    		      
    		      System.out.println("Veiculo terrestre cadastrado com sucesso!");
    		      
    		      break;
    		  case 2:
    		        System.out.println("Cadastro do trem.");
                    
                    System.out.println("Informe o ID do veiculo:");
                    inputId = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Informe o modelo do veiculo:");
                    inputModelo = scanner.nextLine();
                    
                    System.out.println("Informe a cor do veiculo:");
                    inputCor = scanner.nextLine();
                    
                    System.out.println("Informe o ano do modelo do veiculo:");
                    inputAnoModelo = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Informe a placa do veiculo:");
                    String inputPlacaTrem = scanner.nextLine();
                    
                    System.out.println("Informe a quilometragem do veiculo:");
                    double inputQuilometragemTrem = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.println("Informe o nome do trem:");
                    inputNome = scanner.nextLine();
                    
                    System.out.println("Informe o numero de vagoes:");
                    int inputNumeroVagoes = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Informe o comprimento do trilho:");
                    double inputComprimentoTrilho = scanner.nextDouble();
                    scanner.nextLine();

                    veiculos[i] = new Trem(inputId, inputModelo, inputCor, inputAnoModelo, 
                    inputPlacaTrem, inputQuilometragemTrem, inputNome, inputNumeroVagoes, 
                    inputComprimentoTrilho);
                    
                    i++; 
                    System.out.println("Trem cadastrado com sucesso!");
                    break;
    		  case 3:
    		      System.out.println("Cadastro do aviao.");
    		      
    		      System.out.println("Informe o ID do veiculo:");
    		      inputId = scanner.nextInt();
    		      scanner.nextLine();
    		      
    		      System.out.println("Informe o modelo do veiculo:");
    		      inputModelo = scanner.nextLine();
    		      
    		      System.out.println("Informe a cor do veiculo:");
    		      inputCor = scanner.nextLine();
    		      
    		      System.out.println("Informe o ano do modelo do veiculo:");
    		      inputAnoModelo = scanner.nextInt();
    		      scanner.nextLine();
    		      
    		      System.out.println("Informe o registro aeronatico do veiculo:");
    		      String inputRegistroAeronautico = scanner.nextLine();
    		      
    		      System.out.println("Informe as horas de voo do veiculo:");
    		      double inputHorasVoo = scanner.nextDouble();
    		      scanner.nextLine();
    		      
    		      System.out.println("Informe o nome do veiculo:");
    		      inputNome = scanner.nextLine();
    		      
    		      System.out.println("Informe a companhia aerea do veiculo:");
    		      String inputCompanhiaAerea = scanner.nextLine();
    		      
    		      System.out.println("Informe o peso maximo para decolagem do veiculo:");
    		      double inputPesoMaxDecolagem = scanner.nextDouble();
    		      scanner.nextLine();
    		      
    		      veiculos[i] = new Aviao(inputId, inputModelo, inputCor, inputAnoModelo, 
    		      inputRegistroAeronautico, inputHorasVoo, inputNome, inputCompanhiaAerea, 
    		      inputPesoMaxDecolagem);
    		      
    		      i++; 
    		      
    		      System.out.println("Veiculo aereo cadastrado com sucesso!");
    		      
    		      break;
    		  case 4:
    		      System.out.println("Cadastro do barco.");
    		      
    		      System.out.println("Informe o ID do veiculo:");
    		      inputId = scanner.nextInt();
    		      scanner.nextLine();
    		      
    		      System.out.println("Informe o modelo do veiculo:");
    		      inputModelo = scanner.nextLine();
    		      
    		      System.out.println("Informe a cor do veiculo:");
    		      inputCor = scanner.nextLine();
    		      
    		      System.out.println("Informe o ano do modelo do veiculo:");
    		      inputAnoModelo = scanner.nextInt();
    		      scanner.nextLine();
    		      
    		      System.out.println("Informe a bandeira do veiculo:");
    		      String inputBandeira = scanner.nextLine();
    		      
    		      System.out.println("Informe as horas do motor do veiculo:");
    		      double inputHorasMotor = scanner.nextDouble();
    		      scanner.nextLine();
    		      
    		      System.out.println("Informe o nome do veiculo:");
    		      inputNome = scanner.nextLine();
    		      
    		      System.out.println("Informe o material do veiculo:");
    		      String inputMaterial = scanner.nextLine();
    		      
    		      System.out.println("Informe o tipo do casco do veiculo:");
    		      String inputTipoCasco = scanner.nextLine();
    		      
    		      veiculos[i] = new Barco(inputId, inputModelo, inputCor, inputAnoModelo, 
    		      inputBandeira, inputHorasMotor, inputNome, inputMaterial, inputTipoCasco);
    		      
    		      i++; 
    		      
    		      System.out.println("Barco cadastrado com sucesso!");
    		      
    		      break;
    		  default:
    		    System.out.println("Opcao invalida.");
    		    break;
    		}
	    }
	    
	    System.out.print("\nVeiculos cadastrados:\n");
	    for(int j = 0; j < i; j++) {
	        System.out.println(veiculos[j].getInfos());
	    }
	    
	    System.out.println("\nMovimentos dos veiculos:\n");
        for(int j = 0; j < i; j++) {
            veiculos[j].andar(); 
        }
	}
}