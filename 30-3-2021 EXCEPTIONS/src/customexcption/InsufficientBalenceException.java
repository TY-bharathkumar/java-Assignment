package customexcption;

public class InsufficientBalenceException extends Exception {

	public InsufficientBalenceException(String message) {
		super(message);

	}

	@Override
	public String getMessage() {

		return super.getMessage();
	}

}
