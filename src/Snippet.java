
public class Snippet {
	public static void main(String[] args) {

		int number = 97;
		float value = number; // float can accomodate integer.
		System.out.println(value); // Error // 10.0 //

		// type casting
		char ch = (char) number; // Error // ASCII
		System.out.println(ch);

		double salary = 10.3444444;
		int sal = (int) salary; // loss of precision

		System.out.println("Salary is:" + sal); // 10.34, 10, 10.3444444

	}
}