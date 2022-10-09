package level1;

import java.util.Scanner;

public class ÇÏ»þµå_¼ö {

	 public static boolean solution(int x) {
	        boolean answer = true;
	        
	        int sum=0;
	        String arr = String.valueOf(x);
	        for(int i=0; i<arr.length(); i++) {
	        	sum += arr.charAt(i)-'0';
	        }
	        
	        if(x%sum!=0) {
	        	answer = false;
	        }
	  
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		int n = 11;
		System.out.println(solution(n));
		
	}

}
