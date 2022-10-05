package bronze;
import java.util.*;

public class _3052_³ª¸ÓÁö {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int na[] = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
			na[i] = arr[i]%42;
		}
		int answer=10;
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<10; j++) {
				if(na[i] == na[j]) {
					answer = answer-1;
				}
			}
			
		}
		System.out.println(answer);
		

	}

}
