package sample.co.in;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 10, 20 };
		Set<Integer> s = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		System.out.println(s);
	}

}
