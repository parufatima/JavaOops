package ArrayListArraysPractice;

public class Arrays_practice {

	public static void main(String[] args) {
		/*String[] fruits = {"apple", "orange", "banana", "mango"};
		System.out.println(fruits[0]);
		 Outputs: apple*/
		String[] fruits = {"Apple","Orange","Banana","Mango","Prune","Cheries"};
        System.out.println(fruits[0]);
        
        //Change the value of a specific element, refer to the index number
 
        fruits[0]= "Dragonfruit";
        System.out.println(fruits[0]);
        
        //find the Array length
        System.out.println(fruits.length);
        
        // Print all the value using Loop
        
        for(int i= 0; i<=fruits.length-1; i++) {
        	System.out.println("All fruits name : "+fruits[i]);
        }
        //Print even number fruits
        for (int j=1; j<=fruits.length-1; j=j+2) {
        	
        	System.out.println("Even number fruits name :"+fruits[j]);	
         }
        //Print odd number fruits
        for (int k=0; k<=fruits.length-1;k=k+2) {
        	System.out.println("Odd number fruits name :"+fruits[k]);
        }
	}

}
