package bronze;
import java.util.*;

public class _�絵��_2609_�ִ�������_�ּҰ���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		int big=0;
		if(a>b)
			big=a;
		else
			big=b;
		
		int num1=0;
		
		for(int i=1; i<big; i++) {
			if(a%i==0 && b%i==0)
				num1 = i;
		}
		
		int num2= num1 * (a/num1) * (b/num1);
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}