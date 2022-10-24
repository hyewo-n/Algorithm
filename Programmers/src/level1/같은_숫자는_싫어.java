package level1;
import java.util.ArrayList;

public class 같은_숫자는_싫어 {

	public static ArrayList<Integer> solution(int arr[]) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 맨 끝 숫자가 같을 경우 비교할 값이 없기 때문에
		// 배열의 크기를 1 늘려서 끝에 10을 추가해줌
		// 배열의 원소 숫자는 0~9이기 때문에 이 숫자를 피해서 값을 추가해 주는 것
		
		int arr2[] = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr.length] = 10;
		
		for(int i=0; i<arr2.length-1; i++) {
			for(int j=i+1; j<arr2.length; j++) {
				if(arr2[i] != arr2[j]) {
					answer.add(arr2[j-1]);
					i=j-1;
					break;
				}
			}	
		}
		
        return answer;
        
    }
	
	/*
	 * 중복값 제거하는 코드
	answer.add(arr[0]);
	for(int i=1; i<arr.length; i++) {
		if(answer.contains(arr[i]))
			continue;
		else
			answer.add(arr[i]);
	}
	*/
	
	public static void main(String[] args) {
	
		int arr[] = {1, 1, 3, 3, 0, 1, 1};
		System.out.println(solution(arr));

	}

}
