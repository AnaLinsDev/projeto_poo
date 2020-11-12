package aplicacao;

import java.util.ArrayList;

import fachada.ClasseFachada;
import modelo.Produto;

public class Programa {

	public static void main(String[] args) throws Exception {
		ClasseFachada.cadastrarProduto("TV", 2000.0);
		ClasseFachada.cadastrarProduto("BONECA", 3000.0);
		String texto;
		ArrayList<Produto> lista1 = ClasseFachada.listarProdutos();
		texto = "\nListagem de produtos: \n";
		if (lista1.isEmpty())
			texto += "não tem produto cadastrado\n";
		else 	
			for(Produto p: lista1) 
				texto +=  p + "\n"; 
		System.out.println(texto);

	}

}
