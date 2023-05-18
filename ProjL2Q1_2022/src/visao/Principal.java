/*
 * 1.	Sejam A e B dois vetores contendo 10 elementos inteiros.  Elabore um algoritmo que:
- Leia A e B. 
- Calcule a soma dos elementos de A.
- Crie o vetor C contendo a soma dos elementos de mesma posição dos vetores A e B. 

 */

package visao;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		int op, soma=0, i;
		
		System.out.println("Digite: \n1) para solução com vetor e \n2) para solução com ArrayList: ");
		op = teclado.nextInt();
		
		if(op==1) {
			int[] A = new int[10];
			int[] B = new int[10];
			int[] C = new int[10];
			
			System.out.println("Digite os elementos de A: ");
			for(i=0; i<A.length; i++) {
				System.out.print("A["+i+"]: ");
				A[i] = teclado.nextInt();
			}
			
			System.out.println("Digite os elementos de B: ");
			for(i=0; i<B.length; i++) {
				System.out.print("B["+i+"]: ");
				B[i] = teclado.nextInt();
			}	
			
			for(i=0; i<A.length; i++) {
				soma += A[i];
			}
			System.out.println("Soma dos elementos de A: "+soma);
			
			for(i=0; i<A.length; i++) {
				C[i] = A[i] + B[i];
			}
			
			System.out.print("\nVetor A: ");
			for(i=0; i<A.length; i++) {
				System.out.print(A[i]+" ");
			}	
			System.out.print("\nVetor B: ");
			for(i=0; i<B.length; i++) {
				System.out.print(B[i]+" ");
			}	
			System.out.print("\nVetor C: ");
			for(i=0; i<C.length; i++) {
				System.out.print(C[i]+" ");
			}	
			
		}else {
			ArrayList<Integer> A = new ArrayList<Integer>();
			ArrayList<Integer> B = new ArrayList<Integer>();
			ArrayList<Integer> C = new ArrayList<Integer>();
			
			System.out.println("Digite os elementos de A: ");
			for(i=0; i<10; i++) {
				System.out.print("A["+i+"]: ");
				A.add(teclado.nextInt());
			}
			
			System.out.println("Digite os elementos de B: ");
			for(i=0; i<10; i++) {
				System.out.print("B["+i+"]: ");
				B.add(teclado.nextInt());
			}	
			
			for(i=0; i<10; i++) {
				soma += A.get(i).intValue();
			}
			System.out.println("Soma dos elementos de A: "+soma);
			
			for(i=0; i<10; i++) {
				C.add(A.get(i).intValue() + B.get(i).intValue());
			}
			
			System.out.print("\nVetor A: ");
			for(i=0; i<10; i++) {
				System.out.print(A.get(i).intValue()+" ");
			}	
			System.out.print("\nVetor B: ");
			for(i=0; i<10; i++) {
				System.out.print(B.get(i).intValue()+" ");
			}	
			System.out.print("\nVetor C: ");
			for(i=0; i<10; i++) {
				System.out.print(C.get(i).intValue()+" ");
			}	
			
		}
	}

}
