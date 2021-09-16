package peopletype;

public class Cliente extends Pessoa{

	private double saldo;
	private double limite;
	private double chequeEspecial;
	
	public Cliente(String nome, int cpf, double saldo, double limite, double chequeEspecial) {
		super(nome, cpf);
		this.saldo = saldo;
		this.limite = limite;
		this.chequeEspecial = chequeEspecial;
	}
	
	public Cliente(String nome, int cpf,int idade, double saldo, double limite, double chequeEspecial) {
		super(nome, cpf, idade);
		this.saldo = saldo;
		this.limite = limite;
		this.chequeEspecial = chequeEspecial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public String print () {
		return ("[Nome: "+nome+"][CPF: "+cpf+"][Idade: "+idade+"][Saldo: "+ saldo+"][Limite: "+limite+"][Cheque Especial: "+chequeEspecial+"]");
	}
	
}







