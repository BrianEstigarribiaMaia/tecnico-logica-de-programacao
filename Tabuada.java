package br.com.tecnicoqi.logica.aulas;

public class Tabuada {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String gerarTabuada(int multiplicador){
		return this.valor + " x " +multiplicador+ " = " +this.valor*multiplicador;
	}
	
	
}
