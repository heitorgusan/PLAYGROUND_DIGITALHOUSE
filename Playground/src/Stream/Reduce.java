package Stream;

import java.util.Arrays;

public class Reduce {
	public static void main (String[] args) {
		int numbers[] = {1,2};
		
		int sum = Arrays.stream(numbers).reduce(2, (a,b)-> {
			System.out.println("A:"+a); // A � a minha soma total
			System.out.println("B:"+b); //B � meu n�mero no array
			return a + b;
		});
		System.out.println(sum);
		
		//Outro m�todo
		int sum2 = Arrays.stream(numbers).reduce(0,Integer::sum);
		System.out.println(sum2);
	}
}
