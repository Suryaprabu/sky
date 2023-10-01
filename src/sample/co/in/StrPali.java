package sample.co.in;

public class StrPali {

	public static void main(String[] args) {
		String a = "amma";
		String r = "";
		String Temp = a;
		for (int i = a.length() - 1; i >= 0; i--) {
			char c = a.charAt(i);
			r =r+c;

		}
		System.out.println(Temp);
		System.out.println(r);
		if (r.equals(Temp)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

}
