import java.util.Arrays;

import com.sun.org.apache.regexp.internal.recompile;

public class Main {

	private static boolean DEBUG = false;

	public static void main(String[] args) {		
		if (DEBUG) {
			// TODO Auto-generated method stub
			//int[] test0 = { 1, 2, 3, 4,5,6,7,8,9};
			int[] test0 = {1,2,3,4,5,6,7};
			System.out.println(Arrays.toString(test0) + " =>  "
					+ Arrays.toString(rotate(test0, 3)));
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
			int[] res = rotate(testArray, i);
			System.out.print("Shift : " + i + "  "
					+ Arrays.toString(rotate(testArray, i)));
			boolean toutOK = true;
			int positionA = -87;
			int positionB = -48;
			for (int j = 0; j < testArray.length; j++) {
				int a = calculerPosition(j + i, testArray.length);
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
    
	public static int[] rotate(int[] c, int r) {
		int[] cadran = c.clone(); // TODO A supprimer
		int length = cadran.length;
		r = r % length;

		int i = 0, j = i, tempElement = cadran[i];
		int position;
		int nbElemVisite = 0;
		while (r != 0 && nbElemVisite < length ) {
			position = j - r;

			if (position < 0) {
				position = position + length;
			}
			
			if (i == position) {
				cadran[j] = tempElement;
				
				i++;
				tempElement = cadran[i];
				j = i;
			} else{
				cadran[j] = cadran[position];
				j = position;
			}
			nbElemVisite++;
		}
		return cadran;
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
