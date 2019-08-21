package lambdaOnCollection;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator<Integer> 
        op = BinaryOperator 
                 .maxBy( 
                     (a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1)); 

    System.out.println(op.apply(11, 11)); 

	}

}
