package br.com.tecnicoqi.logica.aulas;

public class Cliente {
	private String nome;
	private String cpf;
	private byte interesse;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public byte getInteresse() {
		return interesse;
	}
	public void setInteresse(byte interesse) {
		this.interesse = interesse;
	}
	
	public String toString(){
		String texto;
		switch(this.interesse){
			case 1:  texto = "Pagamento de conta";
				break;
			case 2:  texto = "Recebimento de salário";
				break;
			default: texto = "Outro";
		}
		
		return "\nNome: " +nome+ ", CPF: " +cpf+ ", Interesse: " +texto+ '}'; 
	}
	
}
