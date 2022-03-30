package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		///////////////////1. Streams filter() and collect()/////////////////////////////////////
		//Before Java 8
		List<String> listaTech = Arrays.asList("Node","Spring","React");
		List<String> resultListaTech = getFilterOutput(listaTech,"Spring");
		System.out.println(resultListaTech);
		
		
		//Now Java8
		
		List<String> listaTech2 = Arrays.asList("Node","Spring","C#","Python");
		List<String>result2ListaTech = listaTech2.stream().
				filter(item -> !"Python".equals(item)).
				collect(Collectors.toList());
				
		System.out.println(result2ListaTech);
		
		
	}
	
	
	public static List<String> getFilterOutput(List<String>listaString, String filter){
		List<String> result = 	new ArrayList<>();
		
		for(String item : listaString) {
			if(!item.equals(filter)) {
				result.add(item);
				}
			}
		return result;
		
		}
	}