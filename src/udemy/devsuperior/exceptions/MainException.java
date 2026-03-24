package udemy.devsuperior.exceptions;

public class MainException extends Exception {
	
	private static final long serialVersionUID = 1L;

	// Instancia a classe passando a mensagem personalizada armazenando na exception
	public MainException(String msg) {
		super(msg);
	}
	
}
