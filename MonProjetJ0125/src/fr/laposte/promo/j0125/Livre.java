package fr.laposte.promo.j0125;

public class Livre {

		public String isbn;
		public String nomAuteur;
		public String titre;
		public int prix;
	
		public Livre(String isbn, String nomAuteur, String titre, int prix) {
			// TODO Auto-generated constructor stub
			super();
			this.isbn = isbn;
			this.nomAuteur = nomAuteur;
			this.titre = titre;
			this.prix = prix;
		}
		
		public void afficherContenu() {
			System.out.println("Le livre " + this.titre + " écrit par  " + this.nomAuteur + " possède le n° " + this.isbn   + " et coûte " + this.prix +  "€");
		}
	}
	
	


