import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] test = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
		checkArray(test, 15);
		int [] test2 = {0, 1, 1, 2};
		checkArray(test2, 6);
	
	}
	
	private static void checkArray(int [] testArray, int n){
		System.out.println("Init Array : " + Arrays.toString(testArray) + "\n");
		for(int i = 0; i < n; i ++){
			int [] res =  rotate(testArray, i);
			int a  = Math.abs((res.length - (i % (res.length))) % (res.length));
			System.out.print("Shift : " + i + "  " + Arrays.toString(rotate(testArray, i)));
			System.out.println((res[0] == testArray[a]?" - OK":" - KO"));
		}
		System.out.println();
	}
	
	public static int[] rotate(int[] c, int n){
;		int[] cadran = c.clone(); //TODO
		int numberOfRotations = 0;
		int tempElement = -1;
		int nextPosition = 0;
		
		while(numberOfRotations <= cadran.length){
//			System.out.println("Current position : " + currentPosition + " temp element : " + tempElement + " numOfRotation = " + numberOfRotations);

			//Nothing to change
			if(n % cadran.length == 0){
				return cadran;
			}
					
			int localTemp 			= cadran[nextPosition];
			cadran[nextPosition] = tempElement;
			tempElement 			= localTemp;
			nextPosition 		= calculerPosition(nextPosition + n, cadran.length);

			if(cadran.length % n == 0 && cadran.length % 2 == 0 && numberOfRotations == cadran.length - 2 && cadran[nextPosition] == -1){
				nextPosition 		= calculerPosition(nextPosition + n + 1, cadran.length);
			}
			
			numberOfRotations++;
		}
		return cadran;
	}
	
	private static int calculerPosition(int position, int size){
		return position%size;
	}
}
