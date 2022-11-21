package java_Day_11_Array2;

public class TwoDArray {

	public static void main(String[] args) {
		
		int x[][] = new int[3][2]; //Declaration of array
		
		System.out.println(x[2][1]); //assign the value to the location
		
		x[2][1]=6;
		x[1][1]= 8;
		
		System.out.println(x[2][1]); //print the value from the location

	}

}
