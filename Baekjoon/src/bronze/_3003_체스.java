package bronze;
import java.util.*;

public class _3003_Ã¼½º {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int pi[] = {1, 1, 2, 2, 2, 8};
		int answer[] = new int[6];
		
		for(int i=0; i<6; i++) {
			answer[i] = pi[i] - arr[i];
		}
		
		for(int x : answer)
			System.out.print(x + " ");

	}

}
