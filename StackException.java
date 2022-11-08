
public class StackException extends RuntimeException {
	
	public StackException() {
		super();
	}
	
	public StackException(String str) {
		super("From STACK_EXCEPTION: " + str);
	}
}

