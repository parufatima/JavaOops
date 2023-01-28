package HashMap_demo;

import java.util.HashMap;

public class HashMap_13 {

	public static void main(String[] args) {
		
		HashMap<String,String> capitals = new HashMap<String,String>();
		
		capitals.put("Bangladesh", "Dhaka");
		capitals.put("Switzerland", "Bern");
		capitals.put("USA", "Washinton dc");
		capitals.put("England", "London");
		capitals.put("Germaney", "Berlin");
		
		
		System.out.println(capitals.get("Bangladesh"));
		System.out.println(capitals.size());
		
		System.out.println("------Country name -------");
		
		for(String i: capitals.keySet()) {
			System.out.println(i);	
		}
		System.out.println("-------Capital name ----------");
		
		for(String j : capitals.values()) {
			System.out.println(j);
		}
		
		System.out.println("Country name---- - Capital name");
		for (String i:capitals.keySet()) {
			System.out.println(i   +"             "+ capitals.get(i));
		}
		
	}

}
