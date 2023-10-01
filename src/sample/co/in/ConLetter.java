package sample.co.in;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConLetter {

	public static void main(String[] args) {
    String s ="suryaprabu";
    char[]c=s.toCharArray();
    Map<Character,Integer>m=new LinkedHashMap<>();
    for (char d : c) {
    	if(m.containsKey(d)) {
    		Integer i = m.get(d);
    		m.put(d, i+1);
    		
    	}else {
    		m.put(d, 1);
    	}
		
	}
    System.out.println(m);
	}

}
