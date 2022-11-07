package Controller;

public class ExceptionApp extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ExceptionApp(String msg) {
		super(msg);
	}
}
