package level1;

import java.util.Scanner;

public class ��������_1��_�Ǵ�_��_ã�� {

	public static int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<n; i++){
            if(n%i == 1){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int n = 10;
		System.out.println(solution(n));

	}

}
