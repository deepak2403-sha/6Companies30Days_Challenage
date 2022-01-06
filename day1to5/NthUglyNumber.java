package day1to5;

import java.util.TreeSet;

public class NthUglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1650;
		System.out.println(ugly(n));
	}

	private static int ugly(int n) {
		// TODO Auto-generated method stub
		TreeSet<Long> set = new TreeSet<>();
		set.add(1L);
		int i = 1;
		while(i<n) {
			long temp = set.pollFirst();
			set.add(temp*2);
			set.add(temp*3);
			set.add(temp*5);
			i++;
		}
		
		return set.pollFirst().intValue();
	}

}
