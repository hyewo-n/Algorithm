package silver;
import java.util.*;

public class _�絵��_2869_�����̴�_�ö󰡰�_�ʹ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();

		int day = 0;
		int check = 0;
		
		while(a>0) {
			check += a;
			day++;
			if(check >= v)
				break;
			check -= b;
		}
		
		System.out.println(day);
		
	}

}
