package Stream.Exercicio.SistemaLoja;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Compras {
	private Cliente cliente;
	private Stream<Produto>produtos;
	
	
	
	public Compras(Cliente cliente, Stream<Produto> produtos) {
		super();
		this.cliente = cliente;
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Stream<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Stream<Produto> produtos) {
		this.produtos = produtos;
	}

	
	

	
	
}
