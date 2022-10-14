package level1;

public class 부족한_금액_계산하기 {

	public static long solution(int price, int money, int count) {
        long answer = 0;

        long sum = 0;
        
        for(int i=1; i<=count; i++) {
        	sum += (long)(price * i);
        }
        
        if(sum > money)
        	answer = sum-(long)money;
        
        return answer;
    }
	
	public static void main(String[] args) {
	
		int p = 3;
		int m = 20;
		int c = 4;
		
		System.out.println(solution(p, m, c));
		

	}

}
