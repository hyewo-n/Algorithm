package bronze;
import java.util.*;

public class _2480_�ֻ������� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 3���� ���� ��� ���� ��
		if(a==b && a==c) {
			System.out.println(10000 + a*1000);
		}
		else {
			// 3���� ���� ��� �ٸ� ��
			if(a!=b && a!=c && b!=c) {
				int max=a;
				max = Math.max(max, b);
				max = Math.max(max, c);
				System.out.println(max * 100);
			}
			else {
				// 2���� ���� ���� ��
				if(a==b && a!=c) {
					System.out.println(1000 + a *100);
				}
				else if(a!=b && a==c) {
					System.out.println(1000 + a *100);
					
				}
				else if(a!=b && b==c) {
					System.out.println(1000 + b *100);
					
				}
			}
		}
	}
}
