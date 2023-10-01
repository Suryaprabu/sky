package sample.co.in;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
    String s="suryaprabu";
    Set<Character>cs=new LinkedHashSet<>();
    for(int i=0;i<s.length();i++) {
    	cs.add(s.charAt(i));
    }
    System.out.println(cs);
	}

}
