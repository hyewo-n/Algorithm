package silver;
import java.util.*;

public class _1920_수_찾기 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i = 0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}  // 입력완료
		
		for(int i=0; i<m; i++) {
			int check=0;
			for(int j=0; j<n; j++) {
				if(arr2[i] == arr[j]) {
					System.out.println(1);
					check = 1;
					break;
				}
			}
			if(check==0)
				System.out.println(0);
			
		}
	}

}
