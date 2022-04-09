package Stream;

import java.util.stream.Stream;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> streamDadosNumericos = Stream.of(1,2,3,4,5,6,7,8);
		
		streamDadosNumericos.forEach(System.out::println);

	}

}
