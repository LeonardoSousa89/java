package relatorio.main.wrt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import relatorio.main.error.PersonalException;

public class Livro{
		public static void main(String [] args) {
				
				try {
					
					char resp = 'n';
					char resposta;
					Scanner responda = new Scanner(System.in);
					
					String url = "C:/Users/Mendes/Desktop/java/src/relatório/repositorio/arqv1.txt";
					
					
					InputStream entrada = System.in;
					InputStreamReader leitor = new InputStreamReader(entrada);
					BufferedReader codificado = new BufferedReader(leitor);
					
					OutputStream caminho = new FileOutputStream(url);
					OutputStreamWriter escrivao = new OutputStreamWriter(caminho);
					BufferedWriter codificador = new BufferedWriter(escrivao);
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("	=====================================");
					System.out.println("	|				    |");
					System.out.println(" 	|sistema desenvolvido por Leo Santos|");
					System.out.println("	|				    | ");
					System.out.println("	=====================================");
					
					System.out.println();
					System.out.println();
					System.out.println();
					
					System.out.println("insira os valores a serem computados:");
				
					String dados = codificado.readLine();
					codificador.append(dados);
					codificador.newLine();
					
					System.out.println("deseja inserir outro valor?(s/n):");
					resposta = responda.next().charAt(0);					
					
					
					while(resposta != resp) {
						System.out.println("insira os valores a serem computados:");
						dados = codificado.readLine();
						codificador.append(dados);
						codificador.newLine();
						
						System.out.println("deseja inserir outro valor?(s/n):");
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
