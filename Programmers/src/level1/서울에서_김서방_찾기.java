package level1;

import java.util.*;

public class 서울에서_김서방_찾기 {

	public static String solution(String[] seoul) {
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String arr[] = { "Jane", "Kim" };
		System.out.println(solution(arr));
	}

}
