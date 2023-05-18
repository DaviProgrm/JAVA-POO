package dominio;

public class Pedido {
	private int hora;
	private String endEntrega;
	private int qtdBotijoes;
	private float totalCompra;
	private int horaEntrega;
	private String cartaoCredito;
	private String status;
	private int codigoPedido;
	
	public void setHora(int hora) {
		this.hora = hora;
		calcularHoraEntrega();
	}
	public int getHora() {
		return hora;
	}
	public void setEndEntrega(String endEntrega) {
		this.endEntrega =  endEntrega;
	}
	public String getEndEntrega() {
		return endEntrega;
	}
	public int getQtdBotijoes() {
		return qtdBotijoes;
	}
	public void setQtdBotijoes(int qtdBotijoes) {
		this.qtdBotijoes = qtdBotijoes;
		calcularTotalCompra() ;
	}
	public void calcularTotalCompra() {
		totalCompra = qtdBotijoes*60; // cada botijão custa 60 reais
	}
	public float getTotalCompra() {
		return totalCompra;
	}
	public void calcularHoraEntrega() {
		horaEntrega = hora + 6;
		if(horaEntrega>24) {
			horaEntrega = horaEntrega-24;
		}
	}
	public int getHoraEntrega() {
		return horaEntrega;
	}
	public String getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public void alterarStatus() {
		if(status=="confirmado")
			status = "entregue";
		else
			status = "confirmado";
	}
	public void CalcularCodPedido(int codigo) {
		codigoPedido = codigo;
	}
	public int getCodigoPedido() {
		return codigoPedido;
	}
	public String getStatus() {
		return status;
	}
	
	public String estadoAtual() {
		return hora + ", " + endEntrega+ ", " +qtdBotijoes+ ", " +totalCompra
				+ ", " +horaEntrega+ ", " +cartaoCredito+ ", " +status
				+ ", " +codigoPedido;
	}
}






