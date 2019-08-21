package functionalInterface;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Consumer<String> printer = s-> System.out.println(s);
		
	printer.accept("hello world test");
	}

}
