package revision;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
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
