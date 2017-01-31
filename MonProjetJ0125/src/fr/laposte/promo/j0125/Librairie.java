package fr.laposte.promo.j0125;

import java.util.ArrayList;
import java.util.List;

public class Librairie {
	
	public String nomLibrairie;
	public ArrayList<Livre> listeLivres;
	
	public Librairie(String nomLibrairie) {
		// TODO Auto-generated constructor stub
		super();
		this.nomLibrairie = nomLibrairie;
	}

	public void initialiser() {
		ArrayList<Livre> listeLivres = new ArrayList<>();
		
		Livre premierLivre = new Livre("3289080","Leila SLIMANI","Chanson douce",25);
		Livre deuxiemeLivre = new Livre("4332438","Gaël FAYE","Petit pays",32);
		Livre troisiemeLivre = new Livre("9067453","Catherine CUSSET","L'autre qu'on adorait",19);
		Livre quatriemeLivre = new Livre("8976383","Régis JAUFFRET","Cannibales",12);
		Livre cinquiemeLivre = new Livre("1234546","Yasmina REZA","Babylone",20);
		Livre sixiemeLivre = new Livre("8763903","Yasmina REZA","Le Dieu du carnage",6);
		Livre septiemeLivre = new Livre("5656834","Simon LIBERATI","California girls",20);
		Livre huitiemeLivre = new Livre("5226834","Ted CHIANG","La tour de Babylone",9);
		
		listeLivres.add(premierLivre);
		listeLivres.add(deuxiemeLivre);
		listeLivres.add(troisiemeLivre);
		listeLivres.add(quatriemeLivre);
		listeLivres.add(cinquiemeLivre);
		listeLivres.add(sixiemeLivre);
		listeLivres.add(septiemeLivre);
		listeLivres.add(huitiemeLivre);
		
		this.listeLivres = listeLivres;
	}
	
	public void seDecrire() {
		System.out.println("Livre n°" + this.listeLivres + this.listeLivres.size());
	}
	
	public void  afficherListe() {
		int i = 0;
		System.out.println("Liste des livres de la librairie");
		for (Livre monLivre : listeLivres) {
			monLivre.afficherContenu();
			i++;
		}
		System.out.println("La librairie contient " + i + " livres");
	}
	
	public void  afficherLivreAuteur(String nomAuteur) {
		int i = 0;
		System.out.println("Liste des livres dont l'auteur est : " +  nomAuteur );
		for (Livre monLivre : listeLivres) {
			if (nomAuteur == monLivre.nomAuteur) {
				monLivre.afficherContenu();
				i++;
			}
		}
		System.out.println("La librairie contient " + i + " livres dont l'auteur est " + nomAuteur);
	}
		public void  afficherLivrePrix(int prix) {
			int i = 0;
			System.out.println("Liste des livres qui coûtent : " +  prix + "€");
			for (Livre monLivre : listeLivres) {
				if (prix == monLivre.prix) {
					monLivre.afficherContenu();
					i++;
				}
			}
			System.out.println("La librairie contient " + i + " livres qui coûtent " + prix + "€");
	}
}
