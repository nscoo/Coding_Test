
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> qu = new LinkedList<>();
		
		for(int i= 1; i<=n; i++) qu.add(i);
		
		while(qu.size()!=1) {
			qu.remove();
			int tmp = qu.poll();
			qu.add(tmp);
		}
		System.out.println(qu.poll());
	}
	
}
