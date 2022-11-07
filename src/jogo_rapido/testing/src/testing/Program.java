package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import testing.Entities.Client;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Client> client = new ArrayList<>();
		
		List <String> new_key = new ArrayList<>();
		new_key.add("out");
		
		Stream<String> key = new_key.stream();
		String newConvertedKey = key.collect(Collectors.toList()).toString();
		//System.out.println(key.collect(Collectors.toList()).toString());
		
		String resp = "";
		while(resp.valueOf(newConvertedKey) != newConvertedKey.valueOf(new_key)) {
			System.out.println("continue?(s/n):");
			resp = sc.next();
		}
		
		sc.close();
	}
}
