package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		///////////////////1. Streams filter() and collect()/////////////////////////////////////
		//Before Java 8
		List<String> listaTech = Arrays.asList("Node","Spring","React");
		List<String> resultListaTech = getFilterOutput(listaTech,"Spring");
		
		for(String item: resultListaTech) {
			System.out.println(item);
		}
		
		
		
		
		
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