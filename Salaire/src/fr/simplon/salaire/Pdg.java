package fr.simplon.salaire;

public class Pdg extends Cadre {
		
	public Pdg(int tauxHoraire, String nom, int prime) {
		// TODO Auto-generated constructor stub
		super(tauxHoraire, nom, prime);
		
	}
	
	public int calculerSalaire(){
		int mesFrais = getTauxHoraire() * 35 * 52 * 12 / 100;
		
		return getTauxHoraire() * 35 * 52 + getPrime() + mesFrais ;
	}
	
	
}
