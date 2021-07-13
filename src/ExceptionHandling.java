import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		int result = 0;

		Scanner scan = new Scanner(System.in);

		String name = scan.next();
		try {
			name.charAt(0);

		} finally {
			System.out.println("In value");
		}
		int c = 30;
		int d = 40;

		System.out.println(c + d);
	}

}
