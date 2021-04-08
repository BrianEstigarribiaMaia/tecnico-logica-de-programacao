package br.com.tecnicoqi.logica.aulas;

import java.util.Scanner;

public class ExercutaPartida {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Set set1    = new Set();
		
		byte escolha;
		
		Time t1 = new Time();
		System.out.println("***** TIME 1 *****");
		System.out.print("Nome do Time 1:");
		t1.setNome(ler.nextLine());
		System.out.println("Técnico do Time 1:");
		t1.setTecnico(ler.nextLine());
		
		Time t2 = new Time();
		System.out.println("***** TIME 2 *****");
		System.out.println("Nome do Time 2:");
		t2.setNome(ler.nextLine());
		System.out.println("Técnico do Time 2:");
		t2.setTecnico(ler.nextLine());
		
		set1.setTime1(t1);
		set1.setTime2(t2);
		
		do{
			System.out.println(set1);
			System.out.println("1 - Marcar ponto para :"+t1.getNome());
			System.out.println("2 - Marcar ponto para :"+t2.getNome());
			escolha = ler.nextByte();
			
			switch(escolha){
				case 1: t1.pontuar();
						System.out.println("Ponto Para: " +t1.getNome());
					break;
				case 2: t2.pontuar();
						System.out.println("Ponto Para: " +t2.getNome());
					break;
			}
		}while(set1.continuarSet());
		
		System.out.println("Partida Encerrada!");
		System.out.println(set1);
		System.out.println("Vencedor: " +set1.obterVencedor());
		
		ler.close();
	}

}
