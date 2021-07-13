package classroom;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number->");
		String no1 = scan.next();

		System.out.println("Enter second number->");
		String no2 = scan.next();

		String result = no1 + no2;
		System.out.println("Result is->" + result);
	}

}
