package senha;

import java.util.Scanner;

public class Senha_Concessionaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 123;
		int senhaEscrita;
		int opcao;
		int carro;
		int pagamento;
		int quantidade;
		String nome;
		String telefone;
		String endereco;
		String cor;
		String acessorio;
		
		System.out.println("---Concessionaria Campano---");
		System.out.println("Seja Bem Vindo de Volta!");
		
		do {
		System.out.println("Digite a sua senha: ");
		senhaEscrita = sc.nextInt();
		
		if(senhaEscrita == senha) {
			System.out.println("SENHA CORRETA");
			
		}else {
			System.out.println("ERRO DE SENHA");
			System.out.println("TENTE NOVAMENTE\n");
			
		}
		
		} while(senhaEscrita != 123);
		
		
		do {
		System.out.println("\n------MENU------");
		System.out.println("\nEscolha uma opcao:\n1 - Cadastro\n2 - Comprar seu carro\n3 - Comprar seu acessorio\n ");
		opcao = sc.nextInt();
		
		switch(opcao){
		
		case 1:
			System.out.println("Digite seu nome: ");
			nome = sc.nextLine();
			sc.nextLine();
			
			System.out.println("\nDigite seu telefone: ");
			telefone = sc.nextLine();
			
			System.out.println("\nDigite seu endereco: ");
			endereco = sc.nextLine();
			
			
			break;
			
		case 2: 
			System.out.println("\nEscolha um  carro:\n1 - Zentorno\n2 - Grand siena\n3 - Upezinho ");
			carro = sc.nextInt();
			
			System.out.println("\nDigite a cor do carro (Exemplo: preto): ");
			cor = sc.nextLine();
			sc.nextLine();
			
			System.out.println("\nEscolha a forma de pagamento:\n1 - Debito\n2 - Credito\n3 - Cheque\n4 - Financiar");
			pagamento = sc.nextInt();
			
			break;
		
		case 3: 
			System.out.println("Escolha o acessorio do seu carro:");
			acessorio = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Escolha a quantidade desse acessorio:");
			quantidade = sc.nextInt();
		}	
		
		}while(opcao != 4);
		
		sc.close();
	}

}
