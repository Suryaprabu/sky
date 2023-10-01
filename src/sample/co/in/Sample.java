package sample.co.in;

public class Sample {
	public static void main(String[] args) {
		int odd=0;
		int even=0;
		
		for (int i = 0; i <= 100; i++) {
			if (i%2 ==1) {
				odd = i+odd;
			 }
			else {
				even =i+even;
			}
			
		}
		System.out.println("Odd:"+odd);
		System.out.println("even:"+even);
	}

}
