package Estoque;

public class estoque {
	public String name;
	public int quantidade;
	public double valor;
	
	public double valorTotalNoEstoque() {
		return valor * quantidade;
	}
	
	public void addProdutos (int quantidade) {
		this.quantidade += quantidade;
	}
	
	public String toString() {
		return name
			+ ", "
			+ quantidade
			+ " quantidade"
			+ ", R$ "
			+ String.format("%.2f", valor);
	}
	
	
}
