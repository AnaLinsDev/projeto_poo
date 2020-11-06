package modelo;

public class ProdutoExpress extends Produto{
	private double taxaentrega;

	public ProdutoExpress(int id, String nome, double preco, double taxaentrega) {
		super(id, nome, preco);
		this.taxaentrega = taxaentrega;
	}

	public double getTaxaentrega() {
		return taxaentrega;
	}

	public void setTaxaentrega(double taxaentrega) {
		this.taxaentrega = taxaentrega;
	}

	@Override
	public String toString() {
		return "ProdutoExpress [taxaentrega=" + taxaentrega + "]";
	}
}
