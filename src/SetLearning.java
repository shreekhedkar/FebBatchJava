import java.util.NavigableSet;
import java.util.TreeSet;

public class SetLearning {

	public static void main(String[] args) {

		NavigableSet<String> names = new TreeSet<>();
		names.add("abc");
		names.add("pqr");
		names.add("xyz");
		names.add("aaa");

		// names.add(null);

//		for (String name : names) {
//			System.out.println(name);
//		}

		// System.out.println(names);
//		System.out.println(names.descendingSet());
//		System.out.println(names.floor("pqr"));
//		System.out.println(names.pollLast());

//
//		Iterator<String> iterator = names.iterator();
//
//		while (iterator.hasNext()) {
//			// names.add("def");
//			String name = iterator.next();
//			System.out.println(name);
//		}

		// System.out.println(names);

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
