package entities;

import java.util.*;

import peopletype.*;

public class Company {

	private String nome;
	private String cnpj;
	
	private List<Funcionario> listaFuncionarios = new ArrayList<>();
	private List<Gerente> listaGerentes = new ArrayList<>();
	
	private List<Cliente> listaClientes = new ArrayList<>();
	
	public Company (String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	public void addFuncionario (Funcionario funcionario) {
		this.listaFuncionarios.add(funcionario);
	}
	
	public void addGerente (Gerente gerente) {
		this.listaGerentes.add(gerente);
	}
	
	public void addCliente (Cliente cliente) {
		this.listaClientes.add(cliente);
	}
	
	public void removeFuncionario(String nome) {
		for(Funcionario f : listaFuncionarios) {
			if(f.getNome() == nome) { listaFuncionarios.remove(f); }
		}
	}
	
	public void removeGerente(String nome) {
		for(Gerente g : listaGerentes) {
			if(g.getNome() == nome){ listaGerentes.remove(g); }
		}
	}
	
	public void removeCliente(String nome) {
		for(Cliente c : listaClientes) {
			if(c.getNome() == nome){ listaGerentes.remove(c); }
		}
	}
	
	public void printFuncList () {
		for(Funcionario f : listaFuncionarios) {
			System.out.println(f.print());
		}
		
		System.out.printf("\n");
	}
	
	public void printGerenList () {
		for(Gerente g : listaGerentes) {
			System.out.println(g.print());
		}
		
		System.out.printf("\n");
	}
	
	public void printClientList () {
		for(Cliente c : listaClientes) {
			System.out.println(c.print());
		}
		
		System.out.printf("\n");
	}
	
}











