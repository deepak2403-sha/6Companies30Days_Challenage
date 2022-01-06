package day1to5;

import java.util.Stack;

public class PatternWithI_n_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "D";
		System.out.println(sol(string));
	}

	private static String sol(String string) {
		// TODO Auto-generated method stub
		String ans = "";
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<=string.length(); i++) {
			st.push(i+1);
			if(i==string.length() || string.charAt(i)=='I') {
				while(!st.isEmpty()) {
					ans+=st.pop().toString();
				}
			}
		}
		return ans;
	}

}
