//Ce fichier est encodÃ© en UTF8.

//Grynczel Wojciech
//Russello Helena
//Visschers Marie
//Wenders Audrey

// Remplacez les deux caractÃ¨res XX par votre numÃ©ro de groupe encodÃ© sur deux chiffres!
public class CT39V106 {

	// Le paramÃ¨tre t n'est pas null.
	// De plus, il reprÃ©sente un vecteur non vide de n entiers relatifs.

	// Cette mÃ©thode ne modifie pas les Ã©lÃ©ments du tableau t.
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
	/*
	 * Pour savoir si un programme est correct, une question primordiale à se
	 * poser est : "Mon programme fait-il bien ce que je voudrais qu'il fasse ?"
	 * 
	 * Il faut donc vérifier que le programme fasse ce que j'attend de lui et
	 * pas autre chose. Pour ce faire, je dois définir ses spécifications. Les
	 * spécifications font références a une suite de conditions que le programme
	 * doit remplir : les données en entrées, les données en sortie, la gestion
	 * des cas d'erreurs,… Elles permettent d'analyser le comportement et la
	 * conception du programme grâce à des outils de raisonnement rigoureux qui
	 * déduisent des informations utiles. Ces spécifications sont formelles,
	 * c'est-à-dire qu'elles ont une syntaxe particulière et une sémantique.
	 */
	// ***********************************************************************************
	// Expliquez comment vous avez dÃ©veloppÃ© ce programme
	/*
	 * Nous avons besoin de deux variables pour résoudre ce problème : une
	 * variable qui enregistre la somme maximum (long max) et une autre qui
	 * contient la valeur maximum après l'ajout de la valeur suivante dans le
	 * tableau (long sum). Si "sum" est supérieure à "max", ça signifie qu'il
	 * s'agit de la nouvelle valeur maximale donc "max" prend cette valeur;
	 * sinon, "max" reste inchangée. Dès que "sum" contient une somme négative,
	 * celle-ci est remise à zéro. (En effet, une somme commençant par un
	 * chiffre négatif ne sera jamais plus intéressante qu’une somme commençant
	 * par 0.) La différence entre la version 1 (sous-séquences vide non
	 * acceptées) et la version 2 (sous-séquences vide acceptées) est
	 * l'initialisation des variables au début du programme : max contient
	 * d'abord le premier élément du tableau dans la version 1 et zéro dans la
	 * version 2. En effet, si aucune valeur positive n'existe dans le tableau,
	 * la version 2 affichera zéro et la version 1 affichera le plus petit nombre négatif.
	 */

	// ***********************************************************************************
	// Expliquez pourquoi vous pensez que votre mÃ©thode est correcte
	/*
	 * Notre méthode respecte les spécifications de la méthode ce qui nous permet de penser que celle-ci est correcte.
	 * De plus, nous avons fait plusieurs tests afin de nous assurer que la méthode maxSum est
	 * correcte. 
	 * Voici quelques exemples des tests réalisés: 
	 * Le tableau en paramètre ne possède que des nombres négatifs [-1, -5, -26, -18] : 
	 * 		la méthode retourne la valeur -1 tandis que la version 2 retourne 0. 
	 * Le tableau en paramètre ne possède que des nombres positifs [1, 5, 10, 65] : 
	 * 		la méthode retourne la valeur 81 
	 * Le tableau en paramètre ne possède des nombres négatifs et des positifs [-4, -5, 3, 7, -5, 100, -100, -100] : 
	 * 		la méthode retourne la valeur 105
	 * 
	 */
}
