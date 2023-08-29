package exercices;

import java.util.Scanner;

import utilitaire.Input;

public class factorielle_while {

	public static void start(String[] args) {
	

		int i=1;
		int factorielle=1;
		
		Input.message("ecrire un nombre");
		
		
		int saisie = Input.nextInt();
		
		while (i<=saisie){
			
			factorielle = factorielle *i;
			i=i+1;
		}
		Input.resultat(factorielle);
	}

}