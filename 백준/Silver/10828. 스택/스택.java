import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
// 10828번
public class Main {
    public static int stack[]; // 스택 배열
    public static int ptr=0; // 스택 포인트

    public static void main(String[] args)throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int command = Integer.parseInt(rd.readLine());

        stack = new int[command];

        for(int i=0;i<command;i++) {
            st = new StringTokenizer(rd.readLine(), " ");
            switch(st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    // 입력
    public static void push(int x) {
        stack[ptr] = x;
        ++ptr;
    }
    // 출력
    public static int pop() {
        if(ptr==0) {
            return -1;
        }else {
            int res = stack[ptr-1];
            ptr--;
            return res;
        }
    }
    // 사이즈 확인
    public static int size() {
        return ptr;
    }
    // 빈값 확인
    public static int empty() {
        if(ptr==0) {
            return 1;
        }else {
            return 0;
        }
    }
    // 최상단 값 확인
    public static int top() {
        if(ptr==0) {
            return -1;
        }else {
            return stack[ptr-1];
        }
    }
}
