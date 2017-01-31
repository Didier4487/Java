package fr.simplon.laposte.perso;

import java.util.ArrayList;

public class Joueur {
	private Romain monRomain;
	private Gaulois monGaulois;
	private Druide monDruide;
	private Druide monDruide2;
	private Jeu monJeu;
	
	public Joueur() {
		this.monRomain = new Romain("Julius","javelot");
		this.monGaulois = new Gaulois("Franprix", "glaive");
		this.monDruide = new Druide("Merlin",152);
		this.monDruide2 = new Druide("Symbolix",183);
		this.monJeu = new Jeu();
	}

	public void animerGuerrier(){
		ArrayList<IAttaque> maListe;
		
		maListe = new ArrayList<>();
		maListe.add(monRomain);
		maListe.add(monGaulois);
		maListe.add(monDruide);
		maListe.add(monDruide2);
		this.monJeu.jouer(maListe);
	}
}
