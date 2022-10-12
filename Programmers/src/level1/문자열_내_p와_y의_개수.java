package level1;

public class 문자열_내_p와_y의_개수 {

	static boolean solution(String s) {
        boolean answer = true;

        String st = s.toUpperCase();
        
        int count_p = 0;
        int count_y = 0;
        
        for(int i=0; i<st.length(); i++){
        	if(st.charAt(i)=='P')
        		count_p++;
        	if(st.charAt(i)=='Y')
        		count_y++;
        }
        if(count_p != count_y)
        	answer = false;

        return answer;
    }
	
	public static void main(String[] args) {
		
		String str = "Pyy";
		System.out.println(solution(str));

	}

}
