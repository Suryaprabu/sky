package sample.co.in;

public class OddEven {
	public static void main(String[] args) {
		int even = 0, odd = 0, evencount = 0, oddcount = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				even = even + i;
				evencount = evencount + 1;
			} else {
				odd = odd + i;
				oddcount = oddcount + 1;
			}

		}
		System.out.println("Even:" + even);
		System.out.println("odd:" + odd);
		System.out.println("odd count:" + evencount);
		System.out.println("Even count:" + oddcount);

	}

}
