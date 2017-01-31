package fr.laposte.promo.j0126;

public class VehiculeDiesel extends Vehicule {
	private String tailleColis;
	private int nbChauffeur;
	private int autonomieFiltreGasoil;
	
	public VehiculeDiesel(String immatriculation, String marque, String modele, int volume, String tailleColis, int nbChauffeur) {
		super(immatriculation, marque, modele, volume,tailleColis, nbChauffeur);
		// TODO Auto-generated constructor stub
		this.autonomieFiltreGasoil = autonomieFiltreGasoil;
	}

	public void sAnnoncer() {
		System.out.println("Je suis un " + this.getMarque() + " " + this.getModele() + " etmon filtre gasoil dure " + this.autonomieFiltreGasoil);
	}
	
}
