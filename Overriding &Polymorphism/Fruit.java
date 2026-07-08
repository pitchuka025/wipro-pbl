public class Fruit {
	private String name;
	private String taste;
	private String size;

	public Fruit(String name, String taste, String size) {
		this.name = name;
		this.taste = taste;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public String getTaste() {
		return taste;
	}

	public String getSize() {
		return size;
	}

	public void eat() {
		System.out.println("Eating a " + name + " which tastes " + taste + ".");
	}

	// Simple demo
	public static void main(String[] args) {
		Fruit apple = new Apple("medium");
		Fruit orange = new Orange("medium");

		apple.eat();
		orange.eat();
	}
}

class Apple extends Fruit {
	public Apple(String size) {
		super("Apple", "sweet", size);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is crunchy and sweet.");
	}
}

class Orange extends Fruit {
	public Orange(String size) {
		super("Orange", "tangy", size);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is juicy and tangy.");
	}
}