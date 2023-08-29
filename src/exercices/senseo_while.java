package exercices;

import utilitaire.Input;

public class senseo_while {

	public static void start(String[] args) {
	

		int reservoir = 1360;
		int tasse = 0;
		
		while(reservoir>99) {
			reservoir=reservoir-100;
			tasse=tasse+1;
		}
		Input.resultat(tasse);
		

}
}