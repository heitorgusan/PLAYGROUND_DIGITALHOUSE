package Stream;

import java.util.Arrays;

public class Reduce {
	public static void main (String[] args) {
		int numbers[] = {1,2};
		
		int sum = Arrays.stream(numbers).reduce(2, (a,b)-> {
			System.out.println("A:"+a); // A é a minha soma total
			System.out.println("B:"+b); //B é meu número no array
			return a + b;
		});
		System.out.println(sum);
		
		//Outro método
		int sum2 = Arrays.stream(numbers).reduce(0,Integer::sum);
		System.out.println(sum2);
	}
}
