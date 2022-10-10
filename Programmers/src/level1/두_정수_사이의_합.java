package level1;

public class 두_정수_사이의_합 {

	public static long solution(int a, int b) {
        long answer = 0;
        
        if(a>b) {
        	int tmp = a;
        	a=b;
        	b=tmp;
        }
        
        for(int i=a; i<=b; i++) {
        	answer += (long)i;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int x = 5;
		int n = 3;
		System.out.println(solution(x, n));

	}

}
