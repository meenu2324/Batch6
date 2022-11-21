package java_Day_10_Array;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = { 1, 2, 3, 4, 5, 7 };
		int addition = 0;
		int alladdtion = 0;

		for (int i = 0; i < input.length; i++) { // 4, 4<4
			addition = addition + input[i]; // 0+1 = 1 + 2 = 3+3 = 6+5 = 11
		}

		System.out.println(addition); // 11

		for (int i = 1; i <= (input.length + 1); i++) { // 3, 3<=5
			alladdtion = alladdtion + i; // 0+1 = 1 + 2 = 3 + 3=6+4=10+5=15
		}

		System.out.println(alladdtion); // 15

		System.out.println(alladdtion - addition); // 15-11 = 4

	}
}
