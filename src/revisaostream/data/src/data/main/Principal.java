package data.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

import data.main.products.Products;

public class Principal {
	public static void main(String[] args) {
		
		Set<Products> all = new HashSet<>();
		all.add(new Products(3,"iphone 5s",1354.65,55));
		all.add(new Products(7,"mouse",3.65,150));
		all.add(new Products(5, "keyboard gamer", 55.35, 200));
		all.add(new Products(9, "tv samsumg 90'", 1003.57, 50));
		all.add(new Products(15, "refrigerator ge", 521.99, 30));
		all.add(new Products(1, "pc gamer asus", 1356.29, 10));
		all.add(new Products(30, "mac book pro", 3556.68, 5));
		all.add(new Products(17, "home - theater lg", 5656.98, 1));
		
		
		System.out.println("query System INC .");
		JOptionPane.showMessageDialog(null, "query System INC .");
		
		JOptionPane.showMessageDialog(null, "we're inside the system!");
		
		System.out.println();
		String find = JOptionPane.showInputDialog("query data items: [all: 0] [less than 1000$: 1] [less than 2000$: 2] [more than 3000$: 3] [more than 4000$: 4] ");
		
		try {
			int optionQuery = Integer.parseInt(find);
			if(optionQuery == 0) {
				for(Products pts :all) {
					System.out.println(pts.toString());
				}
			}else if(optionQuery == 1) {
					Stream<Products> lessthan1000 = all.stream().filter(x -> x.getPrice() <= 1000);
					System.out.println(Arrays.toString(lessthan1000.toArray()));
			}else if(optionQuery == 2) {
					Stream<Products> lessthan2000 = all.stream().filter(x -> x.getPrice() <= 2000);
					System.out.println(Arrays.toString(lessthan2000.toArray()));
			}else if(optionQuery == 3) {
					Stream<Products> morethan3000 = all.stream().filter(x -> x.getPrice() >= 3000);
					System.out.println(Arrays.toString(morethan3000.toArray()));
			}else if(optionQuery == 4) {
					Stream<Products> morethan4000 = all.stream().filter(x -> x.getPrice() >= 4000);
					System.out.println(Arrays.toString(morethan4000.toArray()));
			}
			
			System.out.println();
			System.out.println();
			System.out.println("if would you like to do a new query!");
			System.out.println("choose 1 to yes or 0 to no");
			JOptionPane.showMessageDialog(null, "if would you like to do a new query!");
			JOptionPane.showMessageDialog(null, "choose 1 to yes or 0 to no");
			String resp = JOptionPane.showInputDialog("choose");
				int response = Integer.parseInt(resp); 
			String zero = "0";
				int new_resp = Integer.parseInt(zero);
				
				
				while(response != new_resp) {
					System.out.println("query:");
					System.out.println();
					find = JOptionPane.showInputDialog("query data items: [all: 0] [less than 1000$: 1] [less than 2000$: 2] [more than 3000$: 3] [more than 4000$: 4] ");
						
					try {
						optionQuery = Integer.parseInt(find);
						if(optionQuery == 0) {
							for(Products pts :all) {
								System.out.println(pts.toString());
							}
						}else if(optionQuery == 1) {
								Stream<Products> lessthan1000 = all.stream().filter(x -> x.getPrice() <= 1000);
								System.out.println(Arrays.toString(lessthan1000.toArray()));
						}else if(optionQuery == 2) {
								Stream<Products> lessthan2000 = all.stream().filter(x -> x.getPrice() <= 2000);
								System.out.println(Arrays.toString(lessthan2000.toArray()));
						}else if(optionQuery == 3) {
								Stream<Products> morethan3000 = all.stream().filter(x -> x.getPrice() >= 3000);
								System.out.println(Arrays.toString(morethan3000.toArray()));
						}else if(optionQuery == 4) {
								Stream<Products> morethan4000 = all.stream().filter(x -> x.getPrice() >= 4000);
								System.out.println(Arrays.toString(morethan4000.toArray()));
						}
						
						System.out.println();
						System.out.println();
						System.out.println("if would you like to do a new query!");
						System.out.println("choose 1 to yes or 0 to no");
						JOptionPane.showMessageDialog(null, "if would you like to do a new query!");
						JOptionPane.showMessageDialog(null, "choose 1 to yes or 0 to no");
						resp = JOptionPane.showInputDialog("choose");
						response = Integer.parseInt(resp);
						
					}catch (Exception e) {
						System.out.println("error:" + e.getMessage());
					}	
				}
			
			
		}catch(Exception e) {
			System.out.println("error:" + e.getMessage());
		}
		
		JOptionPane.showMessageDialog(null, "Thanks for use our system!");
		JOptionPane.showMessageDialog(null, "Coav tecnologies INC .");
		
		System.out.println();
		System.out.println();
		System.out.println( "Thanks for use our system!");
		System.out.println( "Coav tecnologies INC .");
		
	}
}
