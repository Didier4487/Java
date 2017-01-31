package fr.simplon.laposte;

public class Oie extends Oiseau implements IMouvement {

	public Oie(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void bouger(){
		System.out.println("Je suis une oie (" + getNom() + ") et je vole");
	}
}
