package service;

import java.util.Locale;
import java.util.Scanner;

public class CalcularMediaDaTurma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as três notas da turma, para calcular a média: ");
		int notaUm = sc.nextInt();
		int notaDois = sc.nextInt();
		int notaTres = sc.nextInt();

		int MediaDaTurma = (notaUm + notaDois + notaTres) / 3;

		System.out.println("A media total da turma é " + MediaDaTurma);

		if (MediaDaTurma < 5) {
			System.out.println("Reprovado");
		}
		else if (MediaDaTurma <= 7) {
			System.out.println("Exame ");
		}

		else if (MediaDaTurma > 7) {
			System.out.println("Aprovado");
		}
		sc.close();
	}
}
