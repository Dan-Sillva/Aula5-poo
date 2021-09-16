package peopletype;

public class Funcionario extends Pessoa{

	private double salario;

	public Funcionario(String nome, int cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
	}
	
	public Funcionario(String nome, int cpf, int idade, double salario) {
		super(nome, cpf, idade);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String print () {
		return ("[Nome: "+nome+"][CPF: "+cpf+"][Idade: "+idade+"][Salario: "+ salario+"]");
	}
	
}
