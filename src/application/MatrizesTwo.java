package application;

import java.util.Scanner;

public class MatrizesTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of matriz line: ");
		int nLine = sc.nextInt();
		
		System.out.println("Enter the number of matriz colun: ");
		int nColun = sc.nextInt();
		
		int[][] matriz = new int [nLine][nColun];
		
		System.out.println("");
		
		for (int line = 0; line < nLine; line ++ ) {
			for (int colun = 0; colun < nColun; colun ++) {
				matriz[line][colun] = sc.nextInt(); 
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i<matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("position " + i + ", " + j + ":");
					if(j > 0){
						System.out.println("Left: " + matriz[i][j-1]);	
					}
					
					if(i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
				
			}
		}
		
		sc.close();

	}

}
