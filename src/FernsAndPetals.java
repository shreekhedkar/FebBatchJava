import java.util.Scanner;

public class FernsAndPetals {

	// static Rose rose = new Rose();

	public static void main(String[] args) {

		Rose rose = new Rose();
		Flower flower = new Flower();

		flower.purchase(10);
		flower.flowerMethod();

		Flower flower1 = new Rose();

		flower1.purchase(10);
		flower1.flowerMethod();

		// base class object can refer to a child class object
		// base class object can hold a reference of child class.

//		initializeStore();
//		int choice;
//		while ((choice = menu()) < 2) {
//
//			switch (choice) {
//
//			case 1:
//				purchaseRoses();
//				break;
//			}
//		}

	}

	private static void initializeStore() {

		// rose.price = 50;
		// rose.quantity = 100;

	}

	private static void purchaseRoses() {

		System.out.println("Enter your the quantity-> ");
		Scanner scan = new Scanner(System.in);

		int rosesToBePurchased = scan.nextInt();

//		if (rose.purchase(rosesToBePurchased)) {
//			System.out
//					.println("Roses are purchased and current balance left is ->" + rose.quantity);
//		} else {
//			System.out.println("Sorry Store donot have desired quanity left...");
//		}
	}

	private static int menu() {
		System.out.println("1.Rose");
		System.out.println("2.Exit");

		System.out.println("Enter your choice-> ");

		Scanner scan = new Scanner(System.in);

		int choice = scan.nextInt();
		// scan.close();
		return choice;

	}

}
