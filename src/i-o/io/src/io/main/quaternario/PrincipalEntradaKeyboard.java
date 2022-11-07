package io.main.quaternario;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import io.main.error.PersonalException;

public class PrincipalEntradaKeyboard {
	public static void main(String[] args) {
		
		try {
			
			InputStream entrada = System.in;
			InputStreamReader leitor = new InputStreamReader(entrada);
			BufferedReader codificador = new BufferedReader(leitor);
			
			String leia = codificador.readLine();
			
			while(leia != null) {
				System.out.println(leia);
				leia = codificador.readLine();
			}
			
			codificador.close();
			
		}catch(PersonalException e) {
			System.out.println("erro:" + e.getMessage());
		}catch(Exception e) {
			System.out.println("erro:" + e.getMessage());
		}
		
		
	}
}
