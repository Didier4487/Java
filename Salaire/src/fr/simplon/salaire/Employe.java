package fr.simplon.salaire;

public class Employe {
	private int tauxHoraire;
	private String nom;
	
	public Employe(int tauxHoraire, String nom) {
		super();
		this.tauxHoraire = tauxHoraire;
		this.nom = nom;
	}

	public int calculerSalaire(){
		return getTauxHoraire() * 35 * 52;
	}
	
	public int getTauxHoraire() {
		return tauxHoraire;
	}

	public String getNom() {
		return nom;
	}
	
	
	
}
