package peopletype;

public class Pessoa {

	protected String nome;
	protected Integer idade = null;
	protected int cpf;
	
	public Pessoa (String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Pessoa(String nome, int cpf, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
	
}
