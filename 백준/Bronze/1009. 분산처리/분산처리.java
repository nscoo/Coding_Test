
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[] arr = new int[in];
		for(int i=0; i<in; i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			int result = 1;
			for(int j =1; j<=b; j++) {
				result = result*a%10;
			}
			result = result==0 ? 10 : result;
			System.out.println(result);
		}
		
	}
}
