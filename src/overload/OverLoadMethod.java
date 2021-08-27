package overload;

public class OverLoadMethod {
	public static void main(String[] args) {
		Computer1 com = new Computer1();

		com.setComputer("WindowsXP", 2048);
		com.show();
		System.out.println("----------------------------------------");

		com.setComputer("Windows2000");
		com.show();
		System.out.println("----------------------------------------");

		com.setComputer(512);
		com.show();
		System.out.println("----------------------------------------");

		Computer2 com1 = new Computer2();
		com1.show();
		System.out.println("-----------------------------------------");

		Computer2 com2 = new Computer2("WindowsXP", 2048);
		com2.show();
	}
}
