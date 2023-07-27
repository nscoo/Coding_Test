import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i  = 0; i< T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int x = (N/H) + 1; //호수
            int y = N%H; // 층 
            if(N%H==0) {
                x = N/H;
                y = H;
            }
            System.out.println(y*100+x);
        }
    }
}
