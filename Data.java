package br.com.tecnicoqi.logica.aulas;

public class Data {

	private byte dia;
	private byte mes;
	private int ano;
	

	public byte getDia() {
		return dia;
	}
	public void setDia(byte dia) {
		this.dia = dia;
	}
	public byte getMes() {
		return mes;
	}
	public void setMes(byte mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int obterDias(){
		
		int totalDeDias;
		
		switch(this.mes){
		
			case 1: case 3: 
			case 5: case 7: 
			case 8: case 10:
			case 12: 
				totalDeDias = 31;
			break;
			case 4: case 6:
			case 9: case 11:
				totalDeDias = 30;
			break;
			case 2:
				totalDeDias = 28;
			break;
			default: totalDeDias = 0;
		}
		
		return  totalDeDias;
	}
	
	public String obterMes(){
		
		String nomeDoMes;
		
		switch(this.mes){
		
			case 1:  nomeDoMes = "Janeiro";  break;  case 2:  nomeDoMes = "Fevereiro"; break;
			case 3:  nomeDoMes = "Março";    break;  case 4:  nomeDoMes = "Abril";     break;
			case 5:  nomeDoMes = "Maio";     break;  case 6:  nomeDoMes = "Junho";     break;
			case 7:  nomeDoMes = "Julho";    break;  case 8:  nomeDoMes = "Agosto";    break;
			case 9:  nomeDoMes = "Setembrp"; break;  case 10: nomeDoMes = "Outubro";   break;
			case 11: nomeDoMes = "Novembro"; break;  case 12: nomeDoMes = "Dezembro";  break;
			default: nomeDoMes = "Nenhum mes para mostrar";
		}
		
		return  nomeDoMes;
	}
	
	public String toString(){
		return this.dia +"/"+ this.mes +"/"+ this.ano +
			   "\n O mes de "+obterMes()+ " tem " +obterDias()+ " dias.";
	}
}
