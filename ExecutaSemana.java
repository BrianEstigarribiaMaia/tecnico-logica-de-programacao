package br.com.tecnicoqi.logica.aulas;
import java.util.Scanner;

public class ExecutaSemana {

	public static void main(String[] args) {
		
		Scanner ler   = new Scanner(System.in);
		Semana semana = new Semana();
		
		System.out.println("Digite um número: ");
		semana.setDia(ler.nextByte());
		
		System.out.println("RESPOSTA");
		System.out.println(semana.verDiaDaSemana());
		ler.close();
	}

}
