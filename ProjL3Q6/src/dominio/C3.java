package dominio;

//Implemente duas classes concretas C2 e C3, ambas herdando de C1;
public class C3 extends C1 implements I1,I2{

	private int atributo3;
	

	public int metodo1() {
		int i = 10;
		return i;
	}

	public int getAtributo3() {
		return atributo3;
	}

	public void setAtributo3(int atributo3) {
		this.atributo3 = atributo3;
	}
	
	public int metodo1I1() {
		return 0;
	}
	public int metodo1I2() {
		return 0;
	}
	public int metodo2I2() {
		return 0;
	}
}
