package exercices;

import java.util.Scanner;

import utilitaire.Input;

public class somme_while {

	public static void start(String[] args) {
	

		int taille = 5;
		int tabNote [] = new int [5];
		int somme = 0;
				
		Input.message("Veuillez saisir les notes");
		
		for (int i=0; i<taille; i++) {
			tabNote[i] = Input.nextInt();
		}
		
		int i = 0;
		while(i<=taille-1) {
			somme = somme + tabNote[i];
			i=i+1;
		}
		
		Input.resultat(somme);
	}

}
