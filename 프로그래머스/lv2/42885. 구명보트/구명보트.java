import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int lt=0, rt = people.length-1;
        Arrays.sort(people);
        while(lt<=rt){
            answer++;
            if(people[lt] + people[rt] <= limit){
                lt++;
            }
            rt--;
        }
       
        return answer;
    }
    }
