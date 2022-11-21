package java_Day_10_Array;

public class CheckEqualityOfArray {

	public static void main(String[] args) {
		
		int arrayOne[] = {2,4,5,7,3,2};
		int arrayTwo[] = {2,4,5,7,3,1};
		
		boolean flag = false;
		
		if(arrayOne.length == arrayTwo.length)
		{
			for(int i=0; i<arrayOne.length; i++)
			{
				if(arrayOne[i] != arrayTwo[i]) 
				{
					flag = true;
					break;
				}
			}
			if(flag == true) {
				
				System.out.println("Arrays are not equal");
			}
			else {
				
				System.out.println("Arrays are equal");
				
			}
		}
		else {
			System.out.println("Arrays are not equal");
		}
	

	}

}
