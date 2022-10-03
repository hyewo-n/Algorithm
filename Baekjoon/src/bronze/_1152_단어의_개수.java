package bronze;
import java.util.*;

public class _1152_단어의_개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// trim을 여기에 붙여야 함.. 아래 spilt에서 붙였더니 틀림
		String str = sc.nextLine().trim();
		
		String spilt[] = str.split(" ");
		
		int answer = spilt.length;
		
		// 값이 입력되지 않은 경우도 계산해주어야 함
		if(str.isEmpty())
			System.out.println(0);
		else
			System.out.println(answer);
		
	}

}
