package annonymous;

public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Animal animal= new Cow();
		//System.out.println(animal.speak());
		
		//approach this via anonymous inner class
		
		Animal animal= new Animal() {

			@Override
			public String speak() {
				// TODO Auto-generated method stub
				return "meouw from inner class";
			}
				
				
		};
		
		
		System.out.println(animal.speak());
	}

}
