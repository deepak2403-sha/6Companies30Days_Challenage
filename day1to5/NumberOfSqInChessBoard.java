package day1to5;

public class NumberOfSqInChessBoard {
	
	static long sol(long n) {
		if(n==1) return (long)1;
		return n*n + sol(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol(2));
	}

}
