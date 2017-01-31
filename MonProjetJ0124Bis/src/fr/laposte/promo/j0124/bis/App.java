package fr.laposte.promo.j0124.bis;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal chien = new Animal("chien", "Médor", 7, 52.0f);
		Animal chat = new Animal("chat", "Pussy", 3, 28.5f);
		Animal vache = new Animal("vache", "Marguerite", 8, 162.6f);
		
		chien.seDecrire();
		chat.seDecrire();
		vache.seDecrire();
		vache.setNom("Limousine");
		vache.seDecrire();
	}

}
