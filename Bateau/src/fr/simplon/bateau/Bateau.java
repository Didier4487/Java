package fr.simplon.bateau;

public class Bateau {
	private int longueur;
	private int tonnage;
	private int equipage;
	private int vitesse;
	
	public Bateau(int longueur, int tonnage, int equipage, int vitesse) {
		super();
		this.longueur = longueur;
		this.tonnage = tonnage;
		this.equipage = equipage;
		this.vitesse = vitesse;
	}

	public void afficherVitesse() {
		System.out.println("La vitesse du bateau est de " + getVitesse() + " noeuds !");
	}
	
	public void sExprimer() {
		System.out.println("Je suis un bâteau");
	}
	
	public float getVitesse() {
		return vitesse;
	}
	
}
