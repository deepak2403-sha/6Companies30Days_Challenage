package day1to5;

public class DecodeMessage {
	
	static int sol(char[] arr, int n) {
		if(n==0 || n==1) return 1;
		if(arr[0] == '0') return 0;
		int count = 0;
		if(arr[n-1] > '0') {
			count+=sol(arr,n-1);
		}
		if(arr[n-2]=='1' || arr[n-2]=='2' && arr[n-1]<'7') {
			count+=sol(arr, n-2);
		}
		return count;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = { '1', '2', '3', '4' };
		System.out.println(sol(arr,3));
	}

}
