package bronze;
import java.util.*;

public class _10818_최소최대 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[n-1]);
	}
}
