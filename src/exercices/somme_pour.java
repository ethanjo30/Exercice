package exercices;


import utilitaire.Input;

public class somme_pour {

	public static void start(String[] args) {
		

		int taille = 4;
		int tabNote [] = new int [4];
		int somme = 0;
		
		Input.message("Veuillez saisir les note");
		
		for (int i=0; i<taille; i++) {
			tabNote[i] = Input
					.nextInt();
		}
		
		for (int i=0; i<taille-1; i++) {
			somme = somme + tabNote[i];
		}
		
		Input.resultat(somme);
		
	}

}
