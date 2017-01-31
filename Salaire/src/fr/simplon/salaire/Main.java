package fr.simplon.salaire;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe bob = new Employe(10, "bob");
		System.out.println("Le salaire annuel d'un salarié est de " + bob.calculerSalaire());
		
		
		Cadre Paul = new Cadre(25, "Paul", 1000);
		System.out.println("Le salaire annuel d'un cadre est de " + Paul.calculerSalaire());
		
		Pdg Bill = new Pdg(100, "Bill", 10000);
		System.out.println("Le salaire annuel du PDG est de " + Bill.calculerSalaire());
		
		
		System.out.println("L'entreprise verse tous les ans : " + (bob.calculerSalaire()*10 + Paul.calculerSalaire()*2 + Bill.calculerSalaire()));
	}

}
