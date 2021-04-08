package br.com.tecnicoqi.logica.aulas;

public class Pessoa {

	private String nome;
	private int dataDeNascimento;
	private double salario;
	private byte numeroDeFilhos;
	
	
	public int calcularIdade(int anoAtual){
		return anoAtual - this.dataDeNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(int dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public byte getNumeroDeFilhos() {
		return numeroDeFilhos;
	}
	public void setNumeroDeFilhos(byte numeroDeFilhos) {
		this.numeroDeFilhos = numeroDeFilhos;
	}
	
}
