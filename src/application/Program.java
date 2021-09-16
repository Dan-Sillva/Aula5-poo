package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import peopletype.Cliente;
import peopletype.Funcionario;
import peopletype.Gerente;

public class Program {

	public static void main (String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		System.out.print("Digite o nome da sua empresa: ");
		String name = sc.nextLine();
		
		System.out.print("Digite o CNPJ da sua empresa: ");
		String cnpj = sc.next();		//Coloquei o cnpj como String pois como inteiro estava dando erro por causa do tamanho do numero.
		
		Company company = new Company(name, cnpj);
	
		System.out.printf("\n\n");
		System.out.print("Deseja cadastrar Gerente ? (1 - sim, 2 - não) ");
		int cad1 = sc.nextInt();
		
		while (cad1 == 1) {
			company.addGerente(cadastrarGerente(sc));
			
			System.out.print("Deseja cadastrar outro Gerente ? (1 - sim, 2 - não) ");
			cad1 = sc.nextInt();
		}
		
		System.out.printf("\n\n");
		System.out.print("Deseja cadastrar Funcionario ? (1 - sim, 2 - não) ");
		int cad2 = sc.nextInt();
		
		while (cad2 == 1) {
			company.addFuncionario(cadastrarFuncionario(sc));
			
			System.out.print("Deseja cadastrar outro Funcionario ? (1 - sim, 2 - não) ");
			cad2 = sc.nextInt();
		}
		
		System.out.printf("\n\n");
		System.out.print("Deseja cadastrar Cliente ? (1 - sim, 2 - não) ");
		int cad3 = sc.nextInt();
		
		while (cad3 == 1) {
			company.addCliente(cadastrarCliente(sc));
			
			System.out.print("Deseja cadastrar outro Cliente ? (1 - sim, 2 - não) ");
			cad3 = sc.nextInt();
		}
		
		System.out.printf("\n-Gerentes:\n");
		company.printGerenList();

		System.out.printf("\n-Funcionarios:\n");
		company.printFuncList();
		
		System.out.printf("\n-Clientes:\n");
		company.printClientList();
		
	}
	
	public static Gerente cadastrarGerente (Scanner sc) {
		
		System.out.printf("\n\n");
		
		System.out.print("Nome do gerente: ");
		String nome = sc.next();	//deixei como next pq nextLine estava com problema
	
		System.out.print("CPF do gerente: ");
		int cpf = sc.nextInt();
		
		System.out.print("Senha do Gerente: ");
		int senha = sc.nextInt();
		
		System.out.print("Quantidae de funcionarios do gerente: ");
		int qtdFuncionarios = sc.nextInt();
		
		System.out.printf("\n");
		
		return new Gerente(nome, cpf, senha, qtdFuncionarios);
	}
	
	public static Funcionario cadastrarFuncionario (Scanner sc) {
		
		System.out.printf("\n\n");
		
		System.out.print("Nome do funcionario: ");
		String nome = sc.next();	//deixei como next pq nextLine estava com problema
	
		System.out.print("CPF do funcionario: ");
		int cpf = sc.nextInt();
		
		System.out.print("Salario do funcionario: ");
		double salario = sc.nextDouble();
		
		System.out.printf("\n");
		
		return new Funcionario(nome, cpf, salario);
		
	}
	
	public static Cliente cadastrarCliente (Scanner sc) {
		
		System.out.printf("\n\n");
		
		System.out.print("Nome do cliente: ");
		String nome = sc.next();	//deixei como next pq nextLine estava com problema
	
		System.out.print("CPF do cliente: ");
		int cpf = sc.nextInt();
		
		System.out.print("Saldo do cliente: ");
		int saldo = sc.nextInt();
		
		System.out.print("Limite do cliente: ");
		double limite = sc.nextDouble();
		
		System.out.print("Cheque Especial: ");
		double chequeEspecial = sc.nextDouble();
		
		System.out.printf("\n");
		
		return new Cliente(nome, cpf, saldo, limite, chequeEspecial);
	}
	
}



