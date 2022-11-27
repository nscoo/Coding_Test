
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println(ans(sc.next()));
		}
	}
	public static String ans(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=0; i<s.length(); i++ ) {
			char x = s.charAt(i);
			if(x == '(') st.push(x);
			else if(st.empty()) return "NO";
			else st.pop();
		}
		if(st.empty()) return "YES";
		else return "NO";
		
		
	}
}
