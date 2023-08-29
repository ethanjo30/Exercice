package exercices;

import java.util.Scanner;

import utilitaire.Input;

public class moyenne {

	public static void start(String[] args) {
	
		
		int taille = 9;
		int tabNote[] = new int[taille];
		int somme = 0;
		int moyenne = 0;
	
		/**
		 * boucle demande des notes
		 */
		
		Input.message("Veuillez saisir les note des eleves");
		
		for (int i = 0; i < taille-1; i++) {
			tabNote[i]=Input.nextInt();
		}
		
		/**
		 * boucle moyenne
		 */
		
		for (int i = 0; i <= taille-1; i++) {
			somme = somme + tabNote[i];
		}
		
		moyenne = somme / taille;
		Input.resultat(moyenne);
			
		
		
		}
		
	
	}
