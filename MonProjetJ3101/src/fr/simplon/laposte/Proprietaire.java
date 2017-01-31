package fr.simplon.laposte;

import java.util.ArrayList;

public class Proprietaire {
	private Oie monOie;
	private Pingouin monPingouin;
	private Voiture maVoiture;
	private Dresseur monDresseur;
	
	public Proprietaire() {
		this.monOie = new Oie("Marguerite");
		this.monPingouin = new Pingouin("Nestor");
		this.maVoiture = new Voiture();
		this.monDresseur = new Dresseur();
	}
	public void bougerMesPossessions() {
		ArrayList<IMouvement> maListe = new ArrayList<IMouvement>();
		maListe.add(this.monOie);
		maListe.add(this.monPingouin);
		maListe.add(this.maVoiture);
		this.monDresseur.faireBouger(maListe);
	}	
}
