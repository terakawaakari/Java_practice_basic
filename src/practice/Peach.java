package practice;

public class Peach extends Fruit {
	Peach (int price) {
		super(price);
	}
	
	@Override
	int getPrice() {
		return price;
	}
}
