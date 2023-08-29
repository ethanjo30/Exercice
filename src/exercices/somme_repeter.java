package exercices;

import java.util.Scanner;

import utilitaire.Input;

public class somme_repeter {

	public static void start(String[] args) {
	

		int taille=5;
		int tabNote []=new int[5];
		int somme=0;
		
		/**
		 * message pour ecrire les nombres
		 */
		
		Input.message("Veuillez écrire des nombre");

		/**
		 * boucle de lecture des nombres pour les mettre dans tabNote
		 */
		
		for(int i = 0; i<taille; i++) {
			tabNote[i]=Input.nextInt();
		}
		int i=0;
		
		/**
		 * boucle de calcule de somme 
		 */
		do {
			somme = somme + tabNote [i];
		i+=1;
		} 
		while (i <= taille-1);
		
		Input.resultat(somme);
	}

}
