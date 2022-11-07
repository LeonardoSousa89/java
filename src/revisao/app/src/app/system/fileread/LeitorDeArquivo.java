package app.system.fileread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import app.system.error.PersonalException;

public class LeitorDeArquivo {

	public static void main(String[] args) {
		
		  		/* elemento para leitura de dados em um arquivo */
				try {
					
					InputStream leitor = new FileInputStream("C:/Users/Mendes/Desktop/java/src/revisao/arquivo/arquivo.txt");
					InputStreamReader codificador = new InputStreamReader(leitor);
					BufferedReader interpretador = new BufferedReader(codificador);
					
					String resposta = interpretador.readLine();
					
					while(resposta != null) {
						System.out.println(resposta);
						resposta = interpretador.readLine();
					}
					
					interpretador.close();
					
				}catch(PersonalException e) {
					System.out.println("error" + e.getMessage());
				}catch(Exception e) {
					System.out.println("error" + e.getMessage());
				}
				
		}
}
