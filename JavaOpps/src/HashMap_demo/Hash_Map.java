package HashMap_demo;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
	//Create a HashMap object called capitalCities
		
	HashMap<String,String> capitalCities = new HashMap<String , String>();

	//Add key and values (Country and city)
	
	capitalCities.put("Bangladesh", "Dhaka");
	capitalCities.put("Switzerland", "Bern");
	capitalCities.put("England", "London");
	capitalCities.put("Germany", "Berlin");
	capitalCities.put("France", "Paris");
	capitalCities.put("India", "New Dilhi");
	
	System.out.println(capitalCities);
	
	// find the size 
	System.out.println(capitalCities.size());
	
	//Access an item ; use the get() method and refer to its key
	
	System.out.println(capitalCities.get("Switzerland"));
	
	//Remove an item ;  use the remove() method and refer to the key:
	
	 System.out.println(capitalCities.remove("England"));
	 
	 System.out.println(capitalCities);
	
	 //To remove all items, use the clear() method:
	 
	// capitalCities.clear();
	 
	// System.out.println(capitalCities);
	 
	 //Print keys 
	 for(String i: capitalCities.keySet()) {
		 System.out.println(i);
	 }
	 //Print values 
	 for(String j: capitalCities.values()) {
		 System.out.println(j);
	 }
	 //Print keys and values
	 
	 for(String k: capitalCities.keySet()) {
		 System.out.println("key : "+ k + "       value: " +capitalCities.get(k) );
	 }
	 
	 //Create a HashMap object called people that will store String keys and Integer values:
	 HashMap<String,Integer> people = new HashMap<String,Integer>();
	 
	 //add keys and values (Name and age)
	 people.put("Amreen", 25);
	 people.put("Arfaana", 22);
	 people.put("Safwan", 19);
	 people.put("Areeba", 24);
	 people.put("Nuri", 27);
	 people.put("Ady", 22);
	 
	 for (String i : people.keySet()) {
		 System.out.println("Key :" + i + " is Value :" + people.get(i) +" years.");
	 }
	}

}
