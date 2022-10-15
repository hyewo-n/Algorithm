package level1;

public class 정수_내림차순으로_배치하기 {

	public static long solution(long n) {
        long answer = 0;
        
        String n2 = String.valueOf(n);
        long arr[] = new long[n2.length()];
        for(int i=0; i< arr.length; i++) {
        	arr[i] = (long)(n2.charAt(i)-'0');
        }
        
        // 오름차춘 정렬
        for(int i=0; i<arr.length-1; i++) {
        	for(int j=0; j<arr.length-1-i; j++) {
        		if(arr[j] > arr[j+1]) {
        			long tmp = arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = tmp;
        		}
        	}
        } // 정렬 끝
        
        // 정수로 변환..
        for(int i=0; i<arr.length; i++) {
        	long sum=1;
        	for(int j=1; j<i+1; j++) {
        		sum *= 10;
        	}
        	sum *= arr[i];
        	answer += sum;
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
	
		long n = 118372;
		System.out.println(solution(n));
		

	}

}
