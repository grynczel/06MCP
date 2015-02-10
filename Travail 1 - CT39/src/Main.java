public class Main {

	public static void main(String[] args) {
		int[] vector 	= { -4, -5, 3, 7, -5, 100, -100, -100 }; //Max 105
		int[] vector2 	= { 2, 3, -2, -1, 10 }; //Max 12
		int[] vector3	= { -1,-5,-26}; // Max -1 or 0
		int[] vector4	= {}; //IllegalArgumentException
		
		System.out.println("Version 1");
		System.out.println(CT39V106.maxSum(vector));
		System.out.println(CT39V106.maxSum(vector2));
		System.out.println(CT39V106.maxSum(vector3));
		//System.out.println(CT39V106.maxSum(vector4));

		
		System.out.println("Version 2");
		System.out.println(CT39V206.maxSum(vector));
		System.out.println(CT39V206.maxSum(vector2));
		System.out.println(CT39V206.maxSum(vector3));
		//System.out.println(CT39V206.maxSum(vector4));
	}

}
