package thread.main.linha;

public class LinhaB extends Thread{
	public void run() {
		for(int i = 0; i <= 10000000; i++) {
			System.out.println(i + "\t \t" + "linha - B");
		}
	}
}
