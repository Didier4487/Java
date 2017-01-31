package fr.simplon.salaire;

public class Cadre extends Employe {
	private int prime;
	
	public Cadre(int tauxHoraire, String nom, int prime) {
		super(tauxHoraire, nom);
		this.prime = prime;
	}

	public int getPrime() {
		return prime;
	}

	public int calculerSalaire(){
		return getTauxHoraire() * 35 * 52 + getPrime();
	}
	
}
