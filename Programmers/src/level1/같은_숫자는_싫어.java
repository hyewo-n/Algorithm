package level1;
import java.util.ArrayList;

public class ����_���ڴ�_�Ⱦ� {

	public static ArrayList<Integer> solution(int arr[]) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		// �� �� ���ڰ� ���� ��� ���� ���� ���� ������
		// �迭�� ũ�⸦ 1 �÷��� ���� 10�� �߰�����
		// �迭�� ���� ���ڴ� 0~9�̱� ������ �� ���ڸ� ���ؼ� ���� �߰��� �ִ� ��
		
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
	 * �ߺ��� �����ϴ� �ڵ�
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
