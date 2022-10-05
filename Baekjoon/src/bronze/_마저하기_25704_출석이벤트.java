package bronze;
import java.util.*;

public class _마저하기_25704_출석이벤트 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();

		int money=p;
		
		if(n>4 && n<10)
			money -= 500;
		else if(n>9 && n<15)
			money *= 0.9;
		else if(n>14 && n<20)
			money -= 2000;
		else if(n>19)
			money *= 0.75;
		
		if(money<0) 
			System.out.println(0);
		else
			System.out.println(money);
	}

}
