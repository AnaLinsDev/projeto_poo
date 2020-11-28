package modelo;

import java.util.ArrayList;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private ArrayList<Pedido> pedidos;
	
	public Produto(int id, String nome, double preco, ArrayList<Pedido> pedidos) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.pedidos = pedidos;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public ArrayList<Integer> getPedidosIds() {
		ArrayList<Integer> res = new ArrayList<>();
		for (Pedido p : getPedidos()) {
			res.add(p.getId());
		}
		return res;
	}

	
	public void addPedido(Pedido p ) {
		if (!this.pedidos.contains(p)) {
			this.pedidos.add(p);
		}

	}
	public void remPedido(Pedido p ) {
		this.getPedidos().remove(p);

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [id: " + id + ", nome: " + nome + ", preco: " + preco + " idPedidos: "+ getPedidosIds()+ "]";
	}
}