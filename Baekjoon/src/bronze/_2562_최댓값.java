package bronze;
import java.util.*;

public class _2562_ÃÖ´ñ°ª {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		
		int max = Integer.MIN_VALUE;
		int check=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				check = i+1;
			}
		}
		System.out.println(max);
		System.out.println(check);
	}

}
