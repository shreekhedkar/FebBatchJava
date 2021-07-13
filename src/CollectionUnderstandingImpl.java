import java.util.ArrayList;
import java.util.List;

public class CollectionUnderstandingImpl {

	public static void main(String[] args) {

		CollectionUnderstanding cu = new CollectionUnderstanding();
		cu.addValueInTheList("abc");
		// System.out.println(cu.names);

		cu.names.add("pqr");

		// System.out.println(cu.names);

		cu.addValueInTheList("xyz");

		// System.out.println(cu.names);

		cu.names.remove("abc");
		// System.out.println(cu.names);

		cu.removeElementFromList("xyz");
		System.out.println(cu.names);

		String name = "Wife";
		name = name.replace("W", "L");
		System.out.println(name);

	}

}
