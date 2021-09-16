package peopletype;

public class Gerente extends Pessoa {

	private int senha;
	private int quantidadeFuncionariosGerenciados;
	
	public Gerente(String nome, int cpf, int senha, int quantidadeFuncionariosGerenciados) {
		super(nome, cpf);
		this.senha = senha;
		this.quantidadeFuncionariosGerenciados = quantidadeFuncionariosGerenciados;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getQuantidadeFuncionariosGerenciados() {
		return quantidadeFuncionariosGerenciados;
	}

	public void setQuantidadeFuncionariosGerenciados(int quantidadeFuncionariosGerenciados) {
		this.quantidadeFuncionariosGerenciados = quantidadeFuncionariosGerenciados;
	}
	
	public String print () {
		return ("[Nome: "+nome+"][CPF: "+cpf+"][Idade: "+idade+"][Senha: "+senha+"][Quantidade de Funcionarios Gerenciados: "+quantidadeFuncionariosGerenciados+"]" );
	}
	
}
