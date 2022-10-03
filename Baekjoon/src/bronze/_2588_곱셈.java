package bronze;
import java.util.*;

public class _2588_°ö¼À {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int one= a * (b%10);
		
		int i = (b % 100) - (b%10);
		int two=a*i/10;
		
		int three=a * (b/100);
		int four=a*b;
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);

	}

}
