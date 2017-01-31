package co.simplon.pokemon;

import java.util.ArrayList;

public class DeckPokemon {
	
	public ArrayList<Pokemon> listePokemon;

	public void initialiser() {
		ArrayList<Pokemon> listePokemon = new ArrayList<>();
		
		Pokemon nom1 = new Pokemon("Marisson","base",60);
		Pokemon nom2 = new Pokemon("Boguerisse","1",90);
		Pokemon nom3 = new Pokemon("Blindepique","2",150);
		
		listePokemon.add(nom1);
		listePokemon.add(nom2);
		listePokemon.add(nom3);
		
		this.listePokemon = listePokemon;
	}
	
	public void  afficherListe() {
		int i = 0;
		for (Pokemon monPokemon : listePokemon) {
			monPokemon.sePresenter();
			i++;
		}
		System.out.println("Le Deck contient " + i + " Pokemon");
	}
	
	public void combattrePokemon(Pokemon pokemon1, Pokemon pokemon2) {
		if (pokemon1.getPtsVie() == pokemon2.getPtsVie()) {
			System.out.println("Match nul entre " + pokemon1.getNom() +  " et " + pokemon2.getNom());
		}
		else if (pokemon1.getPtsVie() > pokemon2.getPtsVie()) {
			System.out.println("Vainqueur = " + pokemon1.getNom() + " Perdant = " + pokemon2.getNom());
		}
		else {
			System.out.println("Vainqueur = " + pokemon2.getNom() + " Perdant = " + pokemon1.getNom());
		}
	}
}
