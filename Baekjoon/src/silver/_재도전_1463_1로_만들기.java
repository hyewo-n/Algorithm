package silver;
import java.util.*;

public class _재도전_1463_1로_만들기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		while(n>1) {
			if(n%3==1) {
				n = n -1;
				count++;
		System.out.println("1+3 : " + n);
			}
			if(n%3==0) {
				n = n/3;
				count++;
		System.out.println("3 : " + n);
			}
			if(n%2==0) {
				n = n/2;
				count++;
		System.out.println("2 : " + n);
			}		
		}
		System.out.println(count);

	}

}
