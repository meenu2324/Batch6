package java_Day_12_Constructor;

public class ICICI {

	public static void main(String[] args) {
		
		RBI r = new RBI(12);
		
		int iciciInterest= r.calculateInterest(300,4);
		
		System.out.println("Your interset is:" + iciciInterest);
		

	}

}
