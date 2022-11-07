package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Controller.upperCaseName;
import Model.People;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<People> people = new ArrayList<>();
		
		people.add(new People("Erica", "Salvador-BA", 31));
		people.add(new People("Rosilda", "Salvador-BA", 29));
		people.add(new People("Sandra", "Salvador-BA", 36));
		people.add(new People("Amélia", "Salvador-BA", 36));
		people.add(new People("Gilcélia", "Salvador-BA", 41));
		/*function*/
		
		 /*este encadeamento de chamadas,
		 * converte a lista atual de tipo genérico People
		 * para uma stream e posteriormente usando o 
		 * metodo de stream()
		 * collect() converte-se esta lista agora de tipo stream() 
		 * em uma lista de tipo String, como designado na classe,
		 * upperCaseName através da interface funcional lá
		 * implementada.
		 * */
		List<String> name = people.stream().map(new upperCaseName()).collect(Collectors.toList());
		
		name.forEach(System.out::println);
		
		
		/*
		 * pode -se ser feita desta forma:
		 * 
		 * List<String> name = people
		 * 					  .stream()
		 * 					  .map(new upperCaseName())
		 * 					  .collect(Collectors.toList());
		
		  name.forEach(System.out::println);
		 * 
		 * */
		sc.close();
 	}
}
