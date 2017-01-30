package fr.simplon.bateau;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voilier monVoilier = new Voilier(25, 5, 1, 30);
		monVoilier.sExprimer();
		monVoilier.afficherVitesse();
		Chalutier monChalutier = new Chalutier(40,30,10,45,1000);
		monChalutier.sExprimer();
		monChalutier.afficherVitesse();
		monChalutier.afficherDistance();
	}

}
