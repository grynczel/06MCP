public class Main {

	public static void main(String[] args) {
		int[] vector = { -4, -5, 3, 7, -5, 100, -100, -100, 7, -5, 100, -100,
				7, -5, 100, -100, 7, -5, 100, -100, 7, -5, 100, -100, 7, -5,
				100, -100, 7, -5, 100, -100, 7, -5, 100, -100, 7, -5, 100,
				-100, 7, -5, 100, -100, 7, -5, 100, -100 }; // Max 105
		int[] vector2 = { 2, 3, -2, -1, 10 }; // Max 12
		int[] vector3 = { -1, -5, -26 }; // -1 or 0
		int[] vector5 = { -1, -2, -3, -4, 0 }; // 0
		int[] vector6 = { 1, 5, 10, 65 }; // 0
		int[] vector7 = { 0, 0, 0, 0, -1, 0, 0, 0, 1 }; // 0

		System.out.println("Version 1");
		System.out.println(CT39V106.maxSum(vector));
		System.out.println(CT39V106.maxSum(vector2));
		System.out.println(CT39V106.maxSum(vector3));
		// System.out.println(CT39V106.maxSum(vector4));
		System.out.println(CT39V106.maxSum(vector5));
		System.out.println(CT39V106.maxSum(vector6));
		System.out.println(CT39V106.maxSum(vector7));

		System.out.println("Version 2");
		System.out.println(CT39V206.maxSum(vector));
		System.out.println(CT39V206.maxSum(vector2));
		System.out.println(CT39V206.maxSum(vector3));
		// System.out.println(CT39V206.maxSum(vector4));
		System.out.println(CT39V206.maxSum(vector5));
		System.out.println(CT39V206.maxSum(vector6));
		System.out.println(CT39V206.maxSum(vector7));

	}
}
