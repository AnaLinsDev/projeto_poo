package modelo;

import java.util.ArrayList;

public class Cliente {
	private String telefone;
	private String nome;
	private String endereco;
	private ArrayList<Pedido> pedidos;

	public Cliente(String telefone, String nome, String endereco, ArrayList<Pedido> pedidos) {
		this.telefone = telefone;
		this.nome = nome;
		this.endereco = endereco;
		this.pedidos = pedidos;

	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public void addPedido(Pedido p) {
		if (!this.pedidos.contains(p)) {
			this.pedidos.add(p);
		}
	}

	public void remPedido(Pedido p) {
		this.pedidos.remove(p);
	}
	public ArrayList<Integer> getPedidosIds() {
		ArrayList<Integer> res = new ArrayList<>();
		for (Pedido p : getPedidos()) {
			res.add(p.getId());
		}
		return res;
	}
	@Override
	public String toString() {
		return "Cliente [telefone: " + telefone + ", nome: " + nome + ", endereço: " + endereco +" idPedidos: "+ getPedidosIds() +"]";
	}

}