package lambdaStyle;

@FunctionalInterface
public interface Greeting {
	public void hello(String word);
}

class Main {
	public static void main(String[] args) {
		Greeting greeting = (String word) -> {
			System.out.println(word);
		};

		Greeting greeting2 = System.out::println;		
	}
}

