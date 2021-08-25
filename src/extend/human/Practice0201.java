package extend.human;

public class Practice0201 {
	public static void main(String[] args) {
		Human02 kanda = new Human02();
		kanda.name = "神田太郎";
		kanda.age = 30;
		kanda.showPerson();

		kanda.name = "神田花子";
		kanda.age = 20;
		kanda.showPerson();
	}
}
