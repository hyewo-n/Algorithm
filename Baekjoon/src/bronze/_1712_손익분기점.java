package bronze;
import java.util.*;

public class _1712_���ͺб��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		if(b>=c)
			System.out.println(-1);
		else
			System.out.println((a/(c-b))+1);	
	}
}

/*
 *  A:�������   B:�������   C:�Ǹź��
 *  X:���ͺб����� ������ ���ؼ� �Ⱦƾ� �ϴ� ��Ʈ�� ����
 *  
 *  A + (B * X) < C * X �� �����ؾ� ��
 *  ���� �� ������ �����ϸ�
 *  A / (C - B) < X �� ��
 *  
 *  �������� ���ϴ� ���̹Ƿ� A / (C - B) ������ 1�� �����ָ�
 *  ���ͺб����� ���۵Ǵ� X�� �ּҰ��� ���� �� ����.
 */

