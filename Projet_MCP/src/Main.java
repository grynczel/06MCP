import java.util.Arrays;

import com.sun.org.apache.regexp.internal.recompile;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(4 % 4);
		int [] test0 =  {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		System.out.println(Arrays.toString(test0) + " =>  " +  Arrays.toString(rotate(test0, 8)));
		
		checkArray(test0, 3);
		int [] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		
		
		
		checkArray(test, 15);
		int [] test2 = {0, 1, 1, 2};
		checkArray(test2, 6);
		int [] test3 = {0};
		checkArray(test3, 3);
		int [] test4 = {0, 8};
		checkArray(test4, 4);
		int [] test5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		checkArray(test5, 10);
		
	//	System.out.println(Arrays.toString(rotate(test2, 2)));
	}
	
	private static void checkArray(int [] testArray, int n){
		System.out.println("Init Array : " + Arrays.toString(testArray) + "\n");
		for(int i = 0; i < n; i ++){
			int [] res =  rotate(testArray, i);
			int a  = Math.abs((res.length - (i % (res.length))) % (res.length));
			System.out.print("Shift : " + i + "  " + Arrays.toString(rotate(testArray, i)));
			System.out.println((res[0] == testArray[a]?" - OK":" - KO ******"));
		}
		System.out.println();
	}
	
	public static int[] rotate(int[] c, int n){
		int[] cadran = c.clone(); //TODO
	
		int i = 0;
		int j = 0;
		int temp = cadran[i];
		while(i != n){
			//Nothing to change
			if(n % cadran.length == 0){
				return cadran;
			}
						
			if(j >= cadran.length){
				j = calculerPosition(j, cadran.length);
				i++;
				if((i != n ) &&  i != j){
					cadran[j] 		= temp;
					j = i;
				}
				int localTemp 	= cadran[j];
				cadran[j] 		= temp;
				temp 			= localTemp;
				//j = calculerPosition(j + n , cadran.length);

			}else {
				int localTemp 	= cadran[j];
				cadran[j] 		= temp;
				temp 			= localTemp;	
			}
			j = j + n;
//			System.out.println("J : " + j + " I : " + i + " Temp : " + temp + " "+  Arrays.toString(cadran) + "\n");

		}
		return cadran;
	}
	
	public static int[] rotate2(int[] c, int n){
		int[] cadran = c.clone(); //TODO
		int numberOfRotations = 0;
		int tempElement = -1;
		int nextPosition = 0;
		
		while(numberOfRotations <= cadran.length){
			//Nothing to change
			if(n % cadran.length == 0){
				return cadran;
			}
					
			int localTemp 			= cadran[nextPosition];
			cadran[nextPosition] 	= tempElement;
			tempElement 			= localTemp;
			nextPosition 			= calculerPosition(nextPosition + n, cadran.length);

			if(cadran.length % n == 0 && numberOfRotations == cadran.length/n -1){
				cadran[nextPosition] = tempElement;		
				nextPosition 		= calculerPosition(nextPosition + n + 1, cadran.length);
			}
			numberOfRotations++;
		}
		return cadran;
	}

	public static int[] rotate3(int[] c, int n){
		int[] cadran = c.clone(); //TODO
		int numberOfRotations = 0;
		int tempElement = -1;
		int nextPosition = 0;
		
		while(numberOfRotations <= cadran.length){
			//Nothing to change
			if(n % cadran.length == 0){
				return cadran;
			}
					
			int localTemp 			= cadran[nextPosition];
			cadran[nextPosition] 	= tempElement;
			tempElement 			= localTemp;
			nextPosition 			= calculerPosition(nextPosition + n, cadran.length);

			if(cadran.length % n == 0 && numberOfRotations == cadran.length/2 -1 && cadran[nextPosition] == -1){
				cadran[nextPosition] = tempElement;		
				nextPosition 		= calculerPosition(nextPosition + n + 1, cadran.length);
			}
			numberOfRotations++;
		}
		return cadran;
	}
	
	private static boolean outOfBOund(int i, int size){
		return i >= size;
	}
	
	private static int calculerPosition(int position, int size){
		return position%size;
	}
}
