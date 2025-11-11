import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int walletMax = Math.max(wallet[0],wallet[1]);
        int walletMin = Math.min(wallet[0],wallet[1]);
        int biilMax = Math.max(bill[0],bill[1]);
        int billMin = Math.min(bill[0],bill[1]);
        
        while(billMin>walletMin || biilMax>walletMax){
            if(bill[0] > bill[1]) bill[0]/=2;
            else bill[1]/=2;
            biilMax = Math.max(bill[0],bill[1]);
            billMin = Math.min(bill[0],bill[1]);
            answer++;
        }
        System.out.print("max = " + biilMax + "min = " + billMin);
        return answer;
    }
}

