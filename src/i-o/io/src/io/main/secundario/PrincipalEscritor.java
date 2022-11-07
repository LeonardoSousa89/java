package io.main.secundario;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import io.main.error.PersonalException;

public class PrincipalEscritor {
	public static void main(String [] args) {
		
		//erro descoberto excedido o uso de memória
		/*
		 *  java.lang.OutOfMemoryError: Java heap space
		 *  
		 *  arquivo de erro:  "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/novoarquivos.txt"
		 * */
		
		try {
			
			String url = "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/novoarquivos.txt";
			OutputStream entrada = new FileOutputStream(url);
			OutputStreamWriter escrivao = new OutputStreamWriter(entrada);
			BufferedWriter inserssor = new BufferedWriter(escrivao);
			
			inserssor.write("===================================");
			inserssor.newLine();
			inserssor.write("   		inserção");
			inserssor.newLine();
			inserssor.write("===================================");
			inserssor.newLine();
			inserssor.newLine();
			inserssor.write("documental");
			
			inserssor.close();
			
			
		}catch(PersonalException e) {
			System.out.println("erro:" + e.getMessage());
		}catch(Exception e) {
			System.out.println("erro:" + e.getMessage());
		}
		
	}
}
