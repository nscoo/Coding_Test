import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        /*
        1) 무조건 4개이상의 재료필요
        2) 빵(1) -> 야채(2) -> 고기(3) -> 빵(1) 순이면 갯수 1 -> 스택 초기화
        Ex) 야채 빵 빵 야채 고기  빵 야채 고기 빵
        
        스택 사이즈가 점점 커지는 걸 이용
        한칸씩 검사
        */
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int in : ingredient){
            st.push(in);
            // 조건이 맞을경우 4개 뻄
            if(st.size()>=4){           
                if(st.get(st.size()-1)==1
                  &&st.get(st.size()-2)==3
                  &&st.get(st.size()-3)==2
                  &&st.get(st.size()-4)==1){
                    answer++;
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();                        
                }
                  
            }
        }
        return answer;    
        }
        
    
}