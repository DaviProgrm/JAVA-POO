//Implemente uma classe abstrata C1;
package dominio;

public abstract class C1 {
	private int atributo1;
	
	public C1(int atributo1) {
		this.atributo1 = atributo1;
	}
	public C1() {
		
	}
	
	public abstract int metodo1();
	
	public int getAtributo1() {
		return atributo1;
	}
	
	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}
	
	
}
