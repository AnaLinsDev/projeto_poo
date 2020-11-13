package modelo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class PedidoExpress extends Pedido{
	private double taxaEntrega;

	public PedidoExpress(int id, LocalDateTime datahora, double valortotal, String entregador, boolean pago,
			Cliente cliente, double taxaentrega) {
		super(id, datahora, valortotal, entregador, pago, cliente);
		this.taxaEntrega = taxaentrega;
	}

	public double getTaxaEntrega() {
		return taxaEntrega;
	}

	public void setTaxaEntrega(double taxaentrega) {
		this.taxaEntrega = taxaentrega;
	}

	@Override
	public String toString() {
		return "Pedido [id: " + getId() + ", cliente: " + getCliente().getNome() + ", entregador: " +getEntregador() +
				", datahora: " + getDatahora() + ", valortotal: " + getValortotal() + ", pago: " + isPago() + 
				", produtos: " + getProdutos() + ", taxaentrega: " + getTaxaEntrega() +"]";
	}
	
	@Override
	public double valortotal() {
		List<Produto> produtos = new ArrayList<>();
		double sum = 0.0;
		for (Produto p : produtos) {
			sum = sum + p.getPreco();
		}
		return sum + taxaEntrega;
		}
}
