package level1;

public class �ݶ���_���� {

	public static int solution(int num) {
		long n = num;
        int answer = 0;
        
        while(n!=1) {
        	if(n%2==0) {
        		n = n/2;
        		answer++;
        	}else {
        		n = n*3 + 1;
        		answer++;
        	}       	
        	if(answer==500) {
        		answer= -1;
        		break;
        	}

        }
        
        return answer;
    }
	
	public static void main(String[] args) {
	
		int n2 = 626331;
		System.out.println(solution(n2));
		
	}

}
