package sample.co.in;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConWord {

	public static void main(String[] args) {
		String s = "surya prabu surya";
		String[] s1 = s.split(" ");
		Map<String, Integer> m = new LinkedHashMap<>();
		for (String a : s1) {
			if (m.containsKey(a)) {
				int i = m.get(a);
				m.put(a, i + 1);

			} else {
				m.put(a, 1);
			}

		}
		System.out.println(m);
	}

}
