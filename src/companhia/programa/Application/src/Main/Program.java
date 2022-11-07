package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.ExceptionApp;
import Controller.Status;
import Model.Client;
import Model.Company;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List <Client>  clients = new ArrayList<>();
		List <Company> company = new ArrayList<>();
		
		try {
				System.out.println("Dashboard");
				System.out.println();
				
				System.out.println("name:");
				String name = sc.next(); 
				System.out.println("age:");
				int age = sc.nextInt();
				System.out.println("sex:");
				String sex = sc.next();
				System.out.println("adress");
				String adress = sc.next();
				System.out.println("phoneNumber");
				String phoneNumber = sc.next();
				
				clients.add(new Client(name, sex, adress, phoneNumber, age));
				
				for(Client clientData: clients) {
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println(clientData.toString());
				}
				System.out.println();
				System.out.println();
				
				
				System.out.println("enter with company informations!");
				System.out.println("type:");
				String type = sc.next();
				System.out.println("status:");
				String status = sc.next();
				System.out.println("adress:");
				String companyAdress = sc.next();
				
				company.add(new Company(Status.valueOf(status), companyAdress, type));
				
				for(Company cia: company) {
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println(cia.toString());
				}
				
		}catch(ExceptionApp e) {
			throw new ExceptionApp("Unknown Error!");
		}
		catch(Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		
		
		
		
		
		
		sc.close();
	}
}
