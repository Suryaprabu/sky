package sample.co.in;

public class Prime {

	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 2; i <= 10; i++) {
			for (int j = 2; j <= 10; j++) {
				if (i % j == 0) {

					count = count + 1;
					break;
				}
				
			}

		
	
		if (count == 0) {
			System.out.println("given number is prime:" + i);
		} else {
			System.out.println("given num is not prime:" + i);
		}
	}
	}

}
