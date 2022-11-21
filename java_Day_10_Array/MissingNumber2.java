package java_Day_10_Array;

public class MissingNumber2 {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 40, 50, 70};
		int addition = 0;
		int allAddition = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			addition = addition + arr[i];
		}
		System.out.println(addition);
		
		for(int i=1; i<=7; i++) // 3 ,3<=5
		{
			allAddition = allAddition + i * 10;// 0+1+10 =11
		}
		System.out.println(allAddition);
		System.out.println(allAddition - addition);
	   
	}

}
