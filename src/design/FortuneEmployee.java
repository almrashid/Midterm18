package design;

public class FortuneEmployee extends EzPaySystem {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) {

		EmployeeInfo employee = new EmployeeInfo();
		employee.setName("Jhon");
		employee.setEmployeeId(01);
		employee.years = 10;
		employee.setCompanyName("MetLife");
		employee.setBonus(.1);

		System.out.println(employee.getName() + " " + employee.getEmployeeId()
				+ " " + employee.years + " " + employee.getBonus());

		System.out.println(EmployeeInfo.calculateEmployeeBonus(10));
		System.out.println(EmployeeInfo.calculateEmployeePension());
	}

	@Override
	public void payment() {

		System.out.println("Every employee will get check biweekly");
	}

	@Override
	public void collectInfo() {
		System.out.println("Employees information get collection end of the week");
	}



}
