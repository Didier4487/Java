package fr.laposte.promo.j0126;

public class VehiculeElectique extends Vehicule {
	
	private int autonomieBatterie;
	
	public VehiculeElectique(String immatriculation, String marque, String modele, int volume, String tailleColis, int nbChauffeur) {
		super(immatriculation, marque, modele, volume, tailleColis, nbChauffeur);
		// TODO Auto-generated constructor stub

		this.autonomieBatterie = 2;
	}

	public void sAnnoncer() {
		System.out.println("Je suis un " + this.getMarque() + " " + this.getModele()  + " avec une batt (" + this.autonomieBatterie + ")");
	}

}
