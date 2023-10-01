package sample.co.in;

public class ReverseOne {
	    public static void main(String[] args) {
	        int a =456;
	        int rev=0;
	        int b=0;
	        int temp=a;
	        while(a>0){
	             b=a%10;
	            rev = (rev*10)+b;
	            a=a/10;
	            
	            
	        }
	        System.out.println("the rev num is:"+rev);
	        if(temp==rev){
	            System.out.println("the given number is palindrome");
	        }
	        else {
	        System.out.println("The guven number is not palindrome");
	    }
	}

}
