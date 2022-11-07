package io.main.quintenario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import io.main.error.PersonalException;

public class PrincipalKeyboard {
	public static void main(String [] args) {
			
		try {
					
					String url = "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/novoarquivos.txt";
					
					InputStream entrada = System.in;
					InputStreamReader leitor = new InputStreamReader(entrada);
					BufferedReader codificado = new BufferedReader(leitor);
					
					OutputStream saida = new FileOutputStream(url);
					OutputStreamWriter escritor = new OutputStreamWriter(saida);
					BufferedWriter codificador = new BufferedWriter(escritor);
					
					System.out.println("escreva:");
					String leia = codificado.readLine();
					
					codificador.write(leia);
					 
					
					codificado.close();
					codificador.close();
					
					
				}catch(PersonalException e) {
					System.out.println("erro:" + e.getMessage());
				}catch(Exception e) {
					System.out.println("erro:" + e.getMessage());
				}
			
		
		}
}
