package sample.co.in;

public class VowelCount {
	public static void main(String[] args) {
		String s = "suryaprabu";
		int vowels = 0;
		int cons = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				vowels = vowels + 1;
			} else {
				cons = cons + 1;
			}

		}
		System.out.println(vowels);
		System.out.println(cons);
	}

}
