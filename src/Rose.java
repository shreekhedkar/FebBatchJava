
public class Rose extends Flower {

	double price;
	int quantity;

	public boolean purchase(int quantityToPurchase) {

		System.out.println("In purchase of Rose");
		boolean isPurchaseSuccessful;
		if (this.quantity >= quantityToPurchase) {

			this.quantity = this.quantity - quantityToPurchase;
			isPurchaseSuccessful = true;
		} else {
			isPurchaseSuccessful = false;
		}

		return isPurchaseSuccessful;
	}

	public void roseMethod() {

		System.out.println("I am in rose Method");
	}

}
