package EnumeratedTypes;

public class Main {
	public static void main(String[] args) {
		 Course c1 = Course.Database;
		 Course c2 = Course.Math;
		 Course c3 = Course.Math;
		 Course c4 = Course.ERP;
		 
//		 System.out.println(c1.toString());
//		 System.out.println(c1.ordinal());
		 
		 System.out.println(c2.compareTo(c3));	// both are equal --> Zero
		 System.out.println(c2.compareTo(c1));	// c2 comes after c1 --> +ve
		 System.out.println(c2.compareTo(c4));	// c2 comes before c4 --> -ve
		 
		 System.out.println(c3.equals(c2));
	}
}
