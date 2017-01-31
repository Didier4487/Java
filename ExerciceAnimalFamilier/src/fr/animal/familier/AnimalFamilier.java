package fr.animal.familier;

public class AnimalFamilier {
	private float poids;
	private float taille;
	private String couleur;
	private int age;
	
	public void dormir() {
		System.out.println("Bonne nuit !");
	}
	
	public void manger() {
		System.out.println("J'ai faim !");
	}

	public String parler(String unMot) {
		String reponseAnimal = "OK ! OK ! " + unMot;
		return reponseAnimal;
	}
	
	
}

