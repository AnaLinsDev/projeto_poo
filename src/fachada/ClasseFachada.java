package fachada;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Pedido;
import modelo.Produto;
import repositorio.Repositorio;

public class ClasseFachada {
	public static Repositorio repositorio = new Repositorio();

	public ArrayList<Produto> listarProdutos(){
		return repositorio.getProdutos();
	}
	public ArrayList<Cliente> listarClientes(){
		return repositorio.getClientes();
	}
	public ArrayList<Pedido> listarPedidos(){
		return repositorio.getPedidos();
	}
}
