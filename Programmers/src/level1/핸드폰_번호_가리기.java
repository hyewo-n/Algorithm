package level1;
import java.util.*;

public class �ڵ���_��ȣ_������ {

	public static String solution(String phone_number) {
        String answer = "";

        // ��ȣ ���� ����
        int len = phone_number.length();
        
        // ���ڸ� �� *�� ����
        for(int i=0; i<len-4; i++) {
        	answer += '*';
        }
        
        // ���ڸ� �ٿ���
        for(int i=len-4; i<len; i++) {
        	answer += phone_number.charAt(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String number = "01033334444";
		System.out.println(solution(number));

	}

}
