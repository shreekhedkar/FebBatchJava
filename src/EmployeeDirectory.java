import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {

	public static void main(String[] args) {

		List<Employee> empDir = new ArrayList<Employee>();

		Employee e1 = new Employee("shree", 1);

		Employee e2 = new Employee("shree", 1);
		Employee e3 = new Employee("shree", 1);
		Employee e4 = new Employee("shree", 1);
		Employee e5 = new Employee("shree", 1);
		Employee e6 = new Employee("shree", 1);

		empDir.add(e1);
		empDir.add(e2);
		empDir.add(e3);
		empDir.add(e4);
		empDir.add(e5);
		empDir.add(e6);

		for (Employee e : empDir) {

			System.out.println(e.ename + e.eno + e.age);
		}

	}

}
