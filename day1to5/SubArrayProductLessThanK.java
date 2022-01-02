package day1to5;

public class SubArrayProductLessThanK {

	// Navie Approach generate all subArrays and then count subarrays having product
	// less than k

	static int sol(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < k)
				count++;
			int m = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				m = m * nums[j];
				if (m < k)
					count++;
				else
					break;
			}
		}
		return count;
	}
	
	//We will use Sliding Window technique
	
	static int sol1(int[] a, int k) {
		if(k==0) return 0;
		int p =1;
		int res = 0;
		for(int i=0, j=0; j<a.length; j++) {
			p = p * a[j];
			while(i<=j && p>=k) {
				p = p / a[i++];
			}
			res = res + (j-i)+1;
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4 };
		int k = 10;
		System.out.println(sol(array,k));
		System.out.println(sol1(array, k));
	}

}
