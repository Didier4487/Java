package fr.simplon.laposte;

public class Pingouin extends Oiseau implements IMouvement {
	
	public Pingouin(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bouger(){
			System.out.println("Je suis un pingouin (" + getNom() + ") et je marche");
	}
}
