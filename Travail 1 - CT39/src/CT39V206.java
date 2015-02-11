//Ce fichier est encod√© en UTF8.

//Grynczel Wojciech
//Russello Helena
//Visschers Marie
//Wenders Audrey

// Remplacez les deux caract√®res XX par votre num√©ro de groupe encod√© sur deux chiffres!
public class CT39V206 {

	// Le param√®tre t n'est pas null.
	// De plus, il repr√©sente un vecteur de n entiers relatifs.

	// Cette m√©thode ne modifie pas les √©l√©ments du tableau t.
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
	// Expliquez comment vous avez d√©velopp√© ce programme
	/*
	 * Nous avons besoin de deux variables pour rÈsoudre ce problËme : une
	 * variable qui enregistre la somme maximum (long max) et une autre qui
	 * contient la valeur maximum aprËs l'ajout de la valeur suivante dans le
	 * tableau (long sum). Si "sum" est supÈrieure ‡ "max", Áa signifie qu'il
	 * s'agit de la nouvelle valeur maximale donc "max" prend cette valeur;
	 * sinon, "max" reste inchangÈe. DËs que "sum" contient une somme nÈgative,
	 * celle-ci est remise ‡ zÈro. (En effet, une somme commenÁant par un
	 * chiffre nÈgatif ne sera jamais plus intÈressante quíune somme commenÁant
	 * par 0.) La diffÈrence entre la version 1 (sous-sÈquences vide non
	 * acceptÈes) et la version 2 (sous-sÈquences vide acceptÈes) est
	 * l'initialisation des variables au dÈbut du programme : max contient
	 * d'abord le premier ÈlÈment du tableau dans la version 1 et zÈro dans la
	 * version 2. En effet, si aucune valeur positive n'existe dans le tableau,
	 * la version 2 affichera zÈro.
	 */

	// ***********************************************************************************
	// Expliquez pourquoi vous pensez que votre m√©thode est correcte
	/*
	 * Nous avons fait plusieurs tests afin de síassurer que notre mÈthode est
	 * correcte. 
	 * Voici quelques exemples : 
	 * Que des nombres nÈgatifs [-1, -5, -26, -18] : 
	 * 		la version 1 retourne la valeur -1 tandis que la version 2 retourne 0. 
	 * Que des nombres positifs [1, 5, 10, 65] : 
	 * 		les 2 versions retournent la valeur 81 
	 * Des nombres nÈgatifs et des positifs [-4, -5, 3, 7, -5, 100, -100, -100] : 
	 * 		les 2 versions retournent la valeur 105
	 * En plus de Áa elle respecte toutes les spÈcifications.
	 */
}