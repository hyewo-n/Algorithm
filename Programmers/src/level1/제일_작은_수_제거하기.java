package level1;

public class 제일_작은_수_제거하기 {

	public static int[] solution(int[] arr) {
		int answer[];
		if(arr.length ==1) {
			answer = new int[]{-1};
		}else {
			answer = new int[arr.length-1];
			// 배열에서 최소값 찾기
			int min = Integer.MAX_VALUE;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			// 
			int index=0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == min) {
					continue;
				}
				answer[index++] = arr[i];	
			}
			
		}
		
        return answer;
    }
	
	public static void main(String[] args) {

		int arr[] = {5, 9, 7, 10};
		System.out.println(solution(arr));

	}

}
