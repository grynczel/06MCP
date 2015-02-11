//Ce fichier est encod√© en UTF8.

//Grynczel Wojciech
//Russello Helena
//Visschers Marie
//Wenders Audrey

// Remplacez les deux caract√®res XX par votre num√©ro de groupe encod√© sur deux chiffres!
public class CT39V106 {

	// Le param√®tre t n'est pas null.
	// De plus, il repr√©sente un vecteur non vide de n entiers relatifs.

	// Cette m√©thode ne modifie pas les √©l√©ments du tableau t.
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
	 * Pour savoir si un programme est correct, une question primordiale ‡ se
	 * poser est : "Mon programme fait-il bien ce que je voudrais qu'il fasse ?"
	 * 
	 * Il faut donc vÈrifier que le programme fasse ce que j'attend de lui et
	 * pas autre chose. Pour ce faire, je dois dÈfinir ses spÈcifications. Les
	 * spÈcifications font rÈfÈrences a une suite de conditions que le programme
	 * doit remplir : les donnÈes en entrÈes, les donnÈes en sortie, la gestion
	 * des cas d'erreurs,Ö Elles permettent d'analyser le comportement et la
	 * conception du programme gr‚ce ‡ des outils de raisonnement rigoureux qui
	 * dÈduisent des informations utiles. Ces spÈcifications sont formels,
	 * c'est-‡-dire qu'elles ont une syntaxe particuliËre et une sÈmantique.
	 */
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
