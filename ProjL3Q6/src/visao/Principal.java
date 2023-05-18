package visao;

import dominio.C3;
import dominio.C4;
import dominio.C5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C4 objC4 = new C4(0, 1, 2);
		objC4.setAtributo4(0);
		System.out.println(""+objC4.getAtributo4());
		
		objC4.meuMetodo();
		objC4.meuMetodo(1, "um");
		
		C3 objC3 = new C3();
		System.out.println(objC3.metodo1());
		
		C5 objC5 = new C5();
		System.out.println(objC5.metodo1I1());
		
	}
	
	
	
	
	

}
