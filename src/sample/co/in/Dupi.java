package sample.co.in;

public class Dupi {

	public static void main(String[] args) {
    int []a= {10,20,30,10,50,30};
    System.out.println("Duplicate values:");
    for (int i = 0; i < a.length; i++) {
    	for (int j = i+1; j < a.length; j++) {
    		if(a[i]==a[j]) {
    			System.out.println(a[i]);
    		}
   
    		
			
		}
		
	}
	}

}
