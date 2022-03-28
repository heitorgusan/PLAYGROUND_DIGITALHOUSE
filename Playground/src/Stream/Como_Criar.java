package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//A API de stream do java é uma coleção de recursos poderosos desenvolvidos para lidar com sequências
//de elementos de forma simples e eficiente.

public class Como_Criar {

	public static void main(String[] args) {
		//Criando Stream de dados
		//Forma 1
		Stream<Integer> streamDadosNumericos = Stream.of(1,2,3,4,5);
		
		//Forma 2
		Integer[] dadosNumericos  = {1,2,3,4,5,6};
		Stream<Integer> streamDadosNumericos2 =Stream.of(dadosNumericos);
		
		//Forma 3
		List<Integer> dadosNumericos2 = new ArrayList<>();
		dadosNumericos2.add(1);
		dadosNumericos2.add(2);
		dadosNumericos2.add(3);
		Stream<Integer>StreamDadosNumericos2 = dadosNumericos2.stream();
	}

}
