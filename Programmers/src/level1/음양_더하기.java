package level1;

public class 음양_더하기 {

	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<absolutes.length; i++) {
        	if(signs[i]==true) {
        		answer += absolutes[i];
        	}else
        		answer += absolutes[i] * -1;		
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int n[] = {4, 7, 12};
		boolean arr[] = {true, false, true};
		System.out.println(solution(n, arr));

	}

}
