package lambdaOnCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainAPICollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p1= new Person("Mike", 34);
		Person p2= new Person("Feebe", 26);
		Person p3= new Person("Chandler", 29);
		Person p4= new Person("Monica", 30);
		Person p5=  new Person("Ross", 27);
		Person p6= new Person("Rachel", 23);
		
		List<Person> people = new ArrayList(Arrays.asList(p1, p2, p3, p4, p5, p6));
		
		people.removeIf(p-> p.getAge()<30);
		//people.forEach( System.out::println);
		people.sort(Comparator.comparing(Person::getAge).reversed());
		people.forEach( System.out::println);
		
		City newYork= new City("New York");
		City shanghai = new City("Shangai");
		City paris= new City("Paris");
		
		
		System.out.println("map1");
		Map<City, List<Person>> mapCities= new HashMap<>();
		mapCities.putIfAbsent(paris, new ArrayList<>());
		mapCities.get(paris).add(p1);
		
		mapCities.computeIfAbsent(newYork, city-> new ArrayList<>()).add(p2);
		
		mapCities.forEach((city, people2) -> System.out.println( city+ " : " + people2));
		
		
		
		Map<City, List<Person>> mapCities2= new HashMap<>();
		mapCities2.computeIfAbsent(shanghai, city-> new ArrayList<>()).add(p4);
		mapCities2.computeIfAbsent(paris, city-> new ArrayList<>()).add(p5);
		
		
        System.out.println("Map 2");
		mapCities2.forEach((city, people2) -> System.out.println( city+ " : " + people2));
		
		
		
		mapCities2.forEach(
				   (city, people3)->{
					   
					   mapCities.merge(city, people3 , (x, peopleFromMap2)-> {x.addAll(peopleFromMap2);
					   return x;
					   });
				   }
				
				);
		
		
		
		System.out.println("after merge");
		mapCities.forEach((city, people2) -> System.out.println( city+ " : " + people2));
		
		
		//mapCities.computeIfAbsent()
		System.out.println("people from Paris.. "+ mapCities.getOrDefault(paris, Collections.EMPTY_LIST));
		System.out.println("people from New York.. "+ mapCities.getOrDefault(newYork, Collections.EMPTY_LIST));
		
	}

}
