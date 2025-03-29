
public class L5Fibonaccinumber {
	public static int fibForLoop(int n) {
		int s=0,f = 1;
		for(int i=1;i<n-1;i++) {
//			System.out.println("before s: "+s+" ; f: "+f);
			int sum = s+f;
			s=f;
			f=sum;
//			System.out.println("after s: "+s+" ; f: "+f);
		}
		return f;
	}
	public static int fibRecursion(int n) {
//		if(n==1) return 1;
//		if(n==2) return 2;
//		if((n-2)<1) return 0;
		if(n<=1) return n;
		
		return fibRecursion(n-1)+fibRecursion(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fibForLoop(10));
		System.out.println(fibRecursion(5));
	}

}
