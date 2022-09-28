package bronze;
import java.util.*;

public class _2908_상수 {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

	public static void main(String[] args) {
        //변수 선언
		int n1,n2;
		String s1,s2;
		StringBuffer sb1,sb2;
		
        //입력
		Scanner sc = new Scanner(System.in);
		s1 = sc.next();
		s2 = sc.next();
		
        //String -> StringBuffer 변환 후, 역순으로 처리
		sb1 = new StringBuffer(s1);
	    sb2 = new StringBuffer(s2);		
	    sb1.reverse();
	    sb2.reverse();
	    
        //StringBuffer -> String 변환
	    s1 = sb1.toString();
	    s2 = sb2.toString();
		
        //String -> int 변환 후, 크기 비교해서 출력
		n1 = Integer.valueOf(s1);
		n2 = Integer.valueOf(s2);
		if(n1>n2) System.out.print(n1);
		else System.out.print(n2);
	
	}

}
