package revision;

public class SalariedEmployee extends Employee implements Displayable{

	
	// Fields
	private double Salary, Bonus, Deductions;
	
	
	// Constructors
	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String name, String address, int sSN, Gender sex, double salary, double bonus,
			double deductions) {
		super(name, address, sSN, sex);
		Salary = salary;
		Bonus = bonus;
		Deductions = deductions;
	}

	
	// Setters & Getters
	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}

	public double getDeductions() {
		return Deductions;
	}

	public void setDeductions(double deductions) {
		Deductions = deductions;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [Salary=" + Salary + ", Bonus=" + Bonus + ", Deductions=" + Deductions + "]";
	}

	// Abstract & Interface Methods.
	@Override
	public void DisplayAllDetails() {
		// TODO Auto-generated method stub
		System.out.println(super.toString());
		System.out.println(this.toString());
	}

	@Override
	public void DisplayEarning() {
		// TODO Auto-generated method stub
		System.out.println("Earning of Salaired Employee: " + this.earning());
	}

	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return (this.Salary + this.Bonus - this.Deductions);
	}

}
