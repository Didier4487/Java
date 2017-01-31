package fr.laposte.promo.j0125;

public class GestionLibrairie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Librairie maLibrairie = new Librairie("LibrairieDR");

		maLibrairie.initialiser();
		maLibrairie.afficherListe();
		maLibrairie.afficherLivreAuteur("Yasmina REZA");
		maLibrairie.afficherLivrePrix(20);
	}

}
