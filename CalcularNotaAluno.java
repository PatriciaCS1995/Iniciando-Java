package service;

import java.util.Locale;
import java.util.Scanner;

import entity.Aluno;

public class CalcularNotaAluno {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	Aluno aluno = new Aluno();
	
	System.out.println("Digite o nome do aluno: ");
	aluno.nome = sc.nextLine();
	
	System.out.println("Informe as três notas do aluno " + aluno.nome);
	double notaUm = sc.nextDouble();
	double notaDois = sc.nextDouble();
	double notaTres = sc.nextDouble();
	
	aluno.CalculoMedia(notaUm, notaDois, notaTres);
	
	System.out.println("A media total do aluno é " + aluno.nota);
	
	if (aluno.nota < 60.00) {
	System.out.println("O aluno não passou de ano, faltou: " + aluno.nota);
}
	else {
		System.out.println("O aluno passou de ano: " + aluno.nota);
	}
	
	sc.close();
}
	
}
