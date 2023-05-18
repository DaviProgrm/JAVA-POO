package visao;

import dominio.Cachorro;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	
		Cachorro c1 = new Cachorro("cachorro sem nome", "nenhuma raça definida", 0);
		Cachorro c2;
		
		System.out.println("Nome do cachorro: "+c1.getNome());
		System.out.println("Raça: "+c1.getRaca());
		System.out.println("Idade: "+c1.getIdade());
		
		c1.setNome("Dinossauro");
		c1.setRaca("Yorkshire");
		c1.setIdade(1);

		System.out.println("Estado do objeto: "+c1.informarEstado());

		// outra solução
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o nome do cachorro: ");
		c1.setNome(teclado.nextLine());
		System.out.println("Digite a raça do cachorro: ");
		c1.setRaca(teclado.nextLine());
		System.out.println("Digite a idade do cachorro: ");
		c1.setIdade(teclado.nextInt());
		
		System.out.println("Estado do objeto c1: "+c1.informarEstado());
		
		c2 = c1.clonarCachorro();

		System.out.println("Estado do objeto c2: "+c2.informarEstado());
		
		if(c1.informarEstado().equals(c2.informarEstado())) {
			System.out.println("estados iguais");
		}else {
			System.out.println("estados diferentes");
		}
		
		
		System.out.println("c1 ="+c1);
		System.out.println("c2 ="+c2);
		
		if(c1.equals(c2)) {
			System.out.println("estados iguais");

		}else {
			System.out.println("estados diferentes");
		}
	}
}
