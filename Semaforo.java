package br.com.tecnicoqi.logica.aulas;

public class Semaforo {

	private String cor;

    public Semaforo(String cor){
    	this.cor = cor;
    }

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void sinalizarAtencao(){
		this.cor = "Amarelo";
	}
	
	public void sinalizarPare(){
		this.cor = "Vermelho";
	}

	public void sinalizarSiga(){
		this.cor = "Verde";
	}
	
	public String toString(){
		return "O semáforo está sinalizando: " +this.cor;
	}
}
