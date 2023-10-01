package sample.co.in;

public class Count {
	public static void main(String[] args) {
		String s = "Surya047@gmail.com";
		int small = 0;
		int cap = 0;
		int digit = 0;
		int spec = 0;
		char[] c = s.toCharArray();
		for (char a : c) {
			if (a >= 'a' && a <= 'z') {
				small = small + 1;

			}
			else if (a >= 'A' && a <= 'Z') {
				cap = cap + 1;

			}
			else if (a >='0' && a <= '9') {
				digit = digit + 1;
			} 
			else {
				spec=spec+1;
			}
			

		}
		System.out.println("spec:" + spec);
		System.out.println("digit:" + digit);

		System.out.println("cap:" + cap);

		System.out.println("small:" + small);

	}

}
