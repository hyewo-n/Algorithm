package bronze;
import java.util.*;

public class _25305_커트라인 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int cut = arr[n-k];
		System.out.println(cut);
		
	}

}
