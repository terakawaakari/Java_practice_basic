package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator01 {
	public static void main(String[] args) {
		String[] animalArray = { "dog", "cat", "fox", "elephant" };
		List<String> animals = Arrays.asList(animalArray);

	Collections.sort(
			animals,
			new Comparator<String>() {
				@Override
				public int compare(String x, String y) {
					return x.compareTo(y);
				}
			});

	System.out.println(animals);
	}
}
