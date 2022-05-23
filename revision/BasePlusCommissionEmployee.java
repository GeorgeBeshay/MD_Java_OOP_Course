package revision;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	public BasePlusCommissionEmployee(String name, String address, int sSN, Gender sex, double grossSales,
			double commissionRate) {
		super(name, address, sSN, sex, grossSales, commissionRate);
		// TODO Auto-generated constructor stub
	}

	// Fields
	private double base;
	
	// Setters & Getters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	@Override 
	public void DisplayAllDetails() {
		super.DisplayAllDetails();
		this.DisplayAllDetails();
	}
	
	@Override
	public void DisplayEarning() {
		System.out.println("Earning of Base Plus Commission Employee: " + this.earning());
	}
	
	@Override
	public double earning() {
		return (this.base + super.earning()); 
	}
	
}
