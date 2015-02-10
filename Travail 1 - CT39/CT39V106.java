//Ce fichier est encodé en UTF8.

//Grynczel Wojciech
//Russello Helena
//Visschers Marie
//Wenders Audrey

// Remplacez les deux caractères XX par votre numéro de groupe encodé sur deux chiffres!
public class CT39V106 {

	// Le paramètre t n'est pas null.
	// De plus, il représente un vecteur non vide de n entiers relatifs.

	// Cette méthode ne modifie pas les éléments du tableau t.
	// Elle renvoie la somme de la sous-sequence non vide maximum de t.
	public static long maxSum(int[] t) {
		long max = t[0];
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
	// Expliquez la notion de "programme correct"

	// ***********************************************************************************
	// Expliquez comment vous avez développé ce programme

	// ***********************************************************************************
	// Expliquez pourquoi vous pensez que votre méthode est correcte
}
