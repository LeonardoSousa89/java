package arrow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {
	public static void main(String [] args) {
	 	try {
	 		System.out.println("generics String <List>");
	 		System.out.println();
	 		
			List<String> elas = new ArrayList<>();
			elas.add("Melanie");
			elas.add("Sophia");
			elas.add("Katia");
			elas.add("Kula");
			elas.add("Kyiama");
			elas.add("Rebeca");
			elas.add("Rosilda");
			elas.add("Bruna");
			elas.add("Sara");
			elas.add("Edjane");
			System.out.println();
			for(String mocas : elas) {
				System.out.println(mocas);
			}
			System.out.println();
			elas.removeIf(x -> x.charAt(0) == 'J' || x.charAt(0) == 'S' || x.charAt(0) == 'K');
			
			for(String mocas : elas) {
				System.out.println(mocas);
			}
			
		}catch(Exception e) {
			System.out.println("erro:" + e.getMessage());
		}
		
	 	
		
	 	
	 	
	 	
	 	
	 	System.out.println();
	 	
	try {
		System.out.println("generics Integer <Map>");
		System.out.println();
		Map<Integer, Integer> numeros = new HashMap<>();
		numeros.put(1, 10);
		numeros.put(11, 12);
		numeros.put(4, 6);
		numeros.put(7, 3);
		System.out.println(numeros);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	
	
	
	
	System.out.println();
	
	try {
		System.out.println("generics Integer <Set>");
		System.out.println();
		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(10);
		numeros.add(100);
		numeros.add(40);
		numeros.add(5);
		numeros.add(9);
		numeros.add(27);
		System.out.println(numeros);
		
		System.out.println();
		
		numeros.removeIf(x -> x >= 40);
		System.out.println(numeros);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	
	
	
System.out.println();
	
	try {
		System.out.println("generics Integer <List>");
		System.out.println();
		List<Double> numeros = new LinkedList<>();
		numeros.add(1.1);
		numeros.add(10.6);
		numeros.add(100.10);
		numeros.add(40.1);
		numeros.add(5.5);
		numeros.add(9.27);
		numeros.add(27.0);
		System.out.println(numeros);
		
		System.out.println();
		
		numeros.removeIf(x -> x < 40);
		System.out.println(numeros);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
System.out.println();
	
	try {
		System.out.println("generics Integer <List>");
		System.out.println();
		List<Double> numeros = new LinkedList<>();
		numeros.add(1.1);
		numeros.add(10.6);
		numeros.add(100.10);
		numeros.add(40.1);
		numeros.add(5.5);
		numeros.add(9.27);
		numeros.add(27.0);
		System.out.println(numeros);
		
		System.out.println();
		
		numeros.removeIf(x -> x < 40);
		System.out.println(numeros);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	System.out.println();
	
	try {
			System.out.println("generics Integer <List>");
			System.out.println();
			Elements cliente = new Elements();
			
			cliente.setCodigo(356);	
			cliente.setName("Waldir Andrade");
			cliente.setEndereco("rua Aliomar Baleeiro, São Cristovão, Salvador-BA");
			
			List<Elements> el = new ArrayList<>();
			
			//possibilidade 1
			el.add(new Elements(cliente.getCodigo(), cliente.getName(), cliente.getEndereco()));
			
			//possibilidade 2
			el.add(new Elements(189,"Luana Teixeira", "rua Pedro Cachoeira, São Cristovão, Salvador-BA"));
			el.add(new Elements(154,"Walter Rodrigues", "rua Oswaldo Gordilho, São Cristovão, Salvador-BA"));
			
			for(Elements dados :el) {
				System.out.println(dados.toString());
			}
			
			System.out.println();
			
			for(Elements dados :el) {
				el.removeIf(y -> y.getCodigo() > 155);
				System.out.println(Arrays.asList(dados).toString());
			}
			
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	System.out.println();
	
	try {
		System.out.println("generics Integer <Set>");
		System.out.println();
		
		Set<Elements> el = new HashSet<>();
		
		el.add(new Elements(1, "Valdez", "Brasil"));
		el.add(new Elements(1, "Valdez", "Brasil"));
		el.add(new Elements(2, "Joulez", "França"));
		el.add(new Elements(3, "May Lee", "Coréia"));
		el.add(new Elements(3, "May Lee", "Coréia"));
		el.add(new Elements(3, "May Lee", "Coréia"));
		
		for(Elements dados :el) {
			System.out.println(dados);
		}
		
		
		System.out.println();
		el.removeIf(x -> x.getEndereco() == "Coréia");
		
		for(Elements dados :el) {
			System.out.println(dados);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	}
}
