package thread.main.linha;

public class LinhaA extends Thread{
	public void run() {
		for(int i = 0; i <= 10000000; i++) {
			System.out.println(i + "\t \t " + "linha - A");
		}
	}
}
