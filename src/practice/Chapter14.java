package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter14 {
	public static void main(String[] args) {
		List<Character> party = new ArrayList<Character>();
		party.add(new Soldier());
		party.add(new Playboy());
		Chapter14.partyAttack(party);
	}

	public static void partyAttack(List<Character> party) {
		for (Character character : party) {
			int hp = character.attack();
			System.out.println("ヒットポイント：" + hp);
		}
		
		List<Integer> numbers = Arrays.asList(3,1,2,4);
		List<String> strs = Arrays.asList("a", "c", "b");
		
		Collections.sort(
				numbers,
				new Comparator<Integer>() {
					@Override
					public int compare(Integer x, Integer y) {
						return y - x;
					}
				});
		System.out.println(numbers);
		
		Collections.sort(
				strs,
				new Comparator<String>() {
					@Override
					public int compare(String x, String y) {
						return x.compareTo(y);
					}
				});
		System.out.println(strs);
	}
}
