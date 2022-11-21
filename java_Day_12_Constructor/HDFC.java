package java_Day_12_Constructor;

public class HDFC {

	public static void main(String[] args) {
		
		RBI rObj= new RBI(9);
		
		int hdfcInterest = rObj.calculateInterest(100,2);
		
		System.out.println("Your interest is:" + hdfcInterest);
		
		RBI.displayCustomerInfo();

	}

}
