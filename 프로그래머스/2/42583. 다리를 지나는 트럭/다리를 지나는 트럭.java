import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        int idx = 0;
        int bridge_weight = 0;
        for(int i=0; i<bridge_length; i++){
          bridge.add(0);  
        } 
        
        while(idx<truck_weights.length || bridge_weight>0){
            bridge_weight -= bridge.poll();
            
            if(idx < truck_weights.length){
                if(bridge_weight + truck_weights[idx] <= weight){
                
                bridge.add(truck_weights[idx]);
                bridge_weight += truck_weights[idx];
                idx++;    
                }else{
                    bridge.add(0);
                }
                
            }else{
                bridge.add(0);
            }
            answer++;
        }
        return answer;
    }
}