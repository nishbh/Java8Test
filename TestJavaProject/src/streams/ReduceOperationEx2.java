package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceOperationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> ages= Arrays.asList();
		Stream<Integer> stream= ages.stream();
		Optional<Integer> max= stream.max(Comparator.naturalOrder());
		
		if(max.isPresent())
		{
			System.out.println(max.get());
		}
		
		System.out.println(max.orElse(0));
		
		System.out.println(max.orElseThrow(RuntimeException:: new));
	}

}
