package fachada;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

import modelo.Cliente;
import modelo.Pedido;
import modelo.PedidoExpress;
import modelo.Produto;
import repositorio.Repositorio;

public class Fachada {
	public static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss"); 
	private static Repositorio repositorio = new Repositorio();
	private static int idproduto = 0;
	private static int idpedido  = 0;
	
	  public static ArrayList<Produto> listarProdutos(String text){
		  return repositorio.getProdutos(text);
	  }

	  public static ArrayList<Cliente> listarClientes(){
 		  return repositorio.getClientes();
	  }
	  public static ArrayList<Pedido> listarPedidos(){
		  return repositorio.getPedidos();
	  }
	  
	  public static Pedido getPedidoById(int idpedido){
		  return repositorio.getPedido(idpedido);
	  }
	  
	  public static ArrayList<Pedido> listarPedidos(String tel, int tipo){
		  return repositorio.getPedido(tel, tipo);
	  }
	  
	  public static Produto cadastrarProduto(String nome, double preco) throws Exception{
		  Produto p = repositorio.localizarProduto(nome);
			int id = repositorio.getTotalProdutos() + 1;
			if (p != null)
				throw new Exception("cadastrar produto - produto ja cadastrado:" + nome);
			p = new Produto(id, nome, preco);
			repositorio.adicionar(p);
			return p;
	  }
	  
	  public static Cliente cadastrarCliente(String telefone, String nome, String endereco) throws Exception{
		  Cliente c = repositorio.localizarCliente(nome);
			if (c != null)
				throw new Exception("cadastrar cliente - cliente ja cadastrado:" + nome);
			c = new Cliente(telefone, nome, endereco);
			repositorio.adicionar(c);
			return c;
	  }
	  
	  public static Pedido criarPedido(String telefone){
			idpedido++;
			Cliente cli = null;
			Pedido pedido;
			for(Cliente c : repositorio.getClientes()) {
				if(c.getTelefone() == telefone) {
					cli = c;
				}
			}
			if (cli != null) {
				pedido = new Pedido(idpedido,  null,0, null , false, cli );
				repositorio.adicionar(pedido);
				return pedido;
			}
			return null;
		}
	  public static Pedido criarPedido(String telefone, double taxaentrega){
			idpedido++;
			LocalDateTime agora = LocalDateTime.now();
			Cliente cli = null;
			Pedido pedido;
			for(Cliente c : repositorio.getClientes()) {
				if(c.getTelefone() == telefone) {
					cli = c;
				}
			}
			if (cli != null) {
				Cliente c = repositorio.localizarCliente(telefone);
				pedido = new PedidoExpress(idpedido,  agora,0, null , false, c, taxaentrega );
				repositorio.adicionar(pedido);
				return pedido;
			}
			return null;
		}
	  
	  
	  
	  public static void adicionarProdutoPedido(int idpedido, int idproduto){
			for(Pedido pe : repositorio.getPedidos()) {
				if(pe.getId() == idpedido) {
					for(Produto pr : repositorio.getProdutos("")) {
						if(pr.getId() == idproduto) {
							pe.addProduto(pr);
						}
					}
				}
			}
	  }
	  
	  public static void removerProdutoPedido(int idpedido, int idproduto){
			for(Pedido pe : repositorio.getPedidos()) {
				if(pe.getId() == idpedido) {
					for(Produto pr : repositorio.getProdutos("")) {
						if(pr.getId() == idproduto) {
							pe.remProduto(pr);
						}
					}
				}
			}
	  }
	  
	  public static Pedido consultarPedido(int idpedido){
			Pedido res;
			res = repositorio.getPedido(idpedido);
			if (res != null) {
				return res;
			}
			return null;
	  }
	  
	  public static void pagarPedido(int idpedido, String nomeentregador){
			for(Pedido p : repositorio.getPedidos()) {
				if(p.getId() == idpedido) {
					p.setEntregador(nomeentregador);
					p.setPago(true);
				}
			}
	  }
	  
	  public static void cancelarPedido(int idpedido){
			for(Pedido p : repositorio.getPedidos()) {
				if(p.getId() == idpedido) {
					repositorio.remover(p);
					break;
				}
			}
	  }
	  
	  public static double consultarArrecadacao(LocalDateTime dia){
			double total = 0;
			for(Pedido p : repositorio.getPedidos()) {
				if(p.isPago() == true & p.getDatahora() == dia) {
					total = total + p.getValortotal();
				}
			}
			return total;
	  }

	  
	  public static ArrayList<Produto> consultarProdutoTop(){
		ArrayList<Produto> topFim = new ArrayList<>();
		ArrayList<Produto> res = new ArrayList<>();
		for(Pedido pe :repositorio.getPedidos()) {
			for(Produto pr : pe.getProduto()) {	
				topFim.add(pr);
			}
		}
		for (Produto p : topFim) {
			//TODO
		}
		return res;
		  
	  }
}