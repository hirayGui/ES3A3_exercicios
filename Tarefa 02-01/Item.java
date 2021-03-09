package Tarefa_02_01;

public class Item {

	private int quantidade;
	private Produto produto;
	
	public Item (Produto produto, int qnt) {
		this.produto = produto;
		this.quantidade = qnt;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getValor() {
		return produto.getValor() * quantidade;
	}
}
