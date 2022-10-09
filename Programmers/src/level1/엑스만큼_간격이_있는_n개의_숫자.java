package level1;

public class 엑스만큼_간격이_있는_n개의_숫자 {

	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = (long)x;
        
        for(int i=1; i<n; i++) {
        	answer[i] = answer[i-1] + x;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int x = 2;
		int n = 5;
		System.out.println(solution(x, n));

	}

}
