package level1;
import java.util.*;

public class 자연수_뒤집어_배열로_만들기 {

	public static int[] solution(long n) {
        		
        String str = String.valueOf(n);
        int answer[] = new int[str.length()];
        for(int i=str.length()-1; i>=0; i--) {
        	answer[str.length()-1-i]
        			= str.charAt(i)-'0';
        }
        
        return answer;

    }
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long n = 12345;
		System.out.println(solution(n));

	}

}
