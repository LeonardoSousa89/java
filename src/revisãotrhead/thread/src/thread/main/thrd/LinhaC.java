package thread.main.thrd;

public class LinhaC extends Thread{
	
	public void run() {
		for(int i = 0; i < 10000000; i++) {
			System.out.println(i + "\t \t" + "Linha - C");
		}
	}
}
