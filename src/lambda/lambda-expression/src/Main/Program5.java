package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.ageAdvance;
import Model.People;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<People> people = new ArrayList<>();
		
		people.add(new People("Erica", "Salvador-BA", 31));
		people.add(new People("Rosilda", "Salvador-BA", 29));
		people.add(new People("Sandra", "Salvador-BA", 36));
		people.add(new People("Amélia", "Salvador-BA", 36));
		people.add(new People("Gilcélia", "Salvador-BA", 41));
		/*consumer*/
		people.forEach(new ageAdvance());
		
		people.forEach(System.out::println);
		
		sc.close();
 	}
}
