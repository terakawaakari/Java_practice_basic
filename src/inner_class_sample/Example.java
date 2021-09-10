package inner_class_sample;

public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner.hello());

		Outer.Inner2 inner2 = new Outer.Inner2();
		System.out.println(inner2.hello());
	}
}
