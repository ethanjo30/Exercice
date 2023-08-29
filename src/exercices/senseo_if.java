package exercices;

import utilitaire.Input;

public class senseo_if {

	public static void start(String[] args) {
	

		int reservoir = 1360;
		int tasse = 0;
		
		if(reservoir>99){
			reservoir=reservoir-100;
			tasse=tasse+1;
		}
			else {
				Input.message("remplir le reservoir");
		}
		Input.resultat(tasse);
	}

}
