package fr.simplon.bateau;
public class Chalutier extends Bateau {
	private int distance;
	
	public Chalutier(int longueur, int tonnage, int equipage, int vitesse, int distance) {
		super(longueur, tonnage, equipage, vitesse);
		this.distance = distance;
		// TODO Auto-generated constructor stub
	}
public void afficherDistance() {
	System.out.println("Je peux parcourir " + getDistance() + " mille" );
}
public int getDistance() {
	return distance;
}


}
