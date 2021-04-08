package br.com.tecnicoqi.logica.aulas;

public class Semana {

	private byte dia;

	public byte getDia() {
		return dia;
	}
	public void setDia(byte dia) {
		this.dia = dia;
	}
	
	public String verDiaDaSemana(){
		if(this.dia == 1){
			return "Domingo";
		}else if (this.dia == 2){
			return "Segunda-Feira";
		}else if (this.dia == 3){
			return "Terça-Feira";
		}else if (this.dia == 4){
			return "Quarta-Feira";
		}else if (this.dia == 5){
			return "Quinta-Feira";
		}else if (this.dia == 6){
			return "Sexta-Feira";
		}else if (this.dia == 7){
			return "Sábado";
		}else{
			return "Sem correspondência";
		}
	}
}
