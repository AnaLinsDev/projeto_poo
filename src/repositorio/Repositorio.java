package repositorio;

import java.util.ArrayList;

import modelo.Produto;
import modelo.Pedido;
import modelo.Cliente;

public class Repositorio {
	private ArrayList<Produto> produtos = new ArrayList<>();
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	private ArrayList<Cliente> clientes = new ArrayList<>();

	/* Produto */
	public void adicionar(Produto p) {
		produtos.add(p);
	}

	public void remover(Produto p) {
		produtos.remove(p);
	}

	public Produto localizarProduto(String nome) {
		for (Produto p : produtos) {
			if (p.getNome().equals(nome))
				return p;
		}
		return null;
	}
	
	public Produto localizarProduto(int id) {
		for (Produto pr : produtos) {
			if (pr.getId() == id)
				return pr;
		}
		return null;
	}

	public int getTotalProdutos() {
		return produtos.size();
	}

	public ArrayList<Produto> getProdutos(String text) {
		ArrayList<Produto> produtosByText = new ArrayList<>();
		for (Produto p : produtos) {
			if (p.getNome().contains(text)) {
				produtosByText.add(p);
			}
		}
		return produtosByText;
	}

	/* Cliente */
	public void adicionar(Cliente c) {
		clientes.add(c);
	}

	public void remover(Cliente c) {
		clientes.remove(c);
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente localizarCliente(String telefone) {
		for (Cliente c : clientes) {
			if (c.getTelefone() == telefone)
				return c;
		}
		return null;
	}

	public int getTotalClientes() {
		return clientes.size();
	}
	/* Pedidos */
	
	public void adicionar(Pedido p) {
		pedidos.add(p);
	}

	public void remover(Pedido p) {
		pedidos.remove(p);
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public ArrayList<Pedido> getPedidoByTel_Tipo(String tel, int tipo) {
		ArrayList<Pedido> pedidosByTipo = new ArrayList<>();
		for (Pedido p : pedidos) {
			if (p.getCliente().getTelefone() == tel) {
				if (tipo == 1 && p.isPago() == true) {
					pedidosByTipo.add(p);
				} else if (tipo == 2 && p.isPago() == false) {
					pedidosByTipo.add(p);
				} else if (tipo == 3) {
					return pedidos;
				}
			}
		}
		return pedidosByTipo;
	}

	public Pedido localizarPedido(int id) {
		for (Pedido pe : pedidos) {
			if (pe.getId() == id)
				return pe;
		}
		return null;
	}

	public int getTotalPedidos() {
		return pedidos.size();
	}
}