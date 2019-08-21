package lambdaOnCollection;

import java.util.ArrayList;
import java.util.List;

public class CollectionLamdaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listNames= new ArrayList<>();
		listNames.add("Rama");
		listNames.add("test");
		listNames.add("rama1");
		listNames.forEach((s)-> System.out.println(s));
		
		listNames.removeIf((s)-> s.startsWith("t"));
		listNames.forEach(System.out::println);
		
				
	}

}
