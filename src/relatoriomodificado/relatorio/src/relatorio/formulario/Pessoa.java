package relatorio.formulario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import relatorio.erro.ExcessaoPessoal;

//exemplo nivel de complexidade 3
public class Pessoa {
	public static void main(String[] args) {
		
		try {
			
			
			String url = "C:/Users/Mendes/Desktop/java/src/relatoriomodificado/repositorio/formulario2.txt";
			
			char resp = 'n';
			char resposta = 's';
			Scanner responda = new Scanner(System.in);
			
			InputStream entrada = System.in;
			InputStreamReader leitor = new InputStreamReader(entrada);
			BufferedReader codificador = new BufferedReader(leitor);
			
			OutputStream saida = new FileOutputStream(url);
			OutputStreamWriter escrivao = new OutputStreamWriter(saida);
			BufferedWriter codificado = new BufferedWriter(escrivao);
			
		
			/*grava estes valores em 'String' no arquivo*/
			codificado.write("===========================");
			codificado.newLine();
			codificado.write("|            		  |");
			codificado.newLine();
			codificado.write("|        Dados            |");
			codificado.newLine();	
			codificado.write("|            		  |");
			codificado.newLine();
			codificado.write("===========================");
			
			codificado.newLine();
			codificado.newLine();
			codificado.newLine();
			
			codificado.write("entrada:");
			
			//saida para o usu�rio em tempo de execu��o
			System.out.println("===========================");
			System.out.println("|            		  |");
			System.out.println("|        Dados            |");
			System.out.println("|            		  |");
			System.out.println("===========================");
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			//saida para o usu�rio em tempo de execu��o
			System.out.println("entrada:");
			//quebra uma linha
			codificado.newLine(); 
			
			//saida para o usu�rio em tempo de execu��o
			System.out.println("usuario:");
			//inseri este campo no arquivo 
			codificado.write("usuario:");
			//l� o que foi escrito atrav�s do teclado.
			String	leitorEmTempodeExecucao = codificador.readLine(); 
			//escreve no arquivo o que foi capturado a partir do teclado.
			codificado.write(leitorEmTempodeExecucao); 
			//quebra uma linha
			codificado.newLine();
			
			//saida para o usu�rio em tempo de execu��o
			System.out.println("nome:");
			//inseri este campo no arquivo 
			codificado.write("nome:");
			//l� o que foi escrito atrav�s do teclado.
			leitorEmTempodeExecucao = codificador.readLine(); 
			//escreve no arquivo o que foi capturado a partir do teclado.
			codificado.write(leitorEmTempodeExecucao); 
			//quebra uma linha
			codificado.newLine(); 
			
			//saida para o usu�rio em tempo de execu��o
			System.out.println("cep:");
			//inseri este campo no arquivo 
			codificado.write("cep:");
			//l� o que foi escrito atrav�s do teclado.
			leitorEmTempodeExecucao = codificador.readLine(); 
			//escreve no arquivo o que foi capturado a partir do teclado.
			codificado.write(leitorEmTempodeExecucao); 
			//quebra uma linha
			codificado.newLine(); 
			
			//saida para o usu�rio em tempo de execu��o
			System.out.println("telefone:");
			//inseri este campo no arquivo 
			codificado.write("telefone:");
			//l� o que foi escrito atrav�s do teclado.
			leitorEmTempodeExecucao = codificador.readLine(); 
			//escreve no arquivo o que foi capturado a partir do teclado.
			codificado.write(leitorEmTempodeExecucao); 
			//quebra uma linha
			codificado.newLine(); 
			
			//saida para o usu�rio em tempo de execu��o
			System.out.println("email:");
			//inseri este campo no arquivo 
			codificado.write("email:");
			//l� o que foi escrito atrav�s do teclado.
			leitorEmTempodeExecucao = codificador.readLine(); 
			//escreve no arquivo o que foi capturado a partir do teclado.
			codificado.write(leitorEmTempodeExecucao); 
			//quebra uma linha
			codificado.newLine(); 
			
			//saida para o usu�rio em tempo de execu��o
			System.out.println("senha:");
			//inseri este campo no arquivo 
			codificado.write("senha:");
			//l� o que foi escrito atrav�s do teclado.
			leitorEmTempodeExecucao = codificador.readLine(); 
			//escreve no arquivo o que foi capturado a partir do teclado.
			codificado.write(leitorEmTempodeExecucao); 
			//quebra uma linha
			codificado.newLine(); 
			
			//quebra uma linha
			codificado.newLine(); 
			
			//saida para o usu�rio em tempo de execu��o
			System.out.println("tecnologias:");
			//inseri este campo no arquivo 
			codificado.write("tecnologias:");
			//l� o que foi escrito atrav�s do teclado.
			leitorEmTempodeExecucao = codificador.readLine(); 
			//escreve no arquivo o que foi capturado a partir do teclado.
			codificado.write(leitorEmTempodeExecucao); 
			//quebra uma linha
			codificado.newLine(); 
			
			System.out.println("inserir um novo usu�rio?(s/n)");
			resposta = responda.next().charAt(0);		
			
			
			
			//la�o para a reinser��o de dados
			while(resposta != resp) { 
				
				//saida para o usu�rio em tempo de execu��o
				System.out.println("entrada:");
				//quebra uma linha
				codificado.newLine(); 
				
				//saida para o usu�rio em tempo de execu��o
				System.out.println("usuario:");
				//inseri este campo no arquivo 
				codificado.write("usuario:");
				//l� o que foi escrito atrav�s do teclado.
				leitorEmTempodeExecucao = codificador.readLine(); 
				//escreve no arquivo o que foi capturado a partir do teclado.
				codificado.write(leitorEmTempodeExecucao); 
				//quebra uma linha
				codificado.newLine();
				
				//saida para o usu�rio em tempo de execu��o
				System.out.println("nome:");
				//inseri este campo no arquivo 
				codificado.write("nome:");
				//l� o que foi escrito atrav�s do teclado.
				leitorEmTempodeExecucao = codificador.readLine(); 
				//escreve no arquivo o que foi capturado a partir do teclado.
				codificado.write(leitorEmTempodeExecucao); 
				//quebra uma linha
				codificado.newLine(); 
				
				//saida para o usu�rio em tempo de execu��o
				System.out.println("cep:");
				//inseri este campo no arquivo 
				codificado.write("cep:");
				//l� o que foi escrito atrav�s do teclado.
				leitorEmTempodeExecucao = codificador.readLine(); 
				//escreve no arquivo o que foi capturado a partir do teclado.
				codificado.write(leitorEmTempodeExecucao); 
				//quebra uma linha
				codificado.newLine(); 
				
				//saida para o usu�rio em tempo de execu��o
				System.out.println("telefone:");
				//inseri este campo no arquivo 
				codificado.write("telefone:");
				//l� o que foi escrito atrav�s do teclado.
				leitorEmTempodeExecucao = codificador.readLine(); 
				//escreve no arquivo o que foi capturado a partir do teclado.
				codificado.write(leitorEmTempodeExecucao); 
				//quebra uma linha
				codificado.newLine(); 
				
				//saida para o usu�rio em tempo de execu��o
				System.out.println("email:");
				//inseri este campo no arquivo 
				codificado.write("email:");
				//l� o que foi escrito atrav�s do teclado.
				leitorEmTempodeExecucao = codificador.readLine(); 
				//escreve no arquivo o que foi capturado a partir do teclado.
				codificado.write(leitorEmTempodeExecucao); 
				//quebra uma linha
				codificado.newLine(); 
				
				//saida para o usu�rio em tempo de execu��o
				System.out.println("senha:");
				//inseri este campo no arquivo 
				codificado.write("senha:");
				//l� o que foi escrito atrav�s do teclado.
				leitorEmTempodeExecucao = codificador.readLine(); 
				//escreve no arquivo o que foi capturado a partir do teclado.
				codificado.write(leitorEmTempodeExecucao); 
				//quebra uma linha
				codificado.newLine(); 
				
				//quebra uma linha
				codificado.newLine(); 
				
				//saida para o usu�rio em tempo de execu��o
				System.out.println("tecnologias:");
				//inseri este campo no arquivo 
				codificado.write("tecnologias:");
				//l� o que foi escrito atrav�s do teclado.
				leitorEmTempodeExecucao = codificador.readLine(); 
				//escreve no arquivo o que foi capturado a partir do teclado.
				codificado.write(leitorEmTempodeExecucao); 
				//quebra uma linha
				codificado.newLine(); 
				
				System.out.println("inserir um novo usu�rio?(s/n)");
				resposta = responda.next().charAt(0);
			}
			
			codificado.newLine(); 
			codificado.newLine(); 
			codificado.write("programa escrito e desenvolvido por Leonardo sousa propriet�rio de C.O.A.V tecnologies INC.");
			
			codificador.close();
			codificado.close();
			
			}catch(ExcessaoPessoal e) {
				System.out.println("erro: " + e.getMessage());
			}catch(Exception e) {
				System.out.println("erro: " + e.getMessage());
			}
		
	}
}
