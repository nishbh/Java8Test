package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<String, String, String>  biFun= (s, v)->s+v;
		String ret=biFun.apply("hello", " world");
		System.out.println(ret);
		
		
		UnaryOperator<String> uni= (t)->t+"s";
		System.out.println(uni.apply("hello"));
		
		BinaryOperator<String> bin= (t, s)->t+ s+"s";
		System.out.println(bin.apply("y", "x"));
		
		BiPredicate<String, String> biPred=(x, y)->x.equals(y);
		
		System.out.println(biPred.test("x", "x"));
		
	}

}
