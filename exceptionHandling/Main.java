package exceptionHandling;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
//		System.out.println(5/0);						// Exception "ArithmeticException"
//		} catch (ArithmeticException E) {
//			System.out.println("Error: Dividing by Zero is not allowed.");
//		}
//		System.out.println("This will be reached ..");
		
		try {
		
			int x,y;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter X: ");
			x = sc.nextInt();
			
			System.out.println("Enter Y: ");
			y = sc.nextInt();
			
			System.out.println(x/y);
			
		}
		catch (ArithmeticException E) {
			System.out.println("Error: Dividing by zero is not allowed.");
		} 
		catch (InputMismatchException E) {
			System.out.println("Error: Input type doesn't match the expected input type.");
			System.out.println("Please enter numeric values only");
		} 
		catch (Exception E) {						// Any Exception.
			System.out.println("An Error has occured: " + E.getMessage());
		}
	}

}
