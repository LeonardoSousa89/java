package Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program8 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(50, 90, 100, 150, 200);
		/*Stream*/
		Stream<Integer> st1 = numbers.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<Integer> st2 = numbers.stream().map(e -> e * 10);
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = numbers.stream().filter(e -> e >= 100);
		System.out.println(Arrays.toString(st3.toArray()));
		
		
		
		List <String> names = Arrays.asList("Carol", "Bianca","Renata","Rebecca");
		
		Stream<String> st4 = names.stream().filter(e -> e.charAt(0) == 'R');
		System.out.println(Arrays.toString(st4.toArray()));
		
		
 	}
}
