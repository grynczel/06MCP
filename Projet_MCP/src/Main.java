import java.util.Arrays;

import com.sun.org.apache.regexp.internal.recompile;

public class Main {

	private static boolean DEBUG = false;

	public static void main(String[] args) {		
		if (DEBUG) {
			// TODO Auto-generated method stub
			int[] test0 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			;
			System.out.println(Arrays.toString(test0) + " =>  "
					+ Arrays.toString(rotate(test0, 6)));
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
			checkArray(test7, 16);
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

    public static int[] rotate(int[] array, int k) {
		int[] cadran = array.clone(); // TODO

        int n = array.length;

        // Handle negative k values (rotate to right)
        if (k < 0) {
            k = n - Math.abs(k);
        }

        // Ensure k is in interval [0, n)
        k = ((k % n) + n) % n;

        // Perform juggling algoritm
        for (int i = 0, gcd = pgcd(k, n); i < gcd; i++) {
            int temp = cadran[i];
            int j = i;

            while (true) {
                int p = j + k;

                if (p >= n) {
                    p = p - n;
                }

                if (p == i) {
                    break;
                }

                cadran[j] = cadran[p];
                j = p;
            }

            cadran[j] = temp;
        }
        return cadran;
    }
    
	public static int[] rotateT(int[] c, int n) {
		int[] cadran = c.clone(); // TODO
		int length = cadran.length;

		n = ((n % length) + length) % length;

		int i = 0, j = i, pgdc = pgcd(n, length), tempElement = cadran[i];

		while (i < pgdc - 1) {
//			System.out.println(Arrays.toString(cadran));
			int temp = j + n;

			if (temp >= length) {
				temp = temp - length;
			}

			if (i == temp) {
				cadran[j] = tempElement;
				
				i++;
				tempElement = cadran[i];
				j = i;
				continue;
			}

			cadran[j] = cadran[temp];
			j = temp;
		}
		
		return cadran;
	}

	public static int[] rotate2(int[] c, int n) {
		int[] cadran = c.clone(); // TODO
		int numberOfRotations = 0;
		int tempElement = -1;
		int nextPosition = 0;

		while (numberOfRotations <= cadran.length) {
			// Nothing to change
			if (n % cadran.length == 0) {
				return cadran;
			}

			int localTemp = cadran[nextPosition];
			cadran[nextPosition] = tempElement;
			tempElement = localTemp;
			nextPosition = calculerPosition(nextPosition + n, cadran.length);

			if (cadran.length % n == 0
					&& numberOfRotations == cadran.length / n - 1) {
				cadran[nextPosition] = tempElement;
				nextPosition = calculerPosition(nextPosition + n + 1,
						cadran.length);
			}
			numberOfRotations++;
		}
		return cadran;
	}

	public static int[] rotate3(int[] c, int n) {
		int[] cadran = c.clone(); // TODO
		int numberOfRotations = 0;
		int tempElement = -1;
		int nextPosition = 0;

		while (numberOfRotations <= cadran.length) {
			// Nothing to change
			if (n % cadran.length == 0) {
				return cadran;
			}

			int localTemp = cadran[nextPosition];
			cadran[nextPosition] = tempElement;
			tempElement = localTemp;
			nextPosition = calculerPosition(nextPosition + n, cadran.length);

			if (cadran.length % n == 0
					&& numberOfRotations == cadran.length / 2 - 1
					&& cadran[nextPosition] == -1) {
				cadran[nextPosition] = tempElement;
				nextPosition = calculerPosition(nextPosition + n + 1,
						cadran.length);
			}
			numberOfRotations++;
		}
		return cadran;
	}

	public static int[] rotate4(int[] c, int n) {
		int[] cadran = c.clone(); // TODO

		int i = 0;
		int j = 0;
		int temp = cadran[i];

		while (i != n) {
			// Nothing to change
			if (n % cadran.length == 0) {
				return cadran;
			}

			if (j >= cadran.length) {
				j = calculerPosition(j, cadran.length);
				i++;

				if ((i != n) && i != j) {
					cadran[j] = temp;
					j = i;
				}

				int localTemp = cadran[j];
				cadran[j] = temp;
				temp = localTemp;
				// j = calculerPosition(j + n , cadran.length);

			} else {
				int localTemp = cadran[j];
				cadran[j] = temp;
				temp = localTemp;
			}

			j = j + n;
		}
		return cadran;
	}

	public static int[] rotate5(int[] c, int n) {
		int[] cadran = c.clone(); // TODO
		n = calculerPosition(n, cadran.length);

		int i = 0;
		int j = calculerPosition(n, cadran.length);
		int temp = cadran[0];

		int loop = 1;
		if (DEBUG)
			System.out.println("Init : I = " + i + " J = " + j + " Temp = "
					+ temp);

		while (i != n) {
			if (DEBUG)
				System.out.println("Loop : " + loop + " | Temp : " + temp + " "
						+ Arrays.toString(cadran) + " j : " + j + "("
						+ calculerPosition(j, cadran.length) + ") i : " + i);
			// Nothing to change
			if (n % cadran.length == 0) {
				return cadran;
			}

			if (j >= cadran.length) {
				j = calculerPosition(j, cadran.length);
				i++;

				if (n > 1 && cadran.length % n == 0) {
					if (DEBUG)
						System.out.println("If");
					cadran[j] = temp;
					j = i;

					// if(i == n){
					// break;
					// }
				}

				int localTemp = cadran[j];
				cadran[j] = temp;
				temp = localTemp;
			} else {
				int localTemp = cadran[j];
				cadran[j] = temp;
				temp = localTemp;
			}

			j = j + n;
			loop++;
		}
		return cadran;
	}

	private static boolean outOfBOund(int i, int size) {
		return i >= size;
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
