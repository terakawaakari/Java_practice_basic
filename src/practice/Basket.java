package practice;

public class Basket<E extends Fruit> {
	private E elem;
	private int price = 100;
	
	Basket(E e) {
		elem = e;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
	
	void printSumPrice() {
		System.out.println("合計金額：" + (this.price + elem.getPrice()));
	}
	
	public static void main(String[] args) {
		Basket<Peach> peachBasket = new Basket<>(new Peach(300));
		peachBasket.printSumPrice();
	}
}
