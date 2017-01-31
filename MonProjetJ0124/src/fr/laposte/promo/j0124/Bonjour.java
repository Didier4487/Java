package fr.laposte.promo.j0124;

public class Bonjour {
	
	private String message;
	
	public Bonjour(String message) {
		super();
		this.message = message;
	}
	
	public void afficherMessage() {
		System.out.println(this.message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message + " : est mon nouveau message !";
	}
	
	
	
}
