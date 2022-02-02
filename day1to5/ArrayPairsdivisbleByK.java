package day1to5;

public class ArrayPairsdivisbleByK {
	
	static boolean sol(int[] arr, int k) {
		int[] rem = new int[k];
		for (int i = 0; i < arr.length; i++) {
			rem[arr[i]%k]++;
		}
		if(rem[0]%2==1) return false;
		int i=1, j=k-1;
		while(i<j) {
			if(rem[i]!=rem[j]) return false;
			i++;
			j--;
		}
		if(rem[k/2]%2==1) return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,3};
		int k = 6;
		System.out.println(sol(arr, k));
	}

}
