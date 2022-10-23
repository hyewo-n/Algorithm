package level1;
import java.util.*;

public class 문자열_내림차순으로_배치하기 {

	public static String solution(String s) {
        String answer = "";
        
        char arr[] = s.toCharArray();
        
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--) {
        	answer += arr[i];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
	
		String str = "Zbcdefg";
		System.out.println(solution(str));

	}

}
