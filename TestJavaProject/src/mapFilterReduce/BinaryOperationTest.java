package mapFilterReduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> ints = Arrays.asList(1, 2, 3);
		int sum=0;
		BinaryOperator<Integer> op=(i1, i2)->(i1+i2);
		for(int i:ints)
		{
			sum=op.apply(sum, i);
		}
		
		System.out.println(sum);
	}

}
