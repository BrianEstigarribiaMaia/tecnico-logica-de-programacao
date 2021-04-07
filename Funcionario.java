package br.com.tecnicoqi.logica.aulas;

public class Funcionario {

	private String nome;
	private double salarioBase;
	
	public void dobrarSalario(){
		this.salarioBase = this.salarioBase * 2;
	}
	
	public double calcularFerias(){
		//salario acrescido de um terço do salario
		return this.salarioBase * 1.33;
	}
	
	public void descontarAdiantamento(double valor){
		this.salarioBase = this.salarioBase - valor;
	}
	
	public double calcularHorasExtras(double totalDeHoras){
		//horas exter valem o dobro das horas normais 
		return this.salarioBase/220 * 2 * totalDeHoras;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
}
