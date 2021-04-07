package br.com.tecnicoqi.logica.aulas;
import java.util.Scanner;

//ToString

public class ExecutaData {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Data   data = new Data();
		
		System.out.println("Infome o dia: ");
		data.setDia(ler.nextByte());
		System.out.println("Informe o número do mês: ");
		data.setMes(ler.nextByte());
		System.out.println("Informe o ano: ");
		data.setAno(ler.nextInt());

		System.out.println("Visualizando a data"); 
		System.out.print(data);
		ler.close();
	}

}
