package sample.co.in;

import java.util.LinkedHashMap;
import java.util.Map;

public class Acc {
	public static void main(String[] args) {
		int arr[]= {10,20,10,30,40,50,60,40,30,20,40};
		Map<Integer,Integer>m=new LinkedHashMap<>();
		for (int i : arr) {
			if(m.containsKey(i)) {
				Integer a = m.get(i);
				m.put(i, a+1);
				
			}
			else {
				m.put(i, 1);
			}
			
		}
		System.out.println(m);
		
	}

}
