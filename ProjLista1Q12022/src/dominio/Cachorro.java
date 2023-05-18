package dominio;

public class Cachorro {
	private String nome;
	private String raca;
	private int idade;
	
	public Cachorro(String nome, String raca, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String informarEstado() {
		return nome+", "+raca+", "+idade;
	}
	public Cachorro clonarCachorro() {
		//Cachorro novoCachorro = new Cachorro(nome, raca, idade);
		//Cachorro novoCachorro = new Cachorro(getNome(), getRaca(), getIdade());
		Cachorro novoCachorro = new Cachorro(this.getNome(), this.getRaca(), this.getIdade());
		return novoCachorro;
	}
	
	public boolean equals(Cachorro c2Novo) {
		if((this.nome==c2Novo.getNome())&&
		(this.raca == c2Novo.getRaca())&&
		(this.idade == c2Novo.getIdade()))
			return true;
		else
			return false;
	}
	
	
}
