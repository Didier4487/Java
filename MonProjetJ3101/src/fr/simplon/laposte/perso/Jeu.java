package fr.simplon.laposte.perso;

import java.util.ArrayList;

public class Jeu {

	public void jouer(ArrayList<IAttaque> mesGuerriers) {
		for (IAttaque monGuerrier : mesGuerriers) {
			monGuerrier.attaquer();
		}
	}
	
}
