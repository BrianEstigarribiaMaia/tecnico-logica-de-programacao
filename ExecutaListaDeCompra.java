package br.com.tecnicoqi.logica.aulas;

import java.util.Scanner;

public class ExecutaListaDeCompra {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ListaDeCompra l1 = new ListaDeCompra();
		
		int op;
		do{
			
			System.out.println("DIGITE");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Visualizar Produtos");
			System.out.println("3 - Ver quantidade de Produtos");
			System.out.println("4 - Apagar todos os produtos");
			System.out.println("5 - Ver total de compras");
			System.out.println("0 - Sair");
			op = ler.nextInt();
			
			switch(op){
			case 1:
				Produto p1 = new Produto();
				
					System.out.println("Digite o nome do produto: ");
					p1.setNome(ler.next());
				
				do{
					System.out.println("Digite a quantidade: ");
					p1.setQuantidade(ler.nextInt());
					if(p1.getQuantidade() <= 0){
						System.out.println("Erro! Quantidade inválida!");
					}
				}while(p1.getQuantidade() <= 0);
				do{
					System.out.println("Digite o valor unitário: ");
					p1.setValorUnitario(ler.nextDouble());
					if(p1.getValorUnitario() <= 0){
						System.out.println("Erro! Valor inválido!");
					}
				}while(p1.getValorUnitario() <= 0);
				l1.adicionarProduto(p1);
				System.out.println("Cadastrado com sucesso!");
				break;
			case 2:
				if(l1.getLista().isEmpty()){
					System.out.println("Não há produtos");
				}else{
					System.out.println(l1);
				}
				break;
			case 3:
				System.out.println("Total de cadastros: " + l1.obterQuantidadeDeProdutos());
				break;
			case 4:
				if(l1.getLista().isEmpty()){
					System.out.println("Não há produtos para excluir.");
				}else{
					int confirma;
					System.out.println("Tem certeza que deseja EXCLUIR TUDO ?  1 - SIM / 2 - NÃO");
					confirma = ler.nextInt();
					if(confirma == 1){
						l1.apagarTudo();
						System.out.println("Produtos excluidos com sucesso.");
					}else{
						System.out.println("Opção cancelada.");
					}
				}
				break;
			case 5:
				System.out.println("Total da Lista R$: " +l1.calcularTotalDaLista());
				break;
			case 0:
				System.out.println("Sistema encerrado.");
				break;
			default: System.out.println("Opção Inválida!");
			}
			
		}while(op != 0);
		
		ler.close();
	}

}
