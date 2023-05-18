package dominio;

public class C4 extends C2{
	
	private int atributo4;

	public C4(int atributo4, int atributo2, int atributo1) {
		super(atributo1, atributo2);
		this.atributo4 = atributo4;
		
	}

	
	public int metodo1(){
		int i = 10;
		return i;
	}
	
	public int getAtributo4() {
		return atributo4;
	}

	public void setAtributo4(int atributo4) {
		//inserir em atributo4 a soma de atributo1 e atributo 2
		this.atributo4 = super.getAtributo1() + super.getAtributo2();
	}
	

	public int meuMetodo(String y, int x) {
		System.out.println("estou executando o metodo de c4");
		return 0;
	}
	public void meuMetodo(int x2, String y2) {
		System.out.println("estou executando o metodo SOBRECARREGADO de c4");
	}	
}
