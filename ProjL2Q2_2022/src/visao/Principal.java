package visao;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Pedido;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Pedido p;
		ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
		
		int opcao, opcao2, totalPedidos=1, i, cod;
		boolean achou;
		String status;
		
		do {
			System.out.println("Menu Principal");
			System.out.println("1 - Fazer pedido");
			System.out.println("2 - Confirmar entrega");
			System.out.println("3 - Ver pedidos confirmados");
			System.out.println("4 - Ver pedidos entregues");
			System.out.println("5 - Sair");
			System.out.println("Qual a opção desejada?");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				p = new Pedido();
				System.out.println("Novo pedido");
				System.out.println("Digite a hora da compra: ");
				p.setHora(teclado.nextInt());
				teclado.nextLine(); //para suprimir o enter
				System.out.println("Digite o endereço de entrega: ");
				p.setEndEntrega(teclado.nextLine());
				System.out.println("Dados do pedido: "+p.getHora()+", "+p.getEndEntrega());
				System.out.println("Deseja 1-confirmar ou 2-alterar? ");
				opcao2 = teclado.nextInt();
				if(opcao2==2) {
					System.out.println("Digite a hora da compra: ");
					p.setHora(teclado.nextInt());
					teclado.nextLine(); //para suprimir o enter
					System.out.println("Digite o endereço de entrega: ");
					p.setEndEntrega(teclado.nextLine());
					System.out.println("Dados do pedido: "+p.getHora()+", "+p.getEndEntrega());
				}else {
					System.out.println("Pedido confirmado");
				}
				System.out.println("Qual a quantidade de botijões desejada? ");
				p.setQtdBotijoes(teclado.nextInt());
				teclado.nextLine(); //para suprimir o enter
				System.out.println("Total da compra: "+p.getTotalCompra());
				System.out.println("Hora de entrega: "+p.getHoraEntrega());
				System.out.println("Digite o cartão de crédito: ");
				p.setCartaoCredito(teclado.nextLine());
				p.CalcularCodPedido(totalPedidos);
				p.alterarStatus(); //pedido confirmado
				totalPedidos++; //errado erradíssimo
				listaPedidos.add(p);
				break;
			case 2:
				System.out.println("Digite o código do pedido que deseja localizar: ");
				cod = teclado.nextInt();
				achou = false;
				for(i=0; i<listaPedidos.size(); i++) {
					if(cod == listaPedidos.get(i).getCodigoPedido()) {
						//alterar o status para "entregue"
						listaPedidos.get(i).alterarStatus();
						achou = true;
					}
				}
				if(achou == false) {
					System.out.println("Pedido não localizado");
				}
				break;
			case 3:
			case 4:
				if(opcao==3)
					status = "confirmado";
				else
					status = "entregue";
				for(i=0; i<listaPedidos.size(); i++) {
					if(listaPedidos.get(i).getStatus()==status) {
						System.out.println(listaPedidos.get(i).estadoAtual());
					}
				}
				break;
			case 5:
				System.out.println("Fim de programa");
				break;
			default: System.out.println("Opção Inválida");	
			}
		}while(opcao!=5);
		
	}

}
