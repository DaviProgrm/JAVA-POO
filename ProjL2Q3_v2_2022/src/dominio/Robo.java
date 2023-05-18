package dominio;

public class Robo {
	private int linha;
	private int coluna;
	private int passo;
	
	public Robo(int linha, int coluna, int passo) {
		this.linha = linha;
		this.coluna = coluna;
		this.passo = passo;
	}
	
	public int[] mostrarPosicaoAtual() {
		int[] coordenada = new int[2];
		coordenada[0] = linha;
		coordenada[1] = coluna;
		return coordenada;
	}
	
	public void andarFrente() {
		if(linha>0)
			linha--;
	}
	
	public void andarTras() {
		if(linha<19)
			linha++;
	}
			
	public void andarDireita() {
		if(coluna<39)
			coluna++;
	}
	
	public void andarEsquerda() {
		if(coluna>0)
			coluna--;
	}
}
