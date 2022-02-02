package day1to5;

public class MissingAndPositiveNumber {
	
	static int[] sol(int[] arr, int n) {
		int missing=-1, repeat=-1;
		for (int i = 0; i < arr.length; i++) {
			int abs_value = Math.abs(arr[i])-1;
			if(arr[abs_value]>0) {
				arr[abs_value] = -arr[abs_value];
			}
			else {
				repeat = abs_value+1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
				missing = i+1;
			}
		}
		return new int[] {missing,repeat};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,3,5,6};
		int[] res = sol(arr, arr.length);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}

	}

}
