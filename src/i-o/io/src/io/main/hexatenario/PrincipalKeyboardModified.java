package io.main.hexatenario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import io.main.error.PersonalException;

public class PrincipalKeyboardModified {

	public static void main(String[] args) {
			
		
		try {
				
				char resp = 'n';
				
				//String url = "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/outroarquivo.txt";
				String url = "C:/Users/Mendes/Desktop/java/src/i-o/arquivos/novoarquivo.txt";
				
				InputStream entrada = System.in;
				InputStreamReader leitor = new InputStreamReader(entrada);
				BufferedReader codificado = new BufferedReader(leitor);
				
				OutputStream saida = new FileOutputStream(url);
				OutputStreamWriter escritor = new OutputStreamWriter(saida);
				BufferedWriter codificador = new BufferedWriter(escritor);
				
				System.out.println("escreva:");
				String leia = codificado.readLine();
				
				codificador.write(leia);
				codificador.newLine();
				 
				System.out.println("deseja continuar?(s/n)");
				Scanner responda = new Scanner(System.in);
				char resposta = responda.next().charAt(0);
				
				while(resposta != resp) {
					
					System.out.println("escreva:");
					leia = codificado.readLine();
					
					codificador.write(leia);
					codificador.newLine();
					
					System.out.println("deseja continuar?(s/n)");
					resposta = responda.next().charAt(0);
				}
				
				codificado.close();
				codificador.close();
				
				
			}catch(PersonalException e) {
				System.out.println("erro:" + e.getMessage());
			}catch(Exception e) {
				System.out.println("erro:" + e.getMessage());
			}

		
	}
}
