package java_Day_10_Array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;  //declare single element
		int b[]=new int[6];
		
		b[0]=1;
		b[1]=2;
		b[2]=3;
		b[3]=4;
		//b[4]=flag;    //-> array only store same type of data which is declared
		
		int x = b[3];
		System.out.println(x);
		
		System.out.println(b[5]); // when we don't have any value for array index, then Java put the default value of datatype


	}

}
