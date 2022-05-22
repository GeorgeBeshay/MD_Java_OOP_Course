package revision;

public class CommissionEmployee extends Employee implements Displayable {

	// Fields
	private double GrossSales, CommissionRate;
	
	// Setters & Getters
	public double getGrossSales() {
		return GrossSales;
	}

	public void setGrossSales(double grossSales) {
		GrossSales = grossSales;
	}

	public double getCommissionRate() {
		return CommissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		CommissionRate = commissionRate;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [GrossSales=" + GrossSales + ", CommissionRate=" + CommissionRate + "]";
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
		System.out.println("Earning of Commission Employee: " + this.earning());
	}

	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return (this.GrossSales  * this.CommissionRate);
	}

}
