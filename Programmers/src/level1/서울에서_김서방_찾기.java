package level1;

import java.util.*;

public class ���￡��_�輭��_ã�� {

	public static String solution(String[] seoul) {
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "�輭���� " + i + "�� �ִ�";
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
