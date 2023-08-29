package exercices;

import java.util.Scanner;

import utilitaire.Input;

public class Pommedeterre {

	public static void start(String[] args) {
	
		
	/**
	 * déclaration des constantes
	 */
		
	/**
	 * déclaration des variable
	 */
	
	Input.message("Veuillez donner le nombre de PDT");
	
	int aller = 0;
	int pommeDeTerre = Input.nextInt();
	
	/**
	 * déclaration délément d'instance
	 */
	while (pommeDeTerre>=0){
	pommeDeTerre = pommeDeTerre -3;
	aller = aller + 1;
	}
	
	Input.resultat(aller);
}
	
}
