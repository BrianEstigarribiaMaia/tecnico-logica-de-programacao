package br.com.tecnicoqi.logica.aulas;
import java.util.Scanner;

public class ExecutaNumero {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		Numero numero = new Numero();
		
		System.out.println("Digite um número: ");
		numero.setValor(ler.nextInt());
		
		System.out.println(numero.verificarNumero());
		System.out.println(numero.calcularFatorial());
		
		ler.close();
	}

}
