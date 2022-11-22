

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		int n = sc.nextInt();
		int sum =0;
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			if(m>0) {
				st.push(m);
			}else st.pop();
			
		}
		for(int x : st) sum+=x;
		System.out.println(sum);
		sc.close();
	}
	
}
