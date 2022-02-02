package AMAZON;

import java.util.Arrays;

public class BuyAndSellKTrans {
	
	static int buyAndSellK(int[] arr, int k) {
		int[][][] dp = new int[arr.length][2][k];
		for(int[][] arr1 : dp) {
			for(int[] a : arr1) {
				Arrays.fill(a, -1);
			}
		}
		return sol(arr,0,1,0,dp,k);
	}
	
	static int sol(int[] arr, int curr, int buy, int k, int[][][] dp, int total) {
		if(k==total || curr == arr.length) return 0;
		if(dp[curr][buy][k]!=-1) return dp[curr][buy][k];
		if(buy==1) {
			int c1 = sol(arr,curr+1,0,k,dp,total)-arr[curr];
			int c2 = sol(arr,curr+1,buy,k,dp,total);
			return dp[curr][buy][k] =Math.max(c1,c2);
		}else {
			int c1 = sol(arr,curr+1,1,k+1,dp,total)+arr[curr];
			int c2 = sol(arr,curr+1,buy,k,dp,total);
			return dp[curr][buy][k] =Math.max(c1,c2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 22, 5, 75, 65, 80};
		System.out.println(buyAndSellK(arr, 2));
	}

}
