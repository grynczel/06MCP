import java.sql.Time;

public class Test {

	public static void main(String[] args) {
		int[] tab = { -15, -2, -5, -2, -10, -12, 15, -10, 11 };
		int result = findK(tab, 0, tab.length - 1);
		System.out.println("result = " + result);
		System.out.println("Paire d'éléments: " + tab[result] + " et "
				+ tab[result + 1]);
	}

	public static boolean signeOppose(int a, int b) {
		if (a >= 0 && b <= 0)
			return true;
		if (a <= 0 && b >= 0)
			return true;
		return false;
	}

	public static int findK(int[] tab, int i, int j) {
		while (i < j - 1) {
			System.out.println("i=" + i + " j=" + j);
			if (signeOppose(tab[i + (j - i) / 2], tab[j])) {
				i = i + (j - i) / 2;
			} else
				j = i + (j - i) / 2;
		}
		return i;
	}
}
