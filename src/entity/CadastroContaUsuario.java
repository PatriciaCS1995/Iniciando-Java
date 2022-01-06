package entity;

import java.util.Locale;
import java.util.Scanner;

import service.DadosDaConta;

public class CadastroContaUsuario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DadosDaConta DadosConta = new DadosDaConta();
		
		System.out.println("Enter account number: ");
		int NumeroDaConta = sc.nextInt();
		DadosConta.NumeroConta(NumeroDaConta);
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String Nome = sc.nextLine();
		DadosConta.setNomeDoTitular(Nome);
		
		System.out.println("Is there na initial deposit (y/n)? ");
		char Resposta = sc.next().charAt(0);
		
		if ( Resposta == 'y') {
			System.out.println("Enter initial deposit value: ");
			double ValorDeposito = sc.nextDouble();
			DadosConta.ContaDepositoSaldo(ValorDeposito);
			System.out.println("Account data: " + DadosConta.toString());
		}
			if (Resposta == 'n')  {
				System.out.println("Account data: " + DadosConta.toString());
			}
			
			System.out.println("Enter a deposit value: ");
			double ValorDeposito = sc.nextDouble();
			DadosConta.ContaDepositoSaldo(ValorDeposito);
			System.out.println("Account data: " + DadosConta.toString());
			
		System.out.println("Enter a Whidraw value: ");
		double Saque = sc.nextDouble();
		DadosConta.ContaSaque(Saque);
		System.out.println("Account data: " + DadosConta.toString());
		sc.close();

	}

}
