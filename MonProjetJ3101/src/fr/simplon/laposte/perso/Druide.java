package fr.simplon.laposte.perso;

public class Druide implements IAttaque {

	private String nom;
	private int age;
	
	public Druide(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	@Override
	public void attaquer() {
		// TODO Auto-generated method stub
		System.out.println("Je suis " + this.nom + ", j'ai " + this.age + " ans et je cueille le gui !");
	}

	
}
