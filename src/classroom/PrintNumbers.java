package classroom;

public class PrintNumbers {

	public static void main(String[] args) {

		for (int number = 11; number <= 10; number++) {
			System.out.println(number);
		}

		// do-while

//		int number = 11;
//		do {
//			System.out.println(number);
//			number++;
//
//		} while (number <= 10);

//		int number = 0;
//		while (number <= 10) {
//			System.out.println(number);
//		}
//		
		int number = 1;

		number = doOperation(number);

		while (number <= 10) {
			System.out.println(number);
			number += 2; // number = number +2;
		}
	}

	private static int doOperation(int number) {
		number = 50;
		return number;

	}
}
