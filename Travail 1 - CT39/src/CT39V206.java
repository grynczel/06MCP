//Ce fichier est encodé en UTF8.

//Grynczel Wojciech
//Russello Helena
//Visschers Marie
//Wenders Audrey

// Remplacez les deux caractères XX par votre numéro de groupe encodé sur deux chiffres!
public class CT39V206 {

	// Le paramètre t n'est pas null.
	// De plus, il représente un vecteur de n entiers relatifs.

	// Cette méthode ne modifie pas les éléments du tableau t.
	// Elle renvoie la somme de la sous-sequence maximum de t.
	public static long maxSum(int[] t) {
		if (t == null) {
			throw new IllegalArgumentException(
					"Le parametre t ne peut pas etre null");
		}
		if (t.length == 0) {
			throw new IllegalArgumentException(
					"Le vecteur t ne peut pas etre vide");
		}
		long max = 0;
		long sum = 0;
		for (int i = 0; i < t.length; i++) {
			if (sum < 0)
				sum = 0;
			sum += t[i];
			if (max < sum)
				max = sum;
		}

		return max;
	}

	// ***********************************************************************************
	// Expliquez comment vous avez développé ce programme

	// ***********************************************************************************
	// Expliquez pourquoi vous pensez que votre méthode est correcte
}