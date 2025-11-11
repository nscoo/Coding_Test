class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int newCoke = (n / a) * b;  // 새로 받는 콜라
            answer += newCoke;           // 누적
            n = newCoke + (n % a);  
        }
        return answer;
    }
}