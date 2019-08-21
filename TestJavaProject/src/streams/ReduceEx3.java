package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list= Arrays.asList(-12, -13);
		
		Optional<Integer> red=
		list.stream().reduce(Integer::max);
		System.out.println(" red is " + red);
	}

}
