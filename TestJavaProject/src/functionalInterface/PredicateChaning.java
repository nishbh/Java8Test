package functionalInterface;

import java.util.function.Predicate;

public class PredicateChaning {
	
	
	public static void main(String[] args)
	{
		Predicate<Integer> pred1= (s)->s>=3;
		Predicate<Integer> pred2= (s)->s>=0;
		Predicate<Integer> pred3= pred1.and(pred2);
		Predicate<Integer> pred4= pred1.or(pred2);
		System.out.println(pred4.test(-1));
		
		
		//static Predicate
		
		Predicate<String> predStat= Predicate.isEqual("hello");
		System.out.println(predStat.test("hello"));
	}

}
