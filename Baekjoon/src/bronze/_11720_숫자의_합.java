package bronze;
import java.util.*;

public class _11720_������_�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		int sum=0;
		int a=0;
		for(int i=0; i<n; i++) {
			a = str.charAt(i)-'0';
			sum+=a;
		}
		System.out.println(sum);

	}

}
