package level1;
import java.util.*;

public class 핸드폰_번호_가리기 {

	public static String solution(String phone_number) {
        String answer = "";

        // 번호 길이 저장
        int len = phone_number.length();
        
        // 앞자리 다 *로 변경
        for(int i=0; i<len-4; i++) {
        	answer += '*';
        }
        
        // 뒷자리 붙여줌
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
