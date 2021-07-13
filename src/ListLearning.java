import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListLearning {

	public static void main(String[] args) {

		List<String> numbers = new LinkedList<>();
		numbers.add("abc");
		numbers.add("pqr");
		numbers.add(null);
		numbers.add("pqr");

		System.out.println(numbers);

		Iterator<String> iterator = numbers.iterator();

		while (iterator.hasNext()) {

			String name = iterator.next();
			System.out.println(name);
		}

//		List<Integer> mylist = new LinkedList<>();
//
//		mylist.add(10);
//		mylist.add(20);
//		mylist.add(30);
//
//		// System.out.println(mylist);
//
//		for (int i = 0; i < mylist.size(); i++) {
//
//			int value = mylist.get(i);
//			// System.out.println(value);
//		}
//
//		List<String> myList = new ArrayList<>();
//
//		myList.add("Pooja");
//		myList.add("Swapna");
//		myList.add("Shilpa");
//
//		System.out.println("Before Removal:" + myList);
//		// myList.remove(1);
//		myList.remove("Swapna");
//		System.out.println("After Removal:" + myList);
//
//		for (int i = 0; i < myList.size(); i++) {
//
//			System.out.println(myList.get(i));
//		}

//		// myList.add("Shilpa");
//		myList.add(1, "Shilpa");
//		System.out.println("Adding again:" + myList);
//
//		myList.set(1, "Aditi");
//
//		System.out.println("Replacing Aditi:" + myList);
//
//		myList.clear();
//
//		System.out.println("Removed" + myList);
//
//		boolean result = myList.contains("Aditi");
//
//		System.out.println("Is list contains Aditi:" + result);
//
//		System.out.println("Is list empty?:" + myList.isEmpty());
	}

}
