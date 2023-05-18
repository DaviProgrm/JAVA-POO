package visao;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Contato;
import persistencia.ContatoDAO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int op, i;
		ContatoDAO cDAO = new ContatoDAO();
		ArrayList<Contato> agenda = new ArrayList<Contato>();
		
		do {
			System.out.println("Menu Principal");
			System.out.println("1 - Buscar");
			System.out.println("2 - Incluir");
			System.out.println("3 - Alterar");
			System.out.println("4 - Excluir");
			System.out.println("5 - Relatório");
			System.out.println("6 - Sair");
			op = teclado.nextInt();
			switch(op) {
				case 1: System.out.println("Buscando Contato...");
				break;
				case 2: System.out.println("Incluindo Contato...");
				break;
				case 3: System.out.println("Alterando Contato...");
				break;
				case 4: System.out.println("Excluindo Contato...");
				break;
				case 5: System.out.println("Relatório de Contatos...");
				agenda = cDAO.emitirRelatorio();
				for(i=0; i<agenda.size(); i++) {
					System.out.println("\t"+agenda.get(i).getId()+"\t"+agenda.get(i).getNome()+"\t"+
							agenda.get(i).getTelefone()+"\t"+agenda.get(i).getEmail());
				}
				break;
				case 6: System.out.println("Fim de Programa");
				break;
				default: System.out.println("Opção inválida"); 
			}
		}while(op!=6);
		
	}

}
