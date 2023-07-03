import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = -1;
        int y = -1; //공원 최종위치
        int h = park.length; // 공원 y축
        int w = park[0].length(); // 공원 x축
        
        //공원에서 S점찾기
        for(int i=0; i<park.length; i++){
            if(park[i].indexOf('S')!= -1){
                x = park[i].indexOf('S');
                y = i;
                break;
            }
        }
        for(int i=0; i<routes.length; i++){
            String[] temp = routes[i].split(" ");
            String v = temp[0];
            int d = Integer.parseInt(temp[1]);
            int currentX = x;
            int currentY = y;
            
            if(v.equals("E")){
                boolean flag = true;
                for(int j =1; j<=d; j++){
                    currentX++;
                    if(currentX>=w){
                        flag = false;
                        break;
                    }
                    else if(park[currentY].charAt(currentX)=='X'){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    x = currentX;
                }
            }
            else if(v.equals("W")){
                boolean flag = true;
                for(int j =1; j<=d;j++){
                    currentX--;
                    if(currentX<0){
                        flag =false;
                        break;
                    }
                    else if(park[currentY].charAt(currentX)=='X'){
                        flag = false;
                        break;
                    }
                }
                if(flag) x= currentX;
            }
            else if(v.equals("S")){
                boolean flag = true;
                for(int j =1; j<=d; j++){
                    currentY++;
                    if(currentY >= h){
                        flag= false;
                        break;
                    }
                    else if(park[currentY].charAt(currentX)=='X'){
                        flag = false;
                        break;
                    }
                }
                if(flag) y=currentY;
            }
            else if(v.equals("N")){
                boolean flag = true;
                for(int j=1; j<=d; j++){
                    currentY--;
                    if(currentY<0){
                        flag = false;
                        break;
                    }
                    else if(park[currentY].charAt(currentX)=='X'){
                        flag=false;
                        break;
                    }
                }
                if(flag) y=currentY;
            }
        }
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}