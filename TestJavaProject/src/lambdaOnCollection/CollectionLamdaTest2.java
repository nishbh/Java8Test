package lambdaOnCollection;

import java.util.HashMap;
import java.util.Map;

public class CollectionLamdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String>  map= new HashMap<>();
		map.put("key", "value1");
		map.put("key2", "value2");

		map.forEach( (x, y) ->System.out.println("key is " + x + "value is " +y) );
		
		
	}

}
