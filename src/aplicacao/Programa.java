
package aplicacao;

import java.time.LocalDate;

import fachada.Fachada;
import modelo.Produto;
import modelo.Cliente;
import modelo.Pedido;

public class Programa {
	public static void main(String[] args) throws Exception {
		String texto;
		try {
			// Adicionando produtos
			Fachada.cadastrarProduto("TV", 2000.0);
			Fachada.cadastrarProduto("NOTEBOOK", 3000.0);
			Fachada.cadastrarProduto("PS4", 2000.0);
			Fachada.cadastrarProduto("TABLET", 3500.0);
			Fachada.cadastrarProduto("CELULAR", 2500.0);

			// Adicionando clientes
			Fachada.cadastrarCliente("982000000", "Ana Julia", "Brasil"); // express
			Fachada.cadastrarCliente("982111111", "Yohanna", "Japao");
			Fachada.cadastrarCliente("982222222", "Amanda", "Canada");
			Fachada.cadastrarCliente("983333333", "Maria", "Noruega");
			Fachada.cadastrarCliente("984444444", "Fatima", "Alemanha");

			// Adicionando pedidos
			Fachada.criarPedido("982000000");
			Fachada.criarPedido("982111111");
			Fachada.criarPedido("982222222");
			Fachada.criarPedido("983333333");
			Fachada.criarPedido("982000000", 10.0); // express

			// Adicionando e removendo produtos dos pedidos
			Fachada.adicionarProdutoPedido(1, 1);
			Fachada.adicionarProdutoPedido(1, 3);
			Fachada.adicionarProdutoPedido(1, 4);
			Fachada.adicionarProdutoPedido(1, 3);

			Fachada.adicionarProdutoPedido(2, 5);
			Fachada.adicionarProdutoPedido(2, 2);

			Fachada.adicionarProdutoPedido(3, 3);
			Fachada.adicionarProdutoPedido(3, 5);

			Fachada.adicionarProdutoPedido(4, 2);
			Fachada.adicionarProdutoPedido(4, 3);
			Fachada.adicionarProdutoPedido(4, 5);
			Fachada.removerProdutoPedido(4, 3);
			Fachada.adicionarProdutoPedido(4, 2);

			Fachada.adicionarProdutoPedido(5, 3);
			Fachada.adicionarProdutoPedido(5, 5);
			Fachada.removerProdutoPedido(5, 3);

			// Pagando entregadores para pedido 1 e 2 e cancelando o 3
			Fachada.pagarPedido(1, "Joao");
			Fachada.pagarPedido(2, "Jose");
			Fachada.cancelarPedido(3);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		// Listar Produtos
		texto = "\nListagem de " + Fachada.listarProdutos("").size() + " produtos:\n";
		if (Fachada.listarProdutos("").isEmpty())
			texto += "nao tem produto cadastrado\n";
		else
			for (Produto p : Fachada.listarProdutos(""))
				texto += p + "\n";

		// Listar Clientes
		texto += "\nListagem " + Fachada.listarClientes().size() + " de clientes: \n";
		if (Fachada.listarClientes().isEmpty())
			texto += "nao tem cliente cadastrado\n";
		else
			for (Cliente c : Fachada.listarClientes())
				texto += c + "\n";

		// Listar Pedidos
		texto += "\nListagem " + Fachada.listarPedidos().size() + " de pedidos: \n";
		if (Fachada.listarPedidos().isEmpty())
			texto += "nao tem cliente cadastrado\n";
		else
			for (Pedido p : Fachada.listarPedidos())
				texto += p + "\n";

		int dia = LocalDate.now().getDayOfMonth();
		texto += "\n Arrecadação na data de hoje: \n";
		texto += Fachada.consultarArrecadacao(dia) + "\n";

		texto += "\nListagem de TOP produtos: \n";
		for (Produto p : Fachada.consultarProdutoTop())
			texto += p + "\n";

		System.out.println(texto);

		System.out.println("\n Teste de Excecoes: \n");
		try {
			Fachada.cadastrarProduto("CELULAR", 2500.0);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		try {
			Fachada.cadastrarCliente("984444444", "Fatima", "Alemanha");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		try {
			Fachada.adicionarProdutoPedido(7, 2);
			Fachada.adicionarProdutoPedido(7, 2);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		try {
			Fachada.pagarPedido(1, "Joao");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		try {
			Fachada.cancelarPedido(3);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

}