package practice;

public class Basket<E extends Fruit> {
	private E elem;
	private int price = 100;
	
	Basket(E e) {
		elem = e;
	}
	
	void printSumPrice() {
		System.out.println(elem.name + "の入ったカゴは合計" + (this.price + elem.getPrice()) + "円です");
	}
	
	public static void main(String[] args) {
		Basket<Peach> peachBasket = new Basket<>(new Peach("もも", 300));
		peachBasket.printSumPrice();
	}
}
