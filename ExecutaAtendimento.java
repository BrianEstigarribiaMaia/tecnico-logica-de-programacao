package br.com.tecnicoqi.logica.aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecutaAtendimento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		FilaDeAtendimento fila = new FilaDeAtendimento();
		
		byte escolha;
		do{
			System.out.println("DIGITE SUA OPÇÃO:");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Ver cliente na fila");
			System.out.println("3 - Ver quantos clientes estão na fila");
			System.out.println("4 - Atender um cliente");
			System.out.println("5 - Pesquisar cliente pelo CPF");
			System.out.println("6 - Pesquisar cliente pelo interesse");
			System.out.println("7 - Retirar todos os clientes da fila");
			System.out.println("0 - Sair");
			escolha = ler.nextByte();
			
			switch (escolha) {
				case 1:
					Cliente c1 = new Cliente();
					System.out.println("Informe o nome do cliente: ");
					c1.setNome(ler.next());
					do{
						System.out.println("Informe o CPF: ");
						c1.setCpf(ler.next());
						if(c1.getCpf().length() != 11){
							System.out.println("Erro CPF inválido!");
						}
					}while(c1.getCpf().length() != 11);
					do{
						System.out.println("Informe o interesse do cliente: ");
						System.out.println("1 - Pagamento de contas");
						System.out.println("2 - Recebimento de salário");
						System.out.println("3 - Outros");
						c1.setInteresse(ler.nextByte());
						if(c1.getInteresse() < 1 | c1.getInteresse() > 3){
							System.out.println("Erro, Interesse inválido!");
						}
					}while(c1.getInteresse() < 1 | c1.getInteresse() > 3);
					fila.adicionarCliente(c1);
					System.out.println("Cliente adicionado na fila com sucesso.");
					break;
				case 2:
					if(fila.getFila().isEmpty()){
						System.out.println("Não há clientes na fila.");
					}else{
						System.out.println(fila);
					}
					break;
				case 3:
					System.out.println("Total de clientes na fila: " +fila.obterQuantidadeDeClientes());
					break;
				case 4:
					if(fila.getFila().isEmpty()){
						System.out.println("Não há clientes para atender.");
					}else{
						System.out.println("Cliente: " +fila.atenderCliente());
					}
					break;
				case 5:
					System.out.println("Informe o CPF do cliente: ");
					String nome = ler.next();
					Cliente resultado = fila.pesquisarPeloCPF(nome);
					if(resultado == null){
						System.out.println("Não há este cliente na fila.");
					}else{
						System.out.println(resultado);
					}
					break;
				case 6:
					System.out.println("Informe o interesse para listar os clientes: ");
					System.out.println("1 - Pagar contas, 2 - Receber salário e 3 - Outros");
					byte pesquisa = ler.nextByte();
					ArrayList<Cliente> lista = fila.pesquisarClientePeloInteresse(pesquisa);
					if(lista.isEmpty()){
						System.out.println("Não há clientes com esse interesse.");
					}else{
						System.out.println(lista);
					}
					break;
				case 7:
					if(fila.getFila().isEmpty()){
						System.out.println("Não há clientes na fila.");
					}else{
						fila.apagarTodos();
						System.out.println("Clientes removidos da fila.");
					}
					break;
				case 0: System.out.println("Sistema Encerrado!");
					break;
				default: System.out.println("Opção inválida!");
					break;
			}
		}while(escolha != 0);
		ler.close();
	}
}
