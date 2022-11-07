package thread.main;

import thread.main.linha.LinhaA;
import thread.main.linha.LinhaB;
import thread.main.thrd.LinhaC;
import thread.main.thrd.LinhaD;

public class Principal {
	public static void main(String[] args) {
		
		
		LinhaA linhaa = new LinhaA();
		Thread exibicaoa = new Thread(linhaa);
		exibicaoa.start();
		
		LinhaB linhab = new LinhaB();
		Thread exibicaob = new Thread(linhab);
		exibicaob.start();
		
		LinhaC linhac = new LinhaC();
		Thread exibicaoc = new Thread(linhac);
		exibicaoc.start();
		
		LinhaD linhad = new LinhaD();
		Thread exibicaod = new Thread(linhad);
		exibicaod.start();
		
		
		
	}
}
