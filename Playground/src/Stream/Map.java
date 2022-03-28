package Stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Before Java 8
		List<String>alpha = Arrays.asList("a","b","c","d","e","f","g","h");
		List<String>alphaUpper = new ArrayList<>();
		
		for(String letter: alpha) {
			alphaUpper.add(letter.toUpperCase());
		}
		System.out.println(alphaUpper);
		
		//Java 8
		List<String> alphaNewMethod = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(alphaNewMethod);
		
		
		//Other data type
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		List<Integer> collectNumDobrar = num.stream().map(n -> n*2).collect(Collectors.toList());
		System.out.println(collectNumDobrar); // 2 , 4 ,6 ,8 ,10
		
		// List of objects -> List of String
		
		List<Staff> staff = Arrays.asList(
				new Staff("Heitorzin",24,new BigDecimal(10000)),
				new Staff("Carolzinha",21,new BigDecimal(10000)),
				new Staff("Fuba The Cat",2,new BigDecimal(200))
		);
		
		//Before Java 8
	     List<String> result = new ArrayList<>();
	     for (Staff x : staff) {
	    	 result.add(x.getName());
	     }
	        System.out.println(result); 
		
		//Java 8
		List<String> collectName = staff.stream().map(objFromStaff -> objFromStaff.getName()).collect(Collectors.toList());
		System.out.println(collectName);
		
		
	}

}
