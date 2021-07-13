
public class Manager extends Employee {

	int noOfReportees;

	public Manager(String name, int eno, int nor) {
		super(name, eno);
		noOfReportees = nor;
	}
}
