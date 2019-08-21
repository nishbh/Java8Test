package functionalInterface;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Predicate<String> p = ( s)-> s.length()<20;
		
		System.out.println(p.test("hello world is in india"));
		
	}

}
