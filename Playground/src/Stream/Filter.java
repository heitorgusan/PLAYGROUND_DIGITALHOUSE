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
		
		//2. Streams filter(), findAny() and orElse() ////////////////////////////////////	
		//Befor Java 8
		List<Person> myPeoples = Arrays.asList(
				
				new Person("Heitor",24),
				new Person("Ana Caroline",21),
				new Person("Nadir",48),
				new Person("Lucas",24),
				new Person("William",24),
				new Person("Gabriel S.",22),
				new Person("Gabriel A.",19)
				
				);
		Person pessoaSelecionada = getPersonByName(myPeoples, "Heitor");
		System.out.println(pessoaSelecionada);
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
	
	public static Person getPersonByName(List<Person>persons, String name) {
		Person result = null;
		
		for(Person p: persons) {
			if(name.equals(p.getName())) {
				result = p;
			}
		}
		return result;
	}
	
	
	}