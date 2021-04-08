package br.com.tecnicoqi.logica.aulas;
import java.util.Scanner;

public class ExecutaSemaforo {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a cor inicial do semáforo: ");
		String cor = ler.nextLine();
		
		Semaforo semaforo = new Semaforo(cor);

		System.out.println(semaforo);
		ler.close();
	}

}
