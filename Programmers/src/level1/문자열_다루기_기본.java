package level1;

public class 문자열_다루기_기본 {

	public static boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6)
        	return false;
        
        for(int i=0; i<s.length(); i++) {
        	char c = s.charAt(i);
        	if((c>='A' && c<='Z')||(c>='a' && c<='z')) {
        		answer = false;
        		break;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String str = "a234";
		System.out.println(solution(str));
		
	}

}
