package system.main.find;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import system.main.error.PersonalError;

public class Query implements Methods{

	String url = "C:/Users/Mendes/Desktop/java/src/system/files/storage.txt";
	
	public Query() {}
	
	@Override
	public void queryItems() {
		try {
			InputStream data = new FileInputStream(url);
			InputStreamReader reader = new InputStreamReader(data);
			BufferedReader codificator = new BufferedReader(reader);
			
			String printer = codificator.readLine();
			
			while(printer != null) {
				 printer = codificator.readLine();
				 List<String> print = new ArrayList<>();
				 print.add(printer);
				 Stream<String> pts = print
						 			.stream()
						 			.filter(x -> x != null);
				System.out.println(Arrays.toString(pts.toArray()));
			}
			
			
		codificator.close();
		}catch(PersonalError e) {
			System.out.println("error:" + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("error:" + e.getMessage());
		}
	}
	
}
