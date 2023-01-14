package isUnique;

import java.util.Arrays;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "shilpa";
		System.out.println(isUnique(s));

	}
	
	public static boolean isUnique(String s) {
		
		char ch []= s.toLowerCase().toCharArray();
		Arrays.sort(ch);
		
		for (int i=0;i < ch.length; i++) {
			return !(ch[i] == ch[i+1]); 
		}
		
		return false;
	}
	
	
	
	

}
