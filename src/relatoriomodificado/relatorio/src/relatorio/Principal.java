package relatorio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import relatorio.erro.ExcessaoPessoal;

//exemplo nivel de complexidade 1
public class Principal {
	public static void main(String [ ] args) {
			
		try {
			
			String url = "C:/Users/Mendes/Desktop/java/src/relatoriomodificado/repositorio/formulario2.txt";
			
			InputStream saida = new FileInputStream(url);
			InputStreamReader leitor  = new InputStreamReader(saida);
			BufferedReader codificado = new BufferedReader(leitor);
			
			String impressora = codificado.readLine();
			
			while(impressora != null) {
				System.out.println(impressora);
				impressora = codificado.readLine();
			}
			
			codificado.close();
			
			}catch(ExcessaoPessoal e) {
				System.out.println("erro: " + e.getMessage());
			}catch(Exception e) {
				System.out.println("erro: " + e.getMessage());
			}
		
	}
}
