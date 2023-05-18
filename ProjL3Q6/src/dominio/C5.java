package dominio;

public class C5 extends C2 implements I1{

	private int atributo5;

	public C5() {
		super(0,0);
	}
	
	public int metodo1(){
		int i = 10;
		return i;
	}
	
	public int metodo1I1() {
		return 100;
	}
	
	public int getAtributo5() {
		return atributo5;
	}

	public void setAtributo5(int atributo5) {
		this.atributo5 = atributo5;
	}
	
}
