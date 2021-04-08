package br.com.tecnicoqi.logica.aulas;
import java.util.Scanner;

// Scanner

public class ExecutaPessoa {

	public static void main (String [] args){
		
		Scanner ler = new Scanner(System.in);
		Pessoa  p1  = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		p1.setNome(ler.nextLine());
		
		System.out.println("Digite seu ano de nascimento: ");
		p1.setDataDeNascimento(ler.nextInt());
		
		System.out.println("Digite a quantidade de filhos que você tem: ");
		p1.setNumeroDeFilhos(ler.nextByte());
		
		System.out.println("Digite seu salário: ");
		p1.setSalario(ler.nextDouble());
		
		System.out.println("Informe o ano atual: ");
		int anoAtual = ler.nextInt();
		
		int idade = p1.calcularIdade(anoAtual);
		
		System.out.println("Seu nome é: " +p1.getNome()+ ".");
		System.out.println("Você nasceu em: " +p1.getDataDeNascimento()+ ".");
		System.out.println("Você tem " +p1.getNumeroDeFilhos()+ " filhos.");
		System.out.println("Seu salário é: " +p1.getSalario());
		System.out.println("Sua idade é: " +idade+ "anos.");
		ler.close();
	}
}
