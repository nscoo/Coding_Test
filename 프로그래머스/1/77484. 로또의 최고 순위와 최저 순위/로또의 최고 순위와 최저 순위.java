import java.util.*;
class Solution {
    public int findScore(int score){
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1,6);
        hm.put(2,5);
        hm.put(3,4);
        hm.put(4,3);
        hm.put(5,2);
        for(int i : hm.keySet()){
            if(hm.get(i)==score)
                return i;
        }
        return 6;
    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int lottoPointer =0;
        int winPointer =0;
        int zeroCount = 0;
        int goalCount = 0;
        // 로또번호, 당첨번호 정렬
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
//  0  0  1  25  31  44 
//  1  6 10  19. 31. 45       
        while(lottoPointer < lottos.length && winPointer < win_nums.length){
            if(lottos[lottoPointer] == 0) {
                zeroCount++;
                lottoPointer++;
            }
            else if(lottos[lottoPointer] != win_nums[winPointer]){
                if(lottos[lottoPointer]> win_nums[winPointer]){
                    winPointer++;
                }else{
                    lottoPointer++;
                }
            }else{
                goalCount++;
                lottoPointer++;
                winPointer++;
            }
        }
        answer[0] = findScore(goalCount +zeroCount);
        answer[1] = findScore(goalCount);
        return answer;
    }
}
// 정렬 후 투포인터로 비교
// 0일 경우는 카운트 후 로또 번호 한 칸 이동
// 맞은 갯수 + 로또 번호로 다 맞을 경우 맞은 갯수만 가져가서 배열에 만들기


