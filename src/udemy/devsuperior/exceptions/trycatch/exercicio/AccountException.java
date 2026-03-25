package udemy.devsuperior.exceptions.trycatch.exercicio;

public class AccountException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public AccountException(String msg) {
		super(msg);
	}

}
