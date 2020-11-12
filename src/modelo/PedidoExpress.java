package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoExpress extends Pedido{
	private double taxaentrega;

	public PedidoExpress(int id, LocalDateTime datahora, double valortotal, String entregador, boolean pago,
			Cliente cliente, double taxaentrega) {
		super(id, datahora, valortotal, entregador, pago, cliente);
		this.taxaentrega = taxaentrega;
	}
	@Override
	public double valortotal() {
		List<Produto> produtos = new ArrayList<>();
		double sum = 0.0;
		for (Produto p : produtos) {
			sum = sum + p.getPreco();
		}
		return sum + taxaentrega;
		}
}
