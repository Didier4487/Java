package fr.simplon.laposte.perso;

public class Romain extends Guerrier implements IAttaque {

	public Romain(String nom, String arme) {
		super(nom, arme);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attaquer() {
		System.out.println("Je suis " + getNom() + " et j'attaque avec un " + getArme() + " !");
	}

}
