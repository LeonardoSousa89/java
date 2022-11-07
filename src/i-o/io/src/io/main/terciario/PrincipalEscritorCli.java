package io.main.terciario;

import java.io.PrintStream;
import java.util.Scanner;

import io.main.error.PersonalException;

public class PrincipalEscritorCli {
	public static void main(String[] args) {
		
		//erro descoberto excedido o uso de memória
		/*
		 *  java.lang.OutOfMemoryError: Java heap space
		 *  
		 *  arquivo de erro:  "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/novoarquivos.txt"
		 * */
		
		try {
			
			String url = "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/novoarquivos.txt";
			
			Scanner entrada = new Scanner(System.in);
			PrintStream impressor = new PrintStream(url);
			
			System.out.println("escreva:");
			String escrita = entrada.next();
			
			impressor.append(escrita);
			
		impressor.close();
		
		}catch(PersonalException e) {
			System.out.println("erro:" + e.getMessage());
		}catch(Exception e) {
			System.out.println("erro:" + e.getMessage());
		}
		
	}
}
