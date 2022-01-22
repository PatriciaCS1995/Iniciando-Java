package service;

import java.util.Locale;
import java.util.Scanner;

import util.QuartosDisponiveis;


public class AluguelPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		QuartosDisponiveis[] quartos = new QuartosDisponiveis[10];
		
		System.out.println("Digite a quantidade de quartos que serão alugados: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Digite os dados cadastrais de cada estudante: ");
			System.out.println("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			
			System.out.println("Digite o e-mail: ");
			String email = sc.nextLine();
			
			System.out.println("Digite o número do quarto alugado ");
			int room = sc.nextInt();
			
			quartos[room] = new QuartosDisponiveis(nome,email);
			
		}
			for (int i = 0; i<10; i++) {
			if (quartos[i] != null) {
				System.out.println("Atualização de dados: " + i + " , " + quartos[i]);
				}
			}
		
		
		sc.close();

	}

}
