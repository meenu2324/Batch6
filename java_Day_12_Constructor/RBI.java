package java_Day_12_Constructor;

public class RBI {

	int r;
	
	RBI(){
		//default constructor
		System.out.println("I am in a default constructor");
	}
	
	RBI(int rate){
		r=rate;
		//Parameterized constructor
		System.out.println("I am in a parameterized constructor");
	}
	
	int calculateInterest(int p, int t) {
		int interest = (p  * r * t) / 100;
		return interest;
	}
	
	public static void displayCustomerInfo() {
		System.out.println("I am in a displayCustomerInfo method");
	}

}
