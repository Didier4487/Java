package fr.laposte.promo.j0124;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bonjour hello = new Bonjour("salut !");
		Bonjour hola = new Bonjour("hola !");
		
		hello.afficherMessage();
		hola.afficherMessage();
		System.out.println("L'aperçu du message est : " + hola.getMessage());
		hola.setMessage("Guten tag");
		System.out.println(hola.getMessage());
	}
}
