package br.com.tecnicoqi.logica.aulas;
import java.util.ArrayList;


public class FilaDeAtendimento {

	private ArrayList<Cliente> fila;
	
	public FilaDeAtendimento(){
		this.fila = new ArrayList<>();
	}

	public ArrayList<Cliente> getFila() {
		return fila;
	}
	public void setFila(ArrayList<Cliente> fila) {
		this.fila = fila;
	}
	
	public void adicionarCliente(Cliente cliente){
		this.fila.add(cliente);
	}
	
	public int obterQuantidadeDeClientes(){
		return this.fila.size();
	}
	
	public Cliente atenderCliente(){
		Cliente cliente1 = this.fila.get(0);
		this.fila.remove(0);
		return cliente1;
	}
	
	public void apagarTodos(){
		this.fila.clear();
	}
	
	public Cliente pesquisarPeloCPF(String cpf){
		Cliente cliente2 = null;
		for(int i = 0; i < this.fila.size(); i++){
			if(this.fila.get(i).getCpf().equals(cpf)){
				cliente2 = this.fila.get(i);
			}
		}
		return cliente2;
	}
	
	public ArrayList<Cliente> pesquisarClientePeloInteresse(byte interesse){
		ArrayList<Cliente> listaInteresse = new ArrayList<>();
		for(int i = 0; i < this.fila.size(); i++){
			if(this.fila.get(i).getInteresse() == interesse){
				listaInteresse.add(this.fila.get(i));
			}
		}
		return listaInteresse;
	}
	
	public String toString(){
		return "Fila de atendimento\n" + fila;
	}
	
}
