package sample.co.in;


public class Reverse {
	public static void main(String[] args) {
		int rev =0;
		int a =353;
		int b= 0;
		
		while (a>0) {
			b=a%10;
			rev = (rev*10)+b;
			a=a/10;
		}
		System.out.println(rev);
	if(a==rev) {
		System.out.println("Given num is palindrome");
		
	}	
	
}
	

}
