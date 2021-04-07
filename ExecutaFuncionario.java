package br.com.tecnicoqi.logica.aulas;

public class ExecutaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Pedro");
		f1.setSalarioBase(900);

		f1.dobrarSalario();
		f1.descontarAdiantamento(300);
		
		double ferias = f1.calcularFerias();
		double horasExtras = f1.calcularHorasExtras(10);
		
		System.out.println("Olá " +f1.getNome() + ", seu salário é de: " +f1.getSalarioBase());
		System.out.println("Você receberá de férias: "+ferias);
		System.out.println("O valor das suas horas extras são: "+horasExtras);
	}

}
