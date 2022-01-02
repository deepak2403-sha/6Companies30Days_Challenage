package day1to5;

public class RunLengthEncoding {
	
	public static String printRLE(String s) {
		StringBuilder sb = new StringBuilder("");
		int cnt = 1;
		char[] word = s.toCharArray();
		sb.append(word[0]);
		for(int i=1; i<word.length; i++) {
			if(word[i] == word[i-1]) {
				cnt++;
			}else {
				sb.append(cnt);
				cnt = 1;
				sb.append(word[i]);
			}
		}
		sb.append(cnt);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "wwwwaaadexxxxxxywww";
        System.out.println(printRLE(str));
	}

}
