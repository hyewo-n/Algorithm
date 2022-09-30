package bronze;
import java.util.*;

public class _2525_¿Àºì½Ã°è {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = b+c;
		if(min>=60) {
			while(min>=60) {
				a += 1;
				min = min-60;
			}
		}
		if(a>=24)
			a -= 24;
		
		System.out.println(a + " " + min);

	}

}
