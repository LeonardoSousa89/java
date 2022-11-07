package arrow.componente;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Impressao {
	
	final String url = "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/outroarquivo.txt";
	
	public Impressao() {}

	
	 void impressao()	{
		 try {
			 InputStream entrada = new FileInputStream(url);
			 InputStreamReader leitor = new InputStreamReader(entrada);
			 BufferedReader codificador = new BufferedReader(leitor);
			 
			 String dados = "dados";
			 
			 while(dados != null) {
				 	dados = codificador.readLine();
				 	List<String> leitura = new ArrayList<>();
				 	leitura.add(dados);
				 	
				 	System.out.println(Arrays.asList(leitura).toString());
			 }
			 
			 codificador.close();
		 }catch(IOException e) {
			 e.printStackTrace();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 
	 }
}
