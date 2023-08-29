package exercices;

import utilitaire.Input;

public class tri_par_insertion {

	public static void start(String[] args) {
	


		Input.message("avant le tri");
		int j =1;
		  int [] tab= {6, 5, 9, 2, 7, 1, 8, 10, 3, 4};
			for (int n : tab) {
				Input.resultat(n);
			}
			
			for(int i = 1; i < tab.length; i++){
				int cle = tab[i];
				j=i;
					while ( j > 0 && tab[j-1] > cle) {
						do{
							tab[j] = tab[j-1];
							j=j-1;
						}while(cle>tab[i]);
						
						tab[j] = cle;
				}
					}

				Input.message("aprés le tri");
				for (int n : tab) {
					Input.resultat(n);
				}
			}
		}
				
			
		  
		  
	
