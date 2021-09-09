package inheritance;

public class UseToStringMethod {
	public static void main(String[] args) {
		Computer1 com1 = new Computer1();
		System.out.println(com1);

		Computer2 com2 = new Computer2();
		com2.setOsMemory("WindowVista", 2048);
		System.out.println(com2);
	}
}
