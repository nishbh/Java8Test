package lambdaOnCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapFilterReduceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//st<Person> people =new ArrayList<>();
		
		Person p1= new Person("Mike", 34);
		Person p2= new Person("Feebe", 26);
		Person p3= new Person("Chandler", 29);
		Person p4= new Person("Monica", 30);
		Person p5=  new Person("Ross", 27);
		Person p6= new Person("Rachel", 23);
		List<Person> people = new ArrayList(Arrays.asList(p1, p2, p3, p4, p5, p6));
		
		/*
		 * List<Integer> ages= people.stream().mapToInt( p-> p.getAge()).filter(x->
		 * x>30). reduce((x,y)->(x+y)/2);
		 */
				
		
		
	}

}
