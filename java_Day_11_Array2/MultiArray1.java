package java_Day_11_Array2;

public class MultiArray1 {

	public static void main(String[] args) {


		int x[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };

		System.out.println(x[2].length); // 4

		System.out.println(x[2][3]); // 10

		for (int i = 0; i < x.length; i++) { // i=2, 2<3
			for (int j = 0; j < x[i].length; j++) { // j=0, 0<4
				System.out.print(x[i][j] + " "); // x[1][2] = 1 2 3
													// 4 5 6
													// 7 8 9 10
			}
			System.out.println();
		}

	}


	}


