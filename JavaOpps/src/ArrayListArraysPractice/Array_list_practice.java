package ArrayListArraysPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Array_list_practice {

	public static void main(String[] args) {
		//
		ArrayList cars = new ArrayList ();
		//Add value
		cars.add("Toyota");
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Nissan");
		cars.add("Opel");
		cars.add("Mazda");
		cars.add("Citrone");
		// Print the ArrayList
		
		System.out.println(cars);
		
		//Access an item ex: print Opel
		
		System.out.println(cars.get(4));
		
		//Change an item , ex: change Citrone to Ford 
		
		cars.set(6, "Ford");
		System.out.println(cars);
		
		//Remove an item from ArrayList
		cars.remove(3);
		System.out.println(cars);
		
		//Find the size of the ArrayList
		
		System.out.println(cars.size());
		
		//Loop through an ArrayList
		Collections.sort(cars);
		
		for (int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
   /*    // loop through an ArrayList with the for-each loop:
		
		Collections.sort(cars);
		for (String j: cars) {       //this work only for generic
			System.out.println(j);
		}*/
		
		
	}

}
