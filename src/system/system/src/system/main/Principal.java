package system.main;

import javax.swing.JOptionPane;

import system.main.entities.Address;
import system.main.entities.Client;
import system.main.entities.Products;
import system.main.error.PersonalError;
import system.main.file.InsertFile;
import system.main.store.Storage;

public class Principal {
	public static void main(String[] args) {
		try {
			
			JOptionPane.showMessageDialog(null, "System");
			System.out.println("---------------------------------------System---------------------------------------");
			JOptionPane.showMessageDialog(null, "Welcome to the system!");
			System.out.println();
			System.out.println();
			System.out.println( "Welcome to the system!");
			
			System.out.println();
			System.out.println();
			
			String cod = JOptionPane.showInputDialog("insert cod:");
			String clienteName = JOptionPane.showInputDialog("insert one name:");
			String lastClientName = JOptionPane.showInputDialog("insert a last name:");
			String phoneNumber = JOptionPane.showInputDialog("insert a prone number:");
			String city = JOptionPane.showInputDialog("insert your city:");
			String country = JOptionPane.showInputDialog("enter your country:");
			String uf = JOptionPane.showInputDialog("insert your UF:");
			String itemName = JOptionPane.showInputDialog("choose a item:");
			String qtde = JOptionPane.showInputDialog("choose a quantity:");
			
			System.out.println();
			System.out.println();
			
			Client people = new Client();
			people.setCod(cod);
			people.setclienteName(clienteName);
			people.setLastclienteName(lastClientName);
			people.setPhoneNumber(phoneNumber);
			people.getCod();
			people.getclienteName();
			people.getLastclienteName();
			people.getPhoneNumber();
			Thread impressao = new Thread(people);
			impressao.start();
			
			Address address = new Address();
			address.setCity(city);
			address.setCountry(country);
			address.setUf(uf);
			address.getCity();
			address.getCountry();
			address.getUf();
			Thread impressao2 = new Thread(address);
			impressao2.start();
			
			
			Products prod = new Products();
			Storage st = new Storage();
			String price = "";
			
			switch (itemName) {
					case "item1":
						String item1 = st.item1;
						prod.setItemName(item1);
						price = st.price1;
						prod.setPrice(price);
						break;
					
					case "item2":
						String item2 = st.item2;
						prod.setItemName(item2);
						price = st.price2;
						prod.setPrice(price);
						break;
					
					case "item3":
						String item3 = st.item3;
						prod.setItemName(item3);
						price = st.price3;
						prod.setPrice(price);
						break;
						
					default:
						break;
					}
			
			prod.setQuantity(qtde);
			prod.getItemName();
			prod.getPrice();
			prod.getQuantity();
			Thread impressao3 = new Thread(prod);
			impressao3.start();
			
			InsertFile test = new InsertFile();
			test.insert(cod, clienteName, lastClientName, phoneNumber, city, country, uf, itemName, price, qtde);
			
			JOptionPane.showMessageDialog(null, "cod:" + people.getCod() + "," + "name:" + people.getclienteName() + "," +"last name:" + people.getLastclienteName() + "," + "phone number:" + people.getPhoneNumber() + ".");
			JOptionPane.showMessageDialog(null,  "city:" + address.getCity() + "," + "country:" + address.getCountry() + "," +"UF:" + address.getUf() + ".");
			JOptionPane.showMessageDialog(null,  "item:" + prod.getItemName() + "," + "price:" + prod.getPrice() + "," +"quantity:" + prod.getQuantity() + ".");
			
		}catch(PersonalError e) {
			System.out.println("error" + e.getMessage());
		}catch(Exception e) {
			System.out.println("error" + e.getMessage());
		}
		
		JOptionPane.showMessageDialog(null, "thanks for using our systems!");
		System.out.println("thanks for using our systems!");
		
		System.out.println();
		System.out.println();
		System.out.println();
		JOptionPane.showMessageDialog(null, "system developed by coav tecnologies INC .");
		System.out.println("system developed by coav tecnologies INC .");
	}
}


