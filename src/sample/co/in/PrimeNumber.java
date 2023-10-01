package sample.co.in;

public class PrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		// int n=17;
		for (int j = 1; j < 100; j++) {

			for (int i = 2; i > j; i++) {
				if (j % i == 0) {
					count = count + 1;
				}

			}

			if (count == 0) {
				System.out.println("the given num is primenum:" + j);
			} else {
				System.out.println("the given num is not prime:" + j);
			}
		}

	}
}
