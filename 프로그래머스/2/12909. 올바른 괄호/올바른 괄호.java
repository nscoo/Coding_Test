import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(c[i] == '(') st.push(c[i]);
            else{
                if(st.size()<1) return false;
                st.pop();
            }
        }
        System.out.print("SIZE ::  " + st.size());
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        if(st.isEmpty()) return true;
        else return false;
    }
}