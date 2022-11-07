package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.People;
import Model.Services.PeopleServices;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<People> people = new ArrayList<>();
		
		people.add(new People("Erica", "Salvador-BA", 31));
		people.add(new People("Rosilda", "Salvador-BA", 29));
		people.add(new People("Sandra", "Salvador-BA", 36));
		people.add(new People("Amélia", "Salvador-BA", 36));
		people.add(new People("Gilcélia", "Salvador-BA", 41));
		people.add(new People("Tatiana", "Salvador-BA", 19));
		people.add(new People("Tatiana", "Salvador-BA", 23));
		people.add(new People("Patricia", "Salvador-BA", 21));
		people.add(new People("Taís", "Salvador-BA", 17));
		people.add(new People("Rebeca", "Salvador-BA", 27));
		/*function*/
		PeopleServices ps = new PeopleServices();
		
		double sumAge = ps.filteredSumAge(people);
		
		System.out.println("sum of ages:" + String.format("%.2f", sumAge));
		
		
		sc.close();
 	}
}
