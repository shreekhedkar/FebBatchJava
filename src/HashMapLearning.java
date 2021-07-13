import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

	public static void main(String[] args) {

		Map<String, String> personDetails = new HashMap<>();

		// adding value in map
		personDetails.put("name", "abc");
		personDetails.put("address", "Pune");
		personDetails.put("contact", "sms");
		personDetails.put("desg", "manager");
		System.out.println(personDetails);

//		if (personDetails.containsKey("address2")) {
//			personDetails.get("address2");
//		}

		// personDetails.get("address2");
		// String output = personDetails.getOrDefault("address2", "Mumbai");

//		for (Map.Entry<String, String> m : personDetails.entrySet()) {
//			System.out.println(m.getKey());
//			System.out.println(m.getValue());
//		}

		// System.out.println(personDetails);

	}

}
