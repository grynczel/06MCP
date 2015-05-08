import java.util.Arrays;

import com.sun.org.apache.regexp.internal.recompile;

public class Main {

	private static boolean DEBUG = false;

	public static void main(String[] args) {
		if (DEBUG) {
			// TODO Auto-generated method stub
			// int[] test0 = { 1, 2, 3, 4,5,6,7,8,9};
			int[] test0 = { 1, 2, 3, 4, 5, 6, 7 };
			rotate(test0, 3);
			System.out.println(Arrays.toString(test0) + " =>  "
					+ Arrays.toString(test0));
		} else {
			int[] test = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
			checkArray(test, 15);
			int[] test2 = { 0, 1, 2, 3 };
			checkArray(test2, 6);
			int[] test3 = { 0 };
			checkArray(test3, 3);
			int[] test4 = { 0, 8 };
			checkArray(test4, 4);
			int[] test5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			checkArray(test5, 10);
			int[] test6 = { 1, 2, 3, 4, 5, 6, 7, 8 };
			checkArray(test6, 16);
			int[] test7 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
					16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
					31, 32 };
			checkArray(test7, 100);
		}
	}

	private static void checkArray(int[] testArray, int n) {
		System.out.println("Init Array : " + Arrays.toString(testArray) + "\n");
		for (int i = 0; i < n; i++) {
			int[] res = testArray.clone();
			rotate(res, i);
			System.out.print("Shift : " + i + "  " + Arrays.toString(res));
			boolean toutOK = true;
			int positionA = -87;
			int positionB = -48;
			for (int j = 0; j < res.length; j++) {
				int a = calculerPosition(j + i, res.length);
				if (res[a] != testArray[j]) {
					toutOK = false;
					positionA = a;
					positionB = j;
					break;
				}
			}

			if (toutOK) {
				System.out.println(" - OK");

			} else {
				System.out.println(" - KO *** Indice : " + positionA + " *** "
						+ res[positionA] + " != " + testArray[positionB]);
			}
		}
		System.out.println();
	}

	public static void rotate(int[] c, int r) {
		// INIT
		int i = 0, j = i, nbElemVisite = 0, tempElement, position;
		if (c.length == 0) {
			r = 0;
			tempElement = 0; // valeur sentinelle
		} else {
			r = r % c.length;
			tempElement = c[0];
		}
		position = j - r;
		
		while (!(r == 0 || nbElemVisite >= c.length)) { // !H
			// ITER
			if (position < 0) {
				position = position + c.length;
			}

			if (i == position) {
				c[j] = tempElement;

				i++;
				tempElement = c[i];
				j = i;
			} else {
				c[j] = c[position];
				j = position;
			}
			nbElemVisite++;
			position = j - r;
		}
	}

	private static int calculerPosition(int position, int size) {
		return position % size;
	}

	private static int pgcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return pgcd(b, a % b);
		}
	}
}
