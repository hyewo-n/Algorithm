package level1;
import java.util.*;

public class _마저풀기_나누어_떨어지는_숫자_배열 {

	public static int[] solution(int[] arr, int divisor) {
		
        int[] answer = new int[divisor];
        
        for(int i=0; i<answer.length; i++) {
        	if(arr[i]%divisor==0) {
        		
        	}
        }

        return answer;
    }
	
	public static void main(String[] args) {
		
		int arr[] = {5, 9, 7, 10};
		int n = 5;
		System.out.println(solution(arr, n));
		
	}

}
