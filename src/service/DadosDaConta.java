package service;

public class DadosDaConta {
	
	int NumeroDaConta;
	String NomeDoTitular;
	double Saldo;
	double Taxa = 5.00;
	
	public void NumeroConta (int NumeroDaConta) {
		this.NumeroDaConta = NumeroDaConta;
	}
	
	public void NomeTitular (String NomeDoTitular) {
		this.NomeDoTitular = NomeDoTitular;
	}
	
	public void ContaDepositoSaldo (double Deposito) {
		this.Saldo = this.Saldo + Deposito; 
	}

	public void ContaSaque (double Saque) {
		
		this.Saldo = this.Saldo - (Saque + Taxa);
	}

	public int getNumeroDaConta() {
		return NumeroDaConta;
	}

	public String getNomeDoTitular() {
		return NomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		NomeDoTitular = nomeDoTitular;
	}

	public double getSaldo() {
		return Saldo;
	}

	@Override
	public String toString() {
		return "DadosDaConta ["
				+ "Account =" + NumeroDaConta 
				+ ", Holder =" + NomeDoTitular 
				+ ", Balance =" + Saldo
				+ "]";
	}

	

}
