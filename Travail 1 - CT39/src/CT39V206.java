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
	/*
	 * Nous avons besoin de deux variables pour r�soudre ce probl�me : une
	 * variable qui enregistre la somme maximum (long max) et une autre qui
	 * contient la valeur maximum apr�s l'ajout de la valeur suivante dans le
	 * tableau (long sum). Si "sum" est sup�rieure � "max", �a signifie qu'il
	 * s'agit de la nouvelle valeur maximale donc "max" prend cette valeur;
	 * sinon, "max" reste inchang�e. D�s que "sum" contient une somme n�gative,
	 * celle-ci est remise � z�ro. (En effet, une somme commen�ant par un
	 * chiffre n�gatif ne sera jamais plus int�ressante qu�une somme commen�ant
	 * par 0.) La diff�rence entre la version 1 (sous-s�quences vide non
	 * accept�es) et la version 2 (sous-s�quences vide accept�es) est
	 * l'initialisation des variables au d�but du programme : max contient
	 * d'abord le premier �l�ment du tableau dans la version 1 et z�ro dans la
	 * version 2. En effet, si aucune valeur positive n'existe dans le tableau,
	 * la version 2 affichera z�ro.
	 */

	// ***********************************************************************************
	// Expliquez pourquoi vous pensez que votre méthode est correcte
	/*
	 * Nous avons fait plusieurs tests afin de s�assurer que notre m�thode est
	 * correcte. 
	 * Voici quelques exemples : 
	 * Que des nombres n�gatifs [-1, -5, -26, -18] : 
	 * 		la version 1 retourne la valeur -1 tandis que la version 2 retourne 0. 
	 * Que des nombres positifs [1, 5, 10, 65] : 
	 * 		les 2 versions retournent la valeur 81 
	 * Des nombres n�gatifs et des positifs [-4, -5, 3, 7, -5, 100, -100, -100] : 
	 * 		les 2 versions retournent la valeur 105
	 * En plus de �a elle respecte toutes les sp�cifications.
	 */
}