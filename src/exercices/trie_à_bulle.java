package exercices;


public class trie_à_bulle {

	public static void start(String[] args) {
	

		Input.message("avant le tri");
		int k = 0;

		int tabNonTrier[] = { 23, 2, 52, 47, 38 };
		for (int n : tabNonTrier) {
			Input.resultat(n);
		}

		for (int i = 0; i < tabNonTrier.length - 1; i++){
			for (int j = 0; j < tabNonTrier.length - 1; j++){
				if (tabNonTrier[j + 1] < tabNonTrier[j]) {
					k = tabNonTrier[j + 1];
					tabNonTrier[j + 1] = tabNonTrier[j];
					tabNonTrier[j] = k;
				}
			}
		}

		Input.message("aprés le tri");
		for (int n : tabNonTrier) {
			Input.resultat(n);
		}
	}
}
