package repositorio;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Pedido;
import modelo.Produto;

public class Repositorio {

	private ArrayList<Produto> produtos = new ArrayList<>();
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Pedido> pedidos = new ArrayList<>();

	/* Produto */
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

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

	public int getTotalProdutos() {
		return produtos.size();
	}

	/* Clientes */
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void adicionar(Cliente c) {
		clientes.add(c);
	}

	public void remover(Cliente c) {
		clientes.remove(c);
	}

	public Cliente localizarCliente(String nome) {
		for (Cliente c : clientes) {
			if (c.getNome().equals(nome))
				return c;
		}
		return null;
	}

	public int getTotalClientes() {
		return clientes.size();
	}

	/* Pedido */
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void adicionar(Pedido pe) {
		pedidos.add(pe);
	}

	public void remover(Pedido pe) {
		pedidos.remove(pe);
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
