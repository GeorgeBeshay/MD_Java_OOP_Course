package revision;

public class HourlyEmployee extends Employee implements Displayable {

	
	// Fields
	private double HourRate;
	private int NoOfHours;
	
	// Setters & Getters
	public double getHourRate() {
		return HourRate;
	}

	public void setHourRate(double hourRate) {
		HourRate = hourRate;
	}

	public int getNoOfHours() {
		return NoOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		NoOfHours = noOfHours;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [HourRate=" + HourRate + ", NoOfHours=" + NoOfHours + "]";
	}

	
	// Abstact and Interface Methods
	@Override
	public void DisplayAllDetails() {
		// TODO Auto-generated method stub
		System.out.println(super.toString());
		System.out.println(this.toString());
	}

	@Override
	public void DisplayEarning() {
		// TODO Auto-generated method stub
		System.out.println("Earning of Hourly Employee: " + this.earning());
	}

	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return (this.NoOfHours * this.HourRate);
	}

}
