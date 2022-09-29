package bronze;
import java.util.*;

public class _1546_ЦђБе {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float arr[] = new float[n];
		
		float max=Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max)
				max = arr[i];
		}
		
		float sum =0;
		for(int i=0; i<n; i++) {
			arr[i] = arr[i] / max *100;
			sum += arr[i];
		}
		
		float avg = sum /n;
		System.out.println(avg);
		
	}

}
