package exercices;

import utilitaire.Input;

public class index_exercices {

	public static void main(String[] args) {
		

		Input.message("Choisi un exercices entre 1 et 10");
		
		
		int exercices=Input.nextInt();
		
		switch (exercices){
		
		case 0:{
			factorielle_while.start(args);
			break;
		}
		case 1:{
			moyenne.start(args);
			break;
		}
		case 2:{
			Pommedeterre.start(args);
			break;
		}
		case 3:{
			senseo_if.start(args);
			break;
		}
		case 4:{
			senseo_while.start(args);
			break;
		}
		case 5:{
			somme_pour.start(args);
			break;
		}
		case 6:{
			somme_repeter.start(args);
			break;
		}		
		case 7:{
			somme_while.start(args);
			break;
		}		
		case 8:{
			tri_par_insertion.start(args);
			break;
		}		
		case 9:{
			trie_à_bulle.start(args);
			break;
		}		
		default:{
			Input.message("l'exercice demander n'est pas encore fait");
		}			
		}
	}
}

