package fr.laposte.promo.j0126;

public class Vehicule {
	private String immatriculation;
	private String marque;
	private String modele;
	private int volume;
	private String tailleColis;
	private int nbChauffeur;
	
	public Vehicule(String immatriculation, String marque, String modele, int volume, String tailleColis, int nbChauffeur) {

		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.volume = volume;
		this.tailleColis = tailleColis;
		this.nbChauffeur = nbChauffeur;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getTailleColis() {
		return tailleColis;
	}

	public int getNbChauffeur() {
		return nbChauffeur;
	}
	
	
	
}
