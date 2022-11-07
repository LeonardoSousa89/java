package io.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import io.main.error.PersonalException;

public class Principal {
	public static void main(String [] args) {
		
		//erro descoberto excedido o uso de memória
		/*
		 *  java.lang.OutOfMemoryError: Java heap space
		 *  
		 *  arquivo de erro:  "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/novoarquivos.txt"
		 * */
			
			try {
					
				//String url = "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/novoarquivos.txt";
				String url = "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/outroarquivo.txt";
				
				
				//String url = "C:/Users/Mendes/Desktop/api/package.json";   
				//String url = "C:/Users/Mendes/Desktop/api/knexfile.ts"; 
				//String url = "C:/Users/Mendes/Desktop/api/src/database/migrations/00_create_locations.ts";
				//String url = "C:/Users/Mendes/Desktop/cardinfo/frontend/web/loja.css";
				//String url = "C:/Users/Mendes/Desktop/cardinfo/frontend/web/loja.html";
				//String url = "C:/Users/Mendes/Desktop/cardinfo/frontend/web/loja.js";
				//String url = "C:/Users/Mendes/Desktop/store/database/db.sql";
				
				InputStream saida = new FileInputStream(url);
				InputStreamReader leitor = new InputStreamReader(saida);
				BufferedReader codificador = new BufferedReader(leitor);
				
				String objeto = codificador.readLine();
				
				while(objeto != null) {
					System.out.println(objeto);
					objeto = codificador.readLine();
				}
				
				codificador.close();
				
			}catch(PersonalException e) {
				System.out.println("erro" + e.getMessage());
			}
			catch(Exception e) {
				System.out.println("erro" + e.getMessage());
			}
	
			
	}
}
