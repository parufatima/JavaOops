package Hashset_demo;

import java.util.HashSet;

public class HashSet_duplicate {

	public static void main(String[] args) {

   HashSet<String> cars = new HashSet();
   cars.add("Volvo");
   cars.add("Opel");
   cars.add("BMW");
   cars.add("Toyota");
   cars.add("Volvo");
   cars.add("Volvo");
   
   System.out.println(cars);
   
 System.out.println(cars.size());
 
 System.out.println(cars.remove("Opel"));
 
 System.out.println(cars.isEmpty());

 System.out.println(cars);
 
 cars.clear();
 
 System.out.println(cars.isEmpty());


	}
	

}
