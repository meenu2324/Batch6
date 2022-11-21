package java_Day_10_Array;

public class PrintArray {

	public static void main(String[] args) {
		
      int a;    //Variable declare
      a = 10;   //Value assigned
      int p = 20;
      
      int b[] = new int[6];
      b[0] = 1;	//assign value to array index
      
      int ram[] = {1, 2, 3, 4, 5};
      System.out.println(ram[2]);
      
      System.out.println("Length of array = " + ram.length);
      
      for(int i=0; i<ram.length; i++)
      {
    	System.out.print(ram[i] +" ");    
      }
      String str[] = {"a", "b"}; //this is a string array.
	}

}
