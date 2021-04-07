package br.com.tecnicoqi.logica.aulas;

public class Numero {

	private int valor;
	
	public Numero(){
		
	}
	public Numero(int valor){
		this.valor = valor;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

	public String verificarNumero(){
		if(this.valor %2==0 && this.valor >0){
			return "PAR POSITIVO";
		}else if(this.valor %2==0 && this.valor <0){
			return "PAR NEGATIVO";
		}else if(this.valor %2!=0 && this.valor >0){
			return "IMPAR POSITIVO";
		}else if(this.valor %2!=0 && this.valor <0){
			return "IMPAR NEGATIVO";
		}else{
			return "NULO";
		}
	}
	
	public int calcularFatorial(){
		
		int cont = 1;
		int fatorial = 1;
		
		/*while testa a condição no inicio do loop podendo não ser executado
		while(cont<=this.valor){
			fatorial *= cont;
			cont++;
		}*/
		
		//do while testa a condição no fim do loop e sempre executa o codigo pelo menos 1x
		do{
			fatorial *= cont;
			cont++;
		}while(cont<=this.valor);
		
		return fatorial;
	}
	
	public int calcularSomatorio(){
		int soma = 0;
		int contador = 1;
		
		do{
			soma += contador;
			contador++;
		}while(contador<=this.valor);
		
		return soma;
	}
	
	public int contarMultiplos(){
		int multiplos = 0;
		int contador = 1;
		
		do{
			if(this.valor%contador == 0){
				multiplos++;
			}
			contador++;
		}while(contador<=this.valor);
		
		return multiplos;
	}
	
	public String verificarPrimoOuComposto(){
		int contM = contarMultiplos();
		
		if(contM == 2){
			return this.valor + "É PRIMO";
		}else{
			return this.valor + "É COMPOSTO";
		}
	}
}
	

