package day1to5;

public class GCDstring {

	static String gcdString(String a, String b) {
		if(!(a+b).equals(b+a)) return "";
		int gcdValue = gcd(a.length(), b.length());
		return b.substring(0,gcdValue);
	}

	static int gcd(int p, int q) {
		if(q==0) return p;
		else return gcd(q,p%q) ;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ABABAB";
		String b = "ABAB";
		System.out.println(gcdString(a,b));
	}

}
