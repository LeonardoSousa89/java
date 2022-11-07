package relatorio.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import relatorio.main.error.PersonalException;

public class Leitora {
	public static  void main(String [] args) {
		
		try {
			
			String url = "C:/Users/Mendes/Desktop/java/src/relatório/repositorio/arqv1.txt";
			
			InputStream caminho = new FileInputStream(url);
			InputStreamReader leitor = new InputStreamReader(caminho);
			BufferedReader codificador = new BufferedReader(leitor);
			
			System.out.println("dados do arquivo:");
			System.out.println();
			String scaneando = codificador.readLine();
			
			while(scaneando != null) {
				System.out.println(scaneando);
				scaneando = codificador.readLine();
			}
			
			
		}catch(PersonalException e) {
			System.out.println("erro:" + e.getMessage());
		}catch (Exception e) {
			System.out.println("erro:" + e.getMessage());
		}
		
	}
}
