package br.com.tecnicoqi.logica.aulas;

import java.util.Scanner;

public class ExecutaTabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Tabuada t1 = new Tabuada();
		System.out.println("Informe um número para ver sua tabuada: ");
		t1.setValor(ler.nextInt());
		
		for(int multiplicador= 1; multiplicador<=10;multiplicador++){
			System.out.println(t1.gerarTabuada(multiplicador));
		}
		ler.close();
	}

}
