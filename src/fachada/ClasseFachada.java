package fachada;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Pedido;
import modelo.Produto;
import repositorio.Repositorio;

public class ClasseFachada {
	public static Repositorio repositorio = new Repositorio();

	public ArrayList<Produto> listarProdutos() {
		return repositorio.getProdutos();
	}

	public ArrayList<Cliente> listarClientes() {
		return repositorio.getClientes();
	}

	public ArrayList<Pedido> listarPedidos(String telefone, int tipo) {
		ArrayList<Pedido> aux = new ArrayList<>();
		if (tipo == 1) {
			for (Pedido pe : repositorio.getPedidos()) {
				if (pe.isPago() == true) {
					aux.add(pe);
				}
			}
		}
		if (tipo == 2) {
			for (Pedido pe : repositorio.getPedidos()) {
				if (pe.isPago() == false) {
					aux.add(pe);
				}
			}
		}
		else {
			return repositorio.getPedidos();
		}
		return null;
	}

	public static Produto cadastrarProduto(int id, String nome, double preco) throws Exception {
		Produto p = repositorio.localizarProduto(nome);
		if (p != null)
			throw new Exception("cadastrar produto - produto ja cadastrado:" + nome);
		p = new Produto(id, nome, preco);
		repositorio.adicionar(p);
		return p;
	}
}
