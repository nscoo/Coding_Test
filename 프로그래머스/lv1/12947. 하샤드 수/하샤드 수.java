class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp =0;
        int ans = x;
        while(x>10){
            tmp += x%10;
            x/=10;
            
        }
        tmp += x;
        
        if(ans%tmp != 0) {answer =false;} 
        return answer;
    }
}