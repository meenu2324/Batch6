package java_Day_10_Array;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 78, 34, 1, 3, 90, -5 };
		int temp;
				
		System.out.println("Array element after sorting: ");

		for (int i = 0; i < arr.length; i++) { // 1, 1<6
			for (int j = i + 1; j < arr.length; j++) { // j=2, 2<6
				if (arr[i] > arr[j]) { // 1>-5
					temp = arr[i]; // temp = 1
					arr[i] = arr[j]; // arr[i] = -5
					arr[j] = temp; // arr[j] = 1
				}
			}
			
			System.out.print(arr[i] + " ");
		}

	}


}
