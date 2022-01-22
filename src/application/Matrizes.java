package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas e colunas da matriz: ");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		System.out.println("");
		
		for (int linhas = 0; linhas < n; linhas ++) {
			for (int colunas = 0; colunas < n; colunas ++) {
				matriz[linhas][colunas] = sc.nextInt();
			}
		}
		
		System.out.println("Numeros na diagonal: ");
		for(int i = 0; i<n; i++ ) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		int contagem = 0;
		for (int linha = 0; linha < n; linha ++) {
			for (int coluna = 0; coluna < n; coluna ++) {
				if (matriz[linha][coluna] < 0) {
					contagem++;
				}
			}
		}
		
		System.out.println("Números negativos: " + contagem);
		sc.close();

	}

}
