package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PedidoExpress extends Pedido {
	private double taxaEntrega;
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


	public PedidoExpress(int id, LocalDateTime datahora, double valortotal, String entregador, boolean pago,
			Cliente cliente, ArrayList<Produto> produtos, double taxaentrega) {
		super(id, datahora, valortotal, entregador, pago, cliente, produtos);
		this.taxaEntrega = taxaentrega;
	}

	public double getTaxaEntrega() {
		return taxaEntrega;
	}

	public void setTaxaEntrega(double taxaentrega) {
		this.taxaEntrega = taxaentrega;
	}
	
	@Override
	public double geraValortotal() {
		double total = 0.0;
		for(Produto p : this.getProdutos()) {
			total = total + p.getPreco();
		}
		total = total + this.taxaEntrega;
		return total;
	}
	

	@Override
	public String toString() {
		String formatada = getDatahora().format(formatter);
		return "Pedido [id: " + getId() + ", cliente: " + getCliente().getNome() + ", entregador: " + getEntregador()
				+ ", datahora: " + formatada + ", valortotal: " + geraValortotal() + ", pago: " + isPago()
				+ ", idProdutos: " + getProdutosIds() + ", taxaentrega: " + getTaxaEntrega() + "]";
	}

}