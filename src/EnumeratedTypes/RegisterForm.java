package EnumeratedTypes;

enum Gender   {Male, Female};
enum Course {Database , Programming, Math, ERP};
enum Semester {Summer, Winter, Fall, Spring};

public class RegisterForm {

	// Fields
	String stdName;
	Gender  stdGender;
	Course crs;
	Semester sem;
	
	// Constructor
	public RegisterForm() {
		this.stdName = "No Name";
		this.stdGender = Gender.Male;
		this.crs = Course.Math;
		this.sem = Semester.Spring;
	}
	
	
}