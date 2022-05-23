package revision;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department d1 = new Department(1, "Information Systems");
		
		SalariedEmployee se = new SalariedEmployee("Ahmed", "Riyadh", 1200, Gender.Male, 2000, 500, 50);
		
		d1.add_employee(se);
		
		HourlyEmployee he = new HourlyEmployee("Mohamed", "Kharj", 1500,  Gender.Male, 6, 100);
		
		d1.add_employee(he);
		
		CommissionEmployee ce = new CommissionEmployee("Fatema", "Riyadh", 1350, Gender.Female, 150, 5);
	
		d1.add_employee(ce);
		
		System.out.println(d1.getEmployeeCount());
		
		d1.printBasicData();
		
		d1.printAllDetails();
	}

}
