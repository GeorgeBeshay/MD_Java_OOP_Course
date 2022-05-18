package Interfaces;

public class mainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RetailItem r1 = new RetailItem();	// Error can't instantiate a class from an interface.
		
		CD obj = new CD(70,"SongNameHere", "Amr Diab");
		System.out.println(obj.getItemPrice());
		obj.display();
		
		
//		RetailItem r1 = new CD();	// No Error 
//		r1.getItemPrice();				// will work without problems because the method is in the interface already.
//		r1.setTitle();						// Error because r1 is of type RetailItem 
													// Which contains only 1 function.
		
	}

}
