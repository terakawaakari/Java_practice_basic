package practice;

public class Peach extends Fruit {
	Peach (String name, int price) {
		super(name, price);
	}
	
	@Override
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
}
