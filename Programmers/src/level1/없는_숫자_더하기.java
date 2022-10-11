package level1;

public class 없는_숫자_더하기 {

	public static int solution(int[] numbers) {
        int answer = 0;
        int sum=0;
        
        for(int i=1; i<10; i++) {
        	for(int j=0; j<numbers.length; j++) {
        		if(numbers[j] == i)
        			sum += i;
        	}
        }
        answer = 45-sum;
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int arr[] = {5, 8, 4, 0, 6, 7, 9};
		System.out.println(solution(arr));
		
	}

}
