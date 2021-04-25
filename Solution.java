import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        int len = numbers.length;
        String[] result = new String[len]; 
        
        // 숫자 > String으로 파싱하여 array에 입력
        for(int i = 0; i < len; i++)
            result[i] = numbers[i] + "";
        
      
        // Lambda 를 이용한 Comparetor 생성
        // 두개 String(s1,s2) 의 Concat 값이 큰 것부터 오도록 정렬
        Comparator<String> com = (s1, s2) -> (s2 + s1).compareTo(s1+ s2);
      
        // String Array 정렬
        Arrays.sort(result, com);
               
        String answer = "";
        for(String s : result)
            answer += s;
        
        if(answer.charAt(0) == '0')
            return "0";
        
        return answer;
    }
}
