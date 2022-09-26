package bronze;
import java.util.*;

public class _1712_손익분기점 {

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
 *  A:고정비용   B:가변비용   C:판매비용
 *  X:손익분기점이 나오기 위해서 팔아야 하는 노트북 갯수
 *  
 *  A + (B * X) < C * X 를 만족해야 함
 *  식을 한 쪽으로 정리하면
 *  A / (C - B) < X 가 됌
 *  
 *  정수값을 구하는 것이므로 A / (C - B) 값에서 1을 더해주면
 *  손익분기점이 시작되는 X의 최소값을 구할 수 있음.
 */

