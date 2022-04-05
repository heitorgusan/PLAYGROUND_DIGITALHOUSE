package Stream.Exercicio.SistemaLoja;

import java.util.ArrayList;
import java.util.List;

public class Compras {
	private Cliente cliente;
	private List<Produto>produtos;
	
	
	
	public Compras(Cliente cliente, List<Produto> produtos) {
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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	
	

	
	
}
