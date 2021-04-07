package br.com.tecnicoqi.logica.aulas;

import java.util.ArrayList;

public class ListaDeCompra {

	private ArrayList<Produto> lista;
	
	public ListaDeCompra(){
		lista = new ArrayList<Produto>();
	}

	public ArrayList<Produto> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Produto> lista) {
		this.lista = lista;
	}
	
	public void adicionarProduto(Produto p1){
		this.lista.add(p1);
	}
	
	public void apagarTudo(){
		this.lista.clear();
	}
	
	public int obterQuantidadeDeProdutos(){
		return this.lista.size();
	}
	
	public double calcularTotalDaLista(){
		double soma = 0;
		
		for(int i = 0; i < this.lista.size(); i++){
			soma += this.lista.get(i).calcularTotal();
		}
		
		return soma;
	}
	
	public String toString(){
		return "Lista de compras {" + "lista = " +lista+  '}';
	}
}
