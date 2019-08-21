package streams;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stream<Integer> stream= Stream.of(1,2, 3, 4);
		BinaryOperator<Integer> sum= (i1, i2)-> i1+ i2;
		int red= stream.reduce(0,sum );
		System.out.println(red);
	}

}
