package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class ConsumerInterfaceTest {
	
	public static void main(String[] args)
	{
		
		
		List<String> strings = Arrays.asList("one", "two", "three", "four");
		
		
        Consumer<String>  c1= s1-> System.out.println(s1);
        
        strings.forEach(c1);
        
        
        //this below is not working
		/*
		 * strings.removeIf(n -> (n.charAt(0) == 'o'));
		 * System.out.println(" after removing"); strings.forEach(c1);
		 */
        
		/*
		 * strings.removeIf(m -> (m.charAt(0)=='o'));
		 * 
		 * System.out.println(" after removing"); strings.forEach(c1);
		 */
        
        ArrayList<String> students = new ArrayList<String>(); 
        
        // Add Strings to list 
        // each string represents student name 
        students.add("Ram"); 
        students.add("Mohan"); 
        students.add("Sohan"); 
        students.add("Rabi"); 
        students.add("Shabbir"); 
  
        // apply removeIf() method 
        // we are going to remove names 
        // start with S 
        students.removeIf(n -> (n.charAt(0) == 'S')); 
  
        System.out.println("Students name Does not start with S"); 
        // print list 
        for (String str : students) { 
            System.out.println(str); 
        } 
	}

}
