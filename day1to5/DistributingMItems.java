package day1to5;

public class DistributingMItems {
	
	static int sol(int m, int n, int k) {
		if(m < n-k+1) {
			return m+k-1;
		}
		m = m-(n-k+1);
		return (m%n==0)?n:m%n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol(8,5,2));
	}

}
