package practice;

abstract public class Fruit {
	int price;
	
	Fruit(int price) {
		this.price = price;
	}
	
	abstract int getPrice();
}
