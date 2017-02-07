package fr.simplon.lecture.fichier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectureFichierTexte {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String nomDeFichier = "C:\\Users\\Simplon\\Documents\\ListeData.txt";
		
		File monFichier = new File (nomDeFichier);
		
		Scanner scan = new Scanner(monFichier);
		String maLigne1, maLigne2, maLigne3;
		
		while (scan.hasNextLine()) {
			//maLigne = scan.nextLine();
			//System.out.println(maLigne);
				maLigne1 = scan.next();
				maLigne2 = scan.next();
				maLigne3 = scan.next();
				System.out.printf("%-15s\t%-15s\t%10s", maLigne1,maLigne2,maLigne3);
				
				System.out.printf("\n");
		}
		scan.close();
	}
}
