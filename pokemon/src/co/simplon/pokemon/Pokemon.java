package co.simplon.pokemon;

public class Pokemon {
	static int compteur ;
	private String nom;
	private int ptsVie;
	private String niveau;

	public Pokemon(String nom, String niveau,  int ptsVie) {
		// TODO Auto-generated constructor stub
		compteur++;
		//super();
		this.nom = nom;
		this.niveau = niveau;
		this.ptsVie = ptsVie;
	}
	
	public void sePresenter() {
		System.out.println("Je suis " +  this.nom + " de niveau " +  this.niveau + " et ayant " +  this.ptsVie + " PV.");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPtsVie() {
		return ptsVie;
	}

	public void setPtsVie(int ptsVie) {
		this.ptsVie = ptsVie;
	}

}