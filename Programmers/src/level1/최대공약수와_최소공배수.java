package level1;

public class 최대공약수와_최소공배수 {

	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        //int max = 0;
        
        for(int i=1; i<=n; i++) {
        	if(n%i==0 && m%i==0)
        		answer[0] = i;
        }
        //answer[0] = max;
        
       // int min = max * (n/max) * (m/max);
        
       // answer[1] = min;
        answer[1] = answer[0] * (n/answer[0]) * (m/answer[0]);
        
        return answer;
    }
	
	public static void main(String[] args) {
	
		int n = 3;
		int m = 12;
		System.out.println(solution(n, m));

	}

}
