package i2.logic;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void displayName() {
		System.out.println("Name:" + this.name);
	}

}
