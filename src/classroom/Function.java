package classroom;

import java.util.Arrays;
import java.util.Scanner;

public class Function {
	public static void main(String[] args) {

		// System.out.println("Arguments:" + Arrays.toString(args));
//		int a = 10;
//		int b = 20;
//		int result = addition(a, b);

		add();
//		System.out.println("Sum is =>" + result);

	}

	public static void add() {

		System.out.println("In Non static add function.");
	}

	// <access specifier><return type><functionName>(parameters...)

	public static int addition(int x, int y) {

		int sum;
		int value = test();
		sum = x + y;
		System.out.println("I am in addition!");
		print(value);
		return sum;
	}

	public static int test() {
		System.out.println("I am in test!");
		return 0;
	}

	public static void print(int value) {
		System.out.println("In print function-> value:" + value);
	}

	public static void click(int value) {
		System.out.println("In Click function-> value:" + value);
	}

}
