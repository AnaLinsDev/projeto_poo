  
package aplicacao;

import java.util.ArrayList;

import fachada.Fachada;
import modelo.Produto;
import modelo.Cliente;
import modelo.Pedido;

public class Programa {
		public static void main(String[] args) throws Exception {
			String texto;
			
			Fachada.cadastrarProduto("TV", 2000.0);
			Fachada.cadastrarProduto("BONECA", 3000.0);
			Fachada.cadastrarProduto("CARRO", 2000.0);
			Fachada.cadastrarProduto("BOLA", 3500.0);
			Fachada.cadastrarProduto("CELULAR", 2500.0);
			
			Fachada.cadastrarCliente("982828282", "Ana Julia", "Brasil");
			Fachada.cadastrarCliente("982845454", "Yohanna", "Japão");
			Fachada.cadastrarCliente("982867762", "Amanda", "Canadá");
			Fachada.cadastrarCliente("982989898", "Maria", "Noruega");
			Fachada.cadastrarCliente("983434343", "Fatima", "Alemanha"); //express
			
			Fachada.criarPedido("982828282");
			Fachada.criarPedido("982845454");
			Fachada.criarPedido("982867762");
			Fachada.criarPedido("982989898");
			Fachada.criarPedido("983434343", 10);
			
			// Adicionando produtos nos pedidos
			
			Fachada.adicionarProdutoPedido(1, 1);

			Fachada.adicionarProdutoPedido(3, 3);
			Fachada.adicionarProdutoPedido(4, 4);
			Fachada.adicionarProdutoPedido(5, 5);
			Fachada.adicionarProdutoPedido(1, 5);
			Fachada.adicionarProdutoPedido(2, 4);
			Fachada.adicionarProdutoPedido(3, 3);
			Fachada.adicionarProdutoPedido(4, 2);

			
			// Pagando entregadores para pedido 1 e 2 + cancelando o 3

			Fachada.getPedidoById(1).setEntregador("Joao");
			Fachada.getPedidoById(1).setPago(true);
			Fachada.getPedidoById(2).setEntregador("Jose");
			Fachada.getPedidoById(2).setPago(true);
			Fachada.cancelarPedido(3);
			
			Fachada.getPedidoById(1).setValortotal(Fachada.getPedidoById(1).geraValortotal());
			Fachada.getPedidoById(2).setValortotal(Fachada.getPedidoById(2).geraValortotal());;
			Fachada.getPedidoById(4).setValortotal(Fachada.getPedidoById(4).geraValortotal());;
			Fachada.getPedidoById(5).setValortotal(Fachada.getPedidoById(5).geraValortotal());;
			
			// Listar Produtos
			texto = "\nListagem de "+ Fachada.listarProdutos("").size() + " produtos:\n";
			if (Fachada.listarProdutos("").isEmpty())
				texto += "não tem produto cadastrado\n";
			else 	
				for(Produto p: Fachada.listarProdutos("")) 
					texto +=  p + "\n"; 
			
			// Listar Clientes
			texto += "\nListagem "+ Fachada.listarClientes().size() +" de clientes: \n";
			if (Fachada.listarClientes().isEmpty())
				texto += "não tem cliente cadastrado\n";
			else 	
				for(Cliente c: Fachada.listarClientes()) 
					texto +=  c + "\n"; 
			
			// Listar Pedidos
			texto += "\nListagem "+ Fachada.listarPedidos().size() +" de pedidos: \n";
			if (Fachada.listarPedidos().isEmpty())
				texto += "não tem cliente cadastrado\n";
			else 	
				for(Pedido p: Fachada.listarPedidos()) 
					texto +=  p + "\n"; 
			
			System.out.println(texto);
			
			System.out.println(Fachada.consultarProdutoTop());

		}
}