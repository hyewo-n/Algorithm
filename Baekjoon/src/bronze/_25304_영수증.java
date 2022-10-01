package bronze;
import java.util.*;

public class _25304_¿µ¼öÁõ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			sum += a[i] * b[i];
		}
		
		if(sum==x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
