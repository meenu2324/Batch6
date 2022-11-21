package java_Day_10_Array;

import java.util.Arrays;

public class ArraySortMethod {

	public static void main(String[] args) {


		int arr[] = { 78, 34, 1, 3, 90, -5 };
		
		Arrays.sort(arr);
		
		for(int o=0; o<arr.length; o++)
		{
			System.out.println(arr[o]+ " ");
		}

	}

}
