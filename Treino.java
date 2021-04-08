package br.com.tecnicoqi.logica.aulas;

import java.util.Arrays;

public class Treino {

	private String nomeDoAtleta;
	private double marcas [];
	
	public Treino(){
		this.marcas = new double [10];
	}


	public String getNomeDoAtleta() {
		return nomeDoAtleta;
	}


	public void setNomeDoAtleta(String nomeDoAtleta) {
		this.nomeDoAtleta = nomeDoAtleta;
	}


	public double[] getMarcas() {
		return marcas;
	}
	public void setMarcas(double[] marcas) {
		this.marcas = marcas;
	}
	
	public void armazenarMarca(int numero, double marca){
		if(numero >= 0 && numero < this.marcas.length){
			this.marcas[numero] = marca;
		}
	}
	
	public double calcularMediaDeMarcas(){
		double soma = 0;
		
		for(int i = 0; i < this.marcas.length; i++){
			soma += this.marcas[i];
		}
		return soma/this.marcas.length;
	}
	
	public double obterMaiorMarca(){
		double maior = this.marcas[0];
		
		for(int i = 1; i < this.marcas.length; i++){
			if(this.marcas[i] > maior){
				maior = this.marcas[i];
			}
		}
		return maior;
	}
	
	public String toString(){
		return "Atleta: " +this.nomeDoAtleta + "\nMarcas: " +Arrays.toString(this.marcas);
	}
}
