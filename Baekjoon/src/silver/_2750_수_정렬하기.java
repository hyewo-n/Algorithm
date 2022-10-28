package silver;
import java.util.*;

public class _2750_수_정렬하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int x : arr) {
			System.out.println(x);
		}
		
	}
}
