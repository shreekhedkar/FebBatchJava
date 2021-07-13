package classroom;

public class StaticAndNonStatic {

	static int number1 = 10; // Global variable
	static int number2 = 20;

	public static void main(String[] args) {
		int number1 = 100; // Local variables
		int sum = addition(number1, number2); // addition(100,20)

		System.out.println("Addition is:" + sum); // 120

		System.out.println("No1:" + number1); // 100
		System.out.println("No2:" + number2); // 21

	}

	public static int addition(int no1, int no2) { // local variables

		number1 = no1;
		int result = number1 + number2; // 120
		number2++;

		return result;
	}

}
