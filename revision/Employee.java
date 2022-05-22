package revision;

enum Gender{Male, Female};

public abstract class Employee {

	// Fields
	String Name;
	String Address;
	int SSN;
	Gender Sex;

	// Constructors
	public Employee() {
		super();
	}
	public Employee(String name, String address, int sSN, Gender sex) {
		super();
		Name = name;
		Address = address;
		SSN = sSN;
		Sex = sex;
	}

	// Setters & Getters
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public Gender getSex() {
		return Sex;
	}
	public void setSex(Gender sex) {
		Sex = sex;
	}
	
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Address=" + Address + ", SSN=" + SSN + ", Sex=" + Sex + "]";
	}
	
	// Abstract Methods
	public abstract double earning();
	
}
