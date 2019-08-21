package string;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Hello World!";
		
		IntStream stream= s.chars();
		
		stream.mapToObj(letter -> (char)letter)
		.map(Character::toUpperCase)
		.forEach(System.out::print);
		
		System.out.println("\n");
		StringJoiner sj= new StringJoiner(",");
		sj.add("one").add("two").add("three");
		System.out.println(sj);
		
		String st=
				String.join(",", "hello", "world");
		
				System.out.println(st);
		
		
	}

}
