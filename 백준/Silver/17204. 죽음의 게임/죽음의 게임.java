import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 참여자 수
        int k = sc.nextInt(); //보성 번호
        int[] arr = new int[n];
        boolean flag = false;
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt(); //지목하는 사람의 번호
        int start = 0, ans = 0;
        while(true){
            if(arr[start] == k ){  //다음 차례가 보성이 인경우
                ans++;
                break;
            }
            if(visited[arr[start]]){   // 보성이가 아닌경우 또는 무한루프인경우
                flag=true;
                break;
            }else{
                start = arr[start];
                visited[start] = true;
                ans++;
            }
        }
        if(flag) System.out.println(-1);
        else System.out.println(ans);
    }
}
