package inner_class_sample;

public class Outer {
	private static String greeting = "こんにちは";
	
	public class Inner {
		public String hello() {
			return greeting;
		}
	}
	public static class Inner2 {
		public String hello() {
			return greeting;
		}
	}
}
