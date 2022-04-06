/*
Criar um dicionário que represente os primeiros 5 números da “Loteria dos
Sonhos”, junto com seu significado. Para isso, o dicionário deverá ter como
chave Integer e como valor uma String.
Números da Loteria dos Sonhos:
0 → Ovos
1 → Água
2 → Escopeta
3 → Cavalo
4 → Dentista
5 → Fogo
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

package Collection.Exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E1_JOGODOBICHO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>jogoDoBicho = new HashMap<>();
		
		jogoDoBicho.put(1, "Avestruz");
		jogoDoBicho.put(2, "Águia");
		jogoDoBicho.put(3, "Burro");
		jogoDoBicho.put(4, "Borboleta");
		jogoDoBicho.put(5, "Cachorro");
		jogoDoBicho.put(6, "Cabra");
		jogoDoBicho.put(7, "Carneiro");
		jogoDoBicho.put(8, "Camelo");
		jogoDoBicho.put(9, "Cobra");
		jogoDoBicho.put(10, "Coelho");
		jogoDoBicho.put(11, "Cavalo");
		jogoDoBicho.put(12, "Elefante");
		jogoDoBicho.put(13, "Galo");
		jogoDoBicho.put(14, "Gato");
		jogoDoBicho.put(15, "Jacaré");
		jogoDoBicho.put(16, "Leão");
		jogoDoBicho.put(17, "Macaco");
		jogoDoBicho.put(18, "Porco");
		jogoDoBicho.put(19, "Pavão");
		jogoDoBicho.put(20, "Peru");
		jogoDoBicho.put(21, "Touro");
		jogoDoBicho.put(22, "Tigre");
		jogoDoBicho.put(23, "Urso");
		jogoDoBicho.put(24, "Veado");
		jogoDoBicho.put(25, "Vaca");
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Selecione um número");
		for(Integer key: jogoDoBicho.keySet()) {
			String value = jogoDoBicho.get(key);
			System.out.println(key +" - "+value);
		}
		//Entrada
		System.out.println("Selecione um número");
		int nJogo = leitor.nextInt();
		
		
		//Sorteio
		int min = 1 ;
		int max = 25;
		int nSorteado = (int) (Math.random()*(max-min)) + min;
		
		//Saída
		System.out.println("Você selecionou: "+jogoDoBicho.get(nJogo));
		System.out.println("O Bicho sorteado foi: "+jogoDoBicho.get(nSorteado));
		
		System.out.println(nJogo == nSorteado ? "Venceu" : "Perdeu");
	}

}
