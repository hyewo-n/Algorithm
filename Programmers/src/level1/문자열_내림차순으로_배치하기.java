package level1;
import java.util.*;

public class ���ڿ�_������������_��ġ�ϱ� {

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
