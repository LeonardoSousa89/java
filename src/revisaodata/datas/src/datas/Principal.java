package datas;

import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import datas.erro.Excessao;
import datas.file.Datas;
import datas.view.Tela;

public class Principal {
	public static void main(String [] args) {
		
		try {
					

			Scanner entrada = new Scanner(System.in);
			Set<Datas> informacao  = new HashSet<>();
			char resp = 'n';
			char resposta = 's';
			
			Tela espere = new Tela();
			espere.tela1();
			espere.temporizador();
			espere.temporizador2();
			
			espere.tela3();
			Long id = entrada.nextLong();
			espere.tela3a();
			
			espere.tela4();
			String nome = entrada.next();
			espere.tela4a();
			
			espere.tela5();
			String cargo = entrada.next();
			espere.tela5a();
			
			espere.tela6();
			Datas momento = new Datas();
			espere.tela6a();
			
						System.out.println();
						System.out.println("gostaria de inserir novos dados? (s/n):");
						resposta = entrada.next().charAt(0);
						
						while(resposta != resp) {
							espere.tela3();
							id = entrada.nextLong();
							espere.tela3a();
							
							espere.tela4();
							nome = entrada.next();
							espere.tela4a();
							
							espere.tela5();
							cargo = entrada.next();
							espere.tela5a();
							
							espere.tela6();
							momento = new Datas();
							espere.tela6a();
							
							informacao.add(new Datas(id, nome, cargo));
							
							System.out.println();
							System.out.println("gostaria de inserir novos dados? (s/n):");
							resposta = entrada.next().charAt(0);
						}
						
			informacao.add(new Datas(id, nome, cargo));
			
			for(Datas valores :informacao) {
					System.out.print(valores.toString() + momento.getMomento().now());
			}
			
			
			espere.tela7();
			
			
		}catch(Excessao e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}	
				
	}
}

