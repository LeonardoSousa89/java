package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import Model.People;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<People> people = new ArrayList<>();
		
		people.add(new People("Helena Boham Carter", "Brooklyn, NY", 53));
		people.add(new People("Tim Burton", "Brooklyn, NY", 62));
		people.add(new People("Joahny Depp", "San Francisco, CA", 63));
		people.add(new People("Keanu Reeves", "5th Avenue,NY", 59));
		/*predicado lambda*/
		Predicate<People> persons = a -> a.getAge() <= 62;
		people.removeIf(persons);
		
		for(People person: people) {
			System.out.println(person);
		}

	}
}
