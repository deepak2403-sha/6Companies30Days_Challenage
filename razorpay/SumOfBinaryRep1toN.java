package razorpay;

public class SumOfBinaryRep1toN {
	static final int MOD = 1000000007;
	
	static int sol(int n) {
		int ans = 0;
		int one = 1;
		while(true) {
			if(n<=1) {
				ans = (ans+n)%MOD;
				break;
			}
			int k = (int)(Math.log(n)/Math.log(2));
			int curr = 0;
			int add = (int)(Math.pow(2, k-1));
			for(int i=1; i<=k; i++) {
				curr = (curr + add)%MOD;
				add = (add * 10%MOD);
			}
			ans = (ans + curr)%MOD;
			int rem = n - (int)(Math.pow(2, k))+1;
			int p = (int)(Math.pow(10, k));
			p = (p*(rem%MOD))%MOD;
			ans = (ans+p)%MOD;
			n = rem -1;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol(3));
	}

}
