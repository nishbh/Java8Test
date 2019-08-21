package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lambdaOnCollection.Person;

public class MapFilterStreamTest {
	
	public static void main(String[] args) {
		
		
		Person p1= new Person("Mike", 34);
		Person p2= new Person("Feebe", 26);
		Person p3= new Person("Chandler", 29);
		Person p4= new Person("Monica", 30);
		Person p5=  new Person("Ross", 27);
		Person p6= new Person("Rachel", 23);
		
		List<Person> people = new ArrayList(Arrays.asList(p1, p2, p3, p4, p5, p6));
	
		
		/*
		 * people.stream() //map(p -> p.getAge()) .filter(p ->p.getAge()>30)
		 * .forEach(System.out::println);
		 */
		
		
		
		/*
		 * people.stream().peek(System.out::println). map(p -> p.getAge())
		 * .peek(System.out::println) .filter(age -> age>30)
		 * .forEach(System.out::println);
		 */
		
		people.stream().peek(System.out::println).
	  skip(2).limit(3).
		  map(p -> p.getAge())
		  .peek(System.out::println)
			.filter(age -> age>30)
			.forEach(System.out::println);
		
	}

}
