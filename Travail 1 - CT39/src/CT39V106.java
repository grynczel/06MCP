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
	/*
	 * Pour savoir si un programme est correct, une question primordiale � se
	 * poser est : "Mon programme fait-il bien ce que je voudrais qu'il fasse ?"
	 * 
	 * Il faut donc v�rifier que le programme fasse ce que j'attend de lui et
	 * pas autre chose. Pour ce faire, je dois d�finir ses sp�cifications. Les
	 * sp�cifications font r�f�rences a une suite de conditions que le programme
	 * doit remplir : les donn�es en entr�es, les donn�es en sortie, la gestion
	 * des cas d'erreurs,� Elles permettent d'analyser le comportement et la
	 * conception du programme gr�ce � des outils de raisonnement rigoureux qui
	 * d�duisent des informations utiles. Ces sp�cifications sont formels,
	 * c'est-�-dire qu'elles ont une syntaxe particuli�re et une s�mantique.
	 */
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
