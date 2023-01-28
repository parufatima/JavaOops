package HashMap_demo;

import java.util.HashMap;

public class HashMap_Integer {

	public static void main(String[] args) {
		// HashMap with String and integer
		
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		
		student.put(101, "Farzana");
		student.put(102, "Shama");
		student.put(103, "Sabiha");
		student.put(104, "Kazi");
		student.put(105, "Amreen");
		
		System.out.println(student.get(103));
		
		for (Integer i: student.keySet()) {
			System.out.println(i);
		}
		for (String j : student.values()) {
			System.out.println(j);
		}
		
		for(Integer i:student.keySet()) {
			
			System.out.println(i +  "    "+ student.get(i));
		}
	}

}
