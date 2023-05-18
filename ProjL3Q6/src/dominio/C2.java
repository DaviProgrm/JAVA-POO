package dominio;

//Implemente duas classes concretas C2 e C3, ambas herdando de C1;

public abstract class C2 extends C1{

	private int atributo2;
	
	public C2(int atributo2, int atributo1) {
		super(atributo1);
		this.atributo2 = atributo2;
	}
	
	public abstract int metodo1();

	public int getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}
	
	public void meuMetodo() {
		System.out.println("estou executando o metodo de c2");
	}
	
}
