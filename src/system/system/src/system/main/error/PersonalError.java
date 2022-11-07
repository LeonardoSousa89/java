package system.main.error;

public class PersonalError extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public PersonalError(String msg) {
		super(msg);
	}
}
