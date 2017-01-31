package fr.laposte.promo.j0124.bis;

public class Animal {
	
	private String race;
	private String nom;
	private float taille;
	private int age;
	
	public Animal(String race, String nom, int age, float taille) {
		// TODO Auto-generated constructor stub
		super();
		this.race = race;
		this.nom = nom;
		this.age = age;
		this.taille = taille;
	}

	public void seDecrire() {
		System.out.println("Je suis un " + this.race + ", mon nom est " + this.nom + ", mon âge est " + this.age + " ans et je mesure " + this.taille +  " cm");
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
