package entity;

public class Aluno {
	
public String nome;
public double nota;
double NotaMin = 60.00;


public double CalculoMedia (double notaUm, double notaDois, double notaTres) {
	return this.nota = notaUm + notaDois + notaTres;
	

}
public double PontosFaltando() {
if (nota <= NotaMin) {
	return this.nota -= NotaMin;
}
else {
	return nota;
}

}
}



