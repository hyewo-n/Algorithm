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
		
		ArrayList<Integer> nana = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			if(!nana.contains(na[i]))
				nana.add(na[i]);
		}
		int ans = nana.size();
		System.out.println(ans);

	}

}
