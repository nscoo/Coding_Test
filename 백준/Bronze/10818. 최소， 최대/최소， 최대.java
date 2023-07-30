
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int in = sc.nextInt();
		for(int i=0; i<in; i++) {
			int tmp = sc.nextInt();
			max = tmp > max ? tmp : max;
			min = tmp < min ? tmp : min;
			
		}
		System.out.println(min + " " + max);
		
	}
}
