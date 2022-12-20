

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Character> st = new Stack<>();
		boolean is_tag = false;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) =='<') {
				is_tag=true;
				while(!st.isEmpty()) System.out.print(st.pop());
				System.out.print(s.charAt(i));
			}
			else if(s.charAt(i)=='>') {
				is_tag = false;
				System.out.print(s.charAt(i));
			}
			else if(is_tag) {
				System.out.print(s.charAt(i));
			}
			else if(is_tag==false && s.charAt(i)==' ') {
				while(!st.empty()) System.out.print(st.pop());
				System.out.print(' ');
			}
			else {
				st.push(s.charAt(i));
			}
		}
		while(!st.isEmpty()) System.out.print(st.pop());
		sc.close();
	}
	
}
