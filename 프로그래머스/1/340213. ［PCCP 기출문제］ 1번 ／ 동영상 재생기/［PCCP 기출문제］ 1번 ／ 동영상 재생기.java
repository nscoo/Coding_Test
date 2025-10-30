class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        // 시간 계산
        int video = Integer.parseInt(video_len.split(":")[0]) * 60
                 + Integer.parseInt(video_len.split(":")[1]);
        
        int current =  Integer.parseInt(pos.split(":")[0]) * 60
                 + Integer.parseInt(pos.split(":")[1]);
        
        int st = Integer.parseInt(op_start.split(":")[0]) * 60
                 + Integer.parseInt(op_start.split(":")[1]);
        
        int end = Integer.parseInt(op_end.split(":")[0]) * 60
                 + Integer.parseInt(op_end.split(":")[1]);
        
        int state =0;
        
        if (current >= st && current <= end) {
            current = end;
        }
        for (String cmd : commands) {
            if (cmd.equals("next")) {
                current = Math.min(video, current + 10);
            } else {
                current = Math.max(0, current - 10);
            }

            if (current >= st && current <= end) {
                current = end;
            }
        }
        
        if(video <= current) return video_len;
        else if(current<=end && current>=st) return op_end;
        else{
            int minutes = current / 60;
            int seconds = current % 60;
            String result = String.format("%02d:%02d", minutes, seconds);
            return result;
        }
        
        

    }
    // prev : 10초전 이동 현재위치 10초 미만일 경우 맨처음
    // next : prev 반대
    // op_start : 재생위치가 오프닝 구간인 경우 **자동으로 오프닝 끝나는 위치로**
}