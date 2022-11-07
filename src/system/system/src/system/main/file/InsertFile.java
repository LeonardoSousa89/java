package system.main.file;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import system.main.error.PersonalError;

public class InsertFile implements Methods{
	
	String url = "C:/Users/Mendes/Desktop/java/src/system/files/storage.txt";
	
	public InsertFile() {}
	
	@Override
	public void insert(String cod, 
					String clientName, 
					String lastclienteName, 
					String phoneNumber,
					String city,
					String country,
					String uf,
					String itemName,
					String price,
					String quantity) {
				try {
					
					OutputStream saida = new FileOutputStream(url);
					OutputStreamWriter escrivao = new OutputStreamWriter(saida);
					BufferedWriter codificado = new BufferedWriter(escrivao);
					
					codificado.write("-------------------- clients data --------------------");
					codificado.newLine();
					
					codificado.write("--------------------------------------------------------");
					codificado.newLine();
					codificado.write("cod:" + cod);
					codificado.newLine();
					codificado.write("name:" + clientName);
					codificado.newLine();
					codificado.write("last name:" + lastclienteName );
					codificado.newLine();
					codificado.write("phone number:" + phoneNumber);
					codificado.newLine();
					codificado.write("city:" + city);
					codificado.newLine();
					codificado.write("country:" + country);
					codificado.newLine();
					codificado.write("uf:" + uf);
					codificado.newLine();
					codificado.write("item:" + itemName);
					codificado.newLine();
					codificado.write("price:" + price);
					codificado.newLine();
					codificado.write("quantity:" + quantity);
					
					codificado.newLine();
					codificado.write("--------------------------------------------------------");
					
					codificado.newLine();
					codificado.write("-------------------- clients data --------------------");
					
					codificado.close();
					
					
					codificado.newLine();
					codificado.newLine();
					codificado.newLine();
					codificado.write("Coav tecnologies INC .");
					
			}catch(PersonalError e) {
				System.out.println("error:" + e.getMessage());
			}catch(IOException e) {
				System.out.println("error:" + e.getMessage());
			}catch(Exception e) {
				System.out.println("error:" + e.getMessage());
			}
	}
	


}
