package bronze;
import java.util.*;

public class _1110_더하기_사이클 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a = n;
		int temp = 0;

		if (n == 0)
			System.out.println(1);
		
		else {
			
			temp = n / 10 + n % 10;
			n = (n % 10) * 10 + temp % 10;
			int check = 1;

			while (n > 0) {
				temp = n / 10 + n % 10;
				n = (n % 10) * 10 + temp % 10;
				check++;
				
				if (n == a) {
					System.out.println(check);
					break;
				}
			}	
			
		}
	}
}
