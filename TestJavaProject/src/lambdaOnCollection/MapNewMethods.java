package lambdaOnCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapNewMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, String>  map= new HashMap<>();
		map.put("key", "value1");
		map.put("key2", "value2");
		
		System.out.println(map.getOrDefault("key2", "defaultValue"));
		
		map.putIfAbsent("key2", "value3");
		
		map.forEach( (x, y) ->System.out.println("key is " + x + "value is " +y) );
		
		
		
		map.replace("key", "value01");
		
		map.forEach( (x, y) ->System.out.println("key is " + x + "value is " +y) );
		
		
		map.remove("key", "value01");
		
		map.forEach( (x, y) ->System.out.println("key is " + x + "value is " +y) );
		
		//map.comp
		
		
		
		
	}

}
