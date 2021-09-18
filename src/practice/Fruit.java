package practice;

abstract public class Fruit {
	String name;
	int price;
	
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	abstract String getName();
	abstract int getPrice();
}
