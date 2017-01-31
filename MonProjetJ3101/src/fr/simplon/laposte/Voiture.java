package fr.simplon.laposte;

public class Voiture implements IMouvement {
	
	public Voiture() {
		super();
	}

	@Override
	public void bouger(){
		System.out.println("Je suis une voiture et je roule");
	}
}
