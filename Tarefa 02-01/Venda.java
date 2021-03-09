package Tarefa_02_01;

import java.time.LocalDate;
import java.util.List;

public class Venda {

	private int codigo;
	private LocalDate data;
	private List<Item> itens;
	
	public Venda(int codigo, LocalDate data, List<Item> itens) {
		this.codigo = codigo;
		this.data = data;
		this.itens = itens;
	}
	
	public double valorTotal() {
		double valorTotal = 0;
		
		for (Item item : itens)
			valorTotal += item.getValor();
		
		return valorTotal;
	}
	
	public void adicionarItem(Item item) {
		itens.add(item);
	}
	
	public void getQntItens() {
		int qnt = itens.size();
		System.out.println("Quantidade de itens na venda: " + qnt);
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public LocalDate getData() {
		return data;
	}
}
