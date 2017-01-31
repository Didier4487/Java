package fr.animal.familier;

public class MaitreAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalFamilier monAnimal = new AnimalFamilier();
		monAnimal.manger();
		monAnimal.dormir();
		System.out.println(monAnimal.parler("Bonjour !"));
		Poisson monPoisson = new Poisson();
		System.out.println(monPoisson.parler("Je suis un poisson !"));
	}

}
