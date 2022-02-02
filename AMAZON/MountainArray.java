package AMAZON;

public class MountainArray {
	
	static int sol(int[] arr) {
		int n = arr.length;
		int res = 0;
		for (int i = 1; i < arr.length; i++) {
			int count = 1;
			int j = i;
			boolean flag = false;
			while(j<n && arr[j]>arr[j-1]) {
				j++;
				count++;
			}
			while(j!=i && j<n && arr[j]<arr[j-1]) {
				j++;
				count++;
				flag = true;
			}
			if(i!=j && flag && count>2) {
				res = Math.max(res, count);
				j--;
			}
			i=j;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,4,7,3,2,5};
		System.out.println(sol(arr));
	}

}
