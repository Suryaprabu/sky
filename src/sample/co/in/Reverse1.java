package sample.co.in;

public class Reverse1 {
	public static void main(String[] args) {
		int rev = 0;
		int i = 323, j = 0;
		int n= i;
		while (i > 0) {
			j = i % 10;
			rev = (rev * 10) + j;
			i = i / 10;
		}
		System.out.println("reverse number:" + rev);
		if (n == rev) {
			System.out.println("given number is palindrome");

		} else {
			System.out.println("give num is not palindrome");
		}

	}

}
