package java_Day_11_Array2;

public class Print2DArray {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9,1}};
		
		for(int r=0;r<a.length;r++) {
			
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+ " ");
			}
			System.out.println();
		}
		System.out.println("Array is printed");

	}

}
