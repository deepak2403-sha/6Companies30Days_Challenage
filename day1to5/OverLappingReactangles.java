package day1to5;

public class OverLappingReactangles {
	static class point {
		int x, y;
	}

	static boolean check(point l1, point r1, point l2, point r2) {
		// opposite can't overlap
		if (l1.x == r1.x || l1.y == r1.y || l2.x == r2.x || l2.y == r2.y)
			return false;
		if (l1.x >= r2.x || l2.x >= r1.x)
			return false;
		if (r1.y >= l1.y || r2.y >= l2.y)
			return false;
		return true;
	}
	
    static int doOverlap(int l1[], int r1[], int l2[], int r2[]) {
        // code here
        	if (l1[0] == r1[0] || l1[1] == r1[1] || l2[0] == r2[0] || l2[1] == r2[1])
			return 0;
	    	if (l1[0] >= r2[0] || l2[0] >= r1[0])
			return 0;
		    if (r1[1] >= l2[1] || r2[1] >= l1[1])
			return 0;
		    return 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		point l1 = new point(), r1 = new point(), l2 = new point(), r2 = new point();
//		l1.x = 0;
//		l1.y = 10;
//		r1.x = 10;
//		r1.y = 0;
//		l2.x = 5;
//		l2.y = 5;
//		r2.x = 15;
//		r2.y = 0;
		int[] l1 ={-1,0} , r1={1,1} , l2={0,-1} , r2={0,1};
		System.out.println(doOverlap(l1, r1, l2, r2));
	}

}
