package co.simplon.rattrapage;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> nomListe = new ArrayList<>();
		
		System.out.println("Creation de la lIste ");
		creerListe(nomListe);
		System.out.println("La liste des impairs");
		afficherListeImpaire(nomListe);
		System.out.println("La liste des pairs");
		afficherListePaire(nomListe);
		System.out.println("Toute la liste");
		afficherTouteLaListe(nomListe);
	}

	public static void creerListe( ArrayList<Integer> nomListe) {
		int random = 0;
		for (int i = 0; i < 10; i++) {
			random = (int) (Math.random() * 100);
			nomListe.add(random); 
		}
		System.out.println(nomListe);
	}

	public static  void afficherListeImpaire(ArrayList<Integer> nomListe) {
		int j = 0;
		int element =0;
		ArrayList<Integer>affichageListe = new ArrayList<>();
		
		while (j < nomListe.size() ){
			element = (int) nomListe.get(j) ;
			if( element % 2 != 0){
				affichageListe.add(element);
			}
			j++;
		}
		System.out.println(affichageListe);
	}

	public static void afficherListePaire(ArrayList<Integer> nomListe) {
		ArrayList<Integer>affichageListe = new ArrayList<>();
		
		for (int element : nomListe) {
			if (element % 2 == 0) {
				affichageListe.add(element);
			}
		}
		System.out.println(affichageListe);
	}
	
	public static void afficherTouteLaListe(ArrayList<Integer> nomListe) {
		ArrayList<Integer>affichageListe = new ArrayList<>();
		
		for (Integer element : nomListe) {
			affichageListe.add(element);
		}
		System.out.println(affichageListe);
	}
}
