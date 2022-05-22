package arrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<String>(100);
		
		System.out.println(myList.size());				// items that are currently stored.
		
		myList.add("George");
		myList.add("Ahmed");
		myList.add("Youssef");
		myList.add(1,"Mohamed");
		
		System.out.println(myList);
		
		System.out.println(myList.get(2));
		
		myList.set(2, "Steven");
		
		System.out.println(myList);
		
		myList.remove(1);

		System.out.println(myList);
		System.out.println(myList.size());
		
		
	}

}
