package Stream.Exercicio.SistemaLoja;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto p1 = new Produto("Água",1);
		Produto p2 = new Produto("Energetico Monster",5);
		Produto p3 = new Produto("Peito de Frango",11);
		Produto p4 = new Produto("Carne Moída Patinho",20);
		Produto p5 = new Produto("Desodorante Spray",4.3);
		Produto p6 = new Produto("Galaxy S15Y",1000);
		Produto p7 = new Produto("Notebook Gamer XJ6",2700);
		Produto p8 = new Produto("TV Samsung 8k Baiya",2500);
		Produto p9 = new Produto("Moto 4576DX 600",7000);
		
		Cliente c1 = new Cliente("Heitor","11959042772");
		Cliente c2 = new Cliente("Fernanda","1190015454");
		Cliente c3 = new Cliente("Lethicia","1194545154");
		Cliente c4 = new Cliente("Cairo","119585787845");
		Cliente c5 = new Cliente("Ana Caroline","119544541");
		Cliente c6 = new Cliente("Frangalio","11948578454");
		
		Compras compra1 = new Compras(c1,Stream.of(p1,p2));
		Compras compra2 = new Compras(c2,Stream.of(p1,p3,p4));
		Compras compra3 = new Compras(c3,Stream.of(p3,p6,p7));
		Compras compra4 = new Compras(c4,Stream.of(p2,p5,p8));
		
		Produto[] produtos = {p1,p2,p3,p4,p5,p6,p7,p8,p9};
		//List<Produto>produtos2 = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9);
		List<Cliente> clientes = Arrays.asList(c1,c2,c3,c4,c5,c6);
		List<Compras> vendas = Arrays.asList(compra1,compra2,compra3,compra4);
		
		//Mostrar todos os produtos com preço acima de 1000;
		
		Stream<Produto> streamProdutos =  Stream.of(produtos);
		streamProdutos = streamProdutos.filter(p->{
			return p.getPreco() > 10;
		});
		streamProdutos.forEach(p -> System.out.println(p));
		
		//Nome dos Clientes
		clientes.stream()
			.map(c -> c.getNome())
			.forEach(c -> System.out.println(c));
		
		//Valor total em vendas
		
		for(Compras compra : vendas) {
			Stream<Produto> produtosVendidos = compra.getProdutos();
			List<Double> valorTotalVendido = produtosVendidos.map(p->p.getPreco()).collect(Collectors.toList());
			double valoresArray =  valorTotalVendido.toArray();
			System.out.println(valoresArray);
		}
	
	}

}
