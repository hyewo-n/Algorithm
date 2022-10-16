package level1;
import java.util.*;

public class 케이_k번째_수 {

	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
        	int check[] = new int[commands[i][1]-commands[i][0]];
        	for(int j=commands[i][0]; j<=commands[i][1]; i++) {
        		int k=0;
        		check[k++] = array[j];
        	}
        	Arrays.sort(check);
        	answer[i] = check[commands[i][3]-1];
        }
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {

		int arr[] = {1, 5, 2, 6, 3, 7, 4};
		int com[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		System.out.println(solution(arr, com));
		

	}

}
