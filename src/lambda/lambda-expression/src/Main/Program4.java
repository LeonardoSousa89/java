package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import Model.People;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<People> people = new ArrayList<>();
		
		people.add(new People("Erica", "Salvador-BA", 31));
		people.add(new People("Rosilda", "Salvador-BA", 29));
		people.add(new People("Sandra", "Salvador-BA", 36));
		people.add(new People("Amélia", "Salvador-BA", 36));
		people.add(new People("Gilcélia", "Salvador-BA", 41));
		
		System.out.println("entre com a idade:");
		int age = sc.nextInt();
		/*predicado lambda*/
		Predicate <People> comparation = a -> a.getAge() != age;
		
		people.removeIf(comparation);
		
		for(People p: people) {
			System.out.println(p);
		}
		
		sc.close();
 	}
}
