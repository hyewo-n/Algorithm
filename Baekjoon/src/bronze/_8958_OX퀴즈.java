package bronze;
import java.util.*;

public class _8958_OXÄûÁî {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			int answer=0;
			int sum=0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='O') {
					answer++;
					sum += answer;
				} else {
					answer=0;
				}
			}
			
			System.out.println(sum);
			
		}
		
	}

}
