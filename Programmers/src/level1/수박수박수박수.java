package level1;

public class ���ڼ��ڼ��ڼ� {

	public static String solution(int n) {
        String answer = "";
        
        for(int i=1; i<=n; i++) {
        	if(i%2==1)
        		answer += '��';
        	else
        		answer += '��';
        }
        
        return answer;
    }
	
	public static void main(String[] args) {

		int n = 5;
		System.out.println(solution(n));

	}

}
