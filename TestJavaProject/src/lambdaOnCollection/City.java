package lambdaOnCollection;

public class City {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City(String name) {
		//super();
		this.name = name;
	}

	public City() {
		//super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}
	
}
