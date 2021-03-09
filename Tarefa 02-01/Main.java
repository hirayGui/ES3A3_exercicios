package Tarefa_02_01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Item> lista = new ArrayList<Item>();
		int op = 0, aux;
		LocalDate data = LocalDate.now();

		Scanner s = new Scanner(System.in);

		Item tomate = new Item(new Produto("Tomate", 05.00), 3);
		Item macarrao = new Item(new Produto("Macarrao", 08.00), 5);
		Item queijo = new Item(new Produto("Queijo", 04.70), 2);

		Venda venda1 = new Venda(1, data, lista);
		Venda venda2 = new Venda(2, data, lista);

		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("[1] Adicionar item");
			System.out.println("[2] Ver quantidade de itens");
			System.out.println("[0] Sair");

			op = s.nextInt();
			s.nextLine();

			switch(op) {
			case 1:
				System.out.println("Informe o código da venda (1 ou 2): ");
				aux = s.nextInt();

				if(aux == 1) {
					System.out.println("Informe o item a ser adicionado: ");
					System.out.println("[1] Tomate");
					System.out.println("[2] Macarrão");
					System.out.println("[3] Queijo");
					aux = s.nextInt();

					switch(aux) {
						case 1:
							venda1.adicionarItem(tomate);
							break;
							
						case 2:
							venda1.adicionarItem(macarrao);
							break;
							
						case 3:
							venda1.adicionarItem(queijo);
							break;
							
						default:
							System.out.println("Item inválido!");
							break;
					}
				}
				
				if(aux == 2) {
					System.out.println("Informe o item a ser adicionado: ");
					System.out.println("[1] Tomate");
					System.out.println("[2] Macarrão");
					System.out.println("[3] Queijo");
					aux = s.nextInt();

					switch(aux) {
						case 1:
							venda2.adicionarItem(tomate);
							break;
							
						case 2:
							venda2.adicionarItem(macarrao);
							break;
							
						case 3:
							venda2.adicionarItem(queijo);
							break;
							
						default:
							System.out.println("Item inválido!");
							break;
					}
				}
				
				break;

			case 2:
				System.out.println("Informe o código da venda (1 ou 2): ");
				aux = s.nextInt();

				if(aux == 1)
					venda1.getQntItens();

				if(aux == 2)
					venda2.getQntItens();

				break;

			case 0:
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (op != 0);
		s.close();
	}
}
