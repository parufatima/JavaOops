package Oop_practice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList  family = new ArrayList();
		
		family.add("Amreen");
		family.add("Arfaana");
		family.add("Safwan");
		family.add("Masud");
		family.add("Fatima");
		family.add("Kamal");
		System.out.println(family.get(3));
		System.out.println(family.size());
		
		for(int i=0; i<family.size(); i++) {                 //Ascending order 
			System.out.println("Ascending order :"+ family.get(i));
		}
		
		for (int j= family.size()-1;j>=0; j--) {    // Descending order
			
			System.out.println("Descending order : "+ family.get(j));
		}
		

	}

}
