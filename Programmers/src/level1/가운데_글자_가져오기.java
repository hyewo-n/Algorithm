package level1;

public class 가운데_글자_가져오기 {

	public static String solution(String s) {
        String answer = "";
        
        int len = s.length();
        
        if(len%2==1) {
        	answer += s.charAt(len/2);
        }else {
        	answer += s.charAt(len/2-1);
        	answer += s.charAt(len/2); 
        }
        
        return answer;
    }
	
	public static void main(String[] args) {

		String str = "qwer";
		System.out.println(solution(str));

	}

}
