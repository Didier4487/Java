package co.simplon.pokemon;

public class AppPokemon {

	public static void main(String[] args) {
		
		System.out.println("Il y a " + Pokemon.compteur + " Pokemons !");
		DeckPokemon monDeck = new DeckPokemon();
		monDeck.initialiser();
		monDeck.afficherListe();
		int combattant1 = (int)(Math.random() * Pokemon.compteur );
		int combattant2 = (int)(Math.random() * Pokemon.compteur );

		monDeck.combattrePokemon(monDeck.listePokemon.get(combattant1), monDeck.listePokemon.get(combattant2));
	}

}
