package bronze;
import java.util.*;

public class _1152_�ܾ���_���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// trim�� ���⿡ �ٿ��� ��.. �Ʒ� spilt���� �ٿ����� Ʋ��
		String str = sc.nextLine().trim();
		
		String spilt[] = str.split(" ");
		
		int answer = spilt.length;
		
		// ���� �Էµ��� ���� ��쵵 ������־�� ��
		if(str.isEmpty())
			System.out.println(0);
		else
			System.out.println(answer);
		
	}

}
