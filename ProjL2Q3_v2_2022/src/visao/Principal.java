package visao;

import java.util.Scanner;

import dominio.Robo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int[][] sala = new int[20][40];
		int[] posicaoAtual = new int[2];
		int i, j, op=5;
		
		Robo r1 = new Robo(0, 0, 1);
		
		do {
			//mostrar a sala
			posicaoAtual = r1.mostrarPosicaoAtual();
			sala[posicaoAtual[0]][posicaoAtual[1]] = 1;
			
			System.out.println("Sala: ");
			for(i=0; i<sala.length; i++) {
				for(j=0; j<sala[i].length; j++) {
					System.out.print(sala[i][j]+" ");
				}
				System.out.println();
			}
			sala[posicaoAtual[0]][posicaoAtual[1]] = 0;
			
			System.out.println("1 - Andar para frente");
			System.out.println("2 - Andar para trás");
			System.out.println("3 - Andar para direita");
			System.out.println("4 - Andar para esquerda");
			System.out.println("5 - Sair");
			System.out.println("Qual a opção desejada? ");
			op = teclado.nextInt();
			
			switch(op) {
				case 1: r1.andarFrente();
				break;
				case 2: r1.andarTras();
				break;
				case 3: r1.andarDireita();
				break;
				case 4: r1.andarEsquerda();
				break;
				case 5: System.out.println("Fim de programa");
				break;
				default: System.out.println("Opção inválida");
			}
			
		}while(op!=5);
		
		
		
	}

}
