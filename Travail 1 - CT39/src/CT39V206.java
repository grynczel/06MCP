//Ce fichier est encodÃ© en UTF8.

//Grynczel Wojciech
//Russello Helena
//Visschers Marie
//Wenders Audrey

// Remplacez les deux caractÃ¨res XX par votre numÃ©ro de groupe encodÃ© sur deux chiffres!
public class CT39V206 {

	// Le paramÃ¨tre t n'est pas null.
	// De plus, il reprÃ©sente un vecteur de n entiers relatifs.

	// Cette mÃ©thode ne modifie pas les Ã©lÃ©ments du tableau t.
	// Elle renvoie la somme de la sous-sequence maximum de t.
	public static long maxSum(int[] t) {
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
	// Expliquez comment vous avez dÃ©veloppÃ© ce programme
	/*
	 * Cette version est presque identique à la version 1 de la méthode.
	 * En effet, nous avons également besoin de deux variables pour résoudre ce problème : 
	 * une variable qui calcule la somme maximale et une autre qui
	 * contient la valeur maximale après l'ajout (dans la somme) de la valeur suivante dans le
	 * tableau. Si "sum" est supérieure à "max", ça signifie qu'il
	 * s'agit de la nouvelle valeur maximale donc "max" prend cette valeur;
	 * sinon, "max" reste inchangée. Dès que "sum" contient une somme négative,
	 * celle-ci est remise à zéro. À la différence de la version 1 (sous-séquences vide non
	 * acceptées), la version 2 (sous-séquences vide acceptées) initialise le max à zéro.
	 * En effet, si aucune valeur positive n'existe dans le tableau,
	 * la version 2 affichera zéro alors que la version 1 affichera le plus petit nombre négatif
	 * du tableau.
	 */

	// ***********************************************************************************
	// Expliquez pourquoi vous pensez que votre mÃ©thode est correcte
	/*
	 * Notre méhode respecte toutes les spécifications ce qui nous permet de penser que celle-ci est correcte.
	 * De plus nous avons réalisé plusieurs tests afin de nous assurer du bon fonctionnement notre méthode. 
	 * Voici quelques exemples des tests effectués : 
	 * Que des nombres négatifs [-1, -5, -26, -18] : 
	 * 		la méthode maxSum retourne la valeur 0. 
	 * Que des nombres positifs [1, 5, 10, 65] : 
	 * 		la méthode maxSum retourne la valeur 81 
	 * Des nombres négatifs et des positifs [-4, -5, 3, 7, -5, 100, -100, -100] : 
	 * 		la méthode maxSum retourne la valeur 105
	 */
}
