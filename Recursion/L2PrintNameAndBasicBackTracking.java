
public class L2PrintNameAndBasicBackTracking {
	public static void printName(int i,int n) {
		if(i==n) return;
		
		System.out.println("Ajoe");
		printName(i+1,n);
	}
	public static void print1ton(int i,int n) {
		if(i>n) return;
		
		System.out.println(i);
		print1ton(i+1,n);
	}
	
	public static void printnto1(int i,int n) {
		if(i<1) return;
		
		System.out.println(i);
		printnto1(i-1,n);
	}
	
	public static void print1tonBacktrack(int i,int n) {
		if(i<1) return;
		print1tonBacktrack(i-1,n);
		System.out.println(i);
	}
	
	public static void printnto1Backtrack(int i,int n) {
		if(i>5) return;
		printnto1Backtrack(i+1,n);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		System.out.println("print name 5 times by recursion");
		printName(0,5);
		
		System.out.println("print 1 to 5 by recursion");
		print1ton(1,5);
		
		System.out.println("print 5 to 1 by recursion");
		printnto1(5,5);
		
		System.out.println("print 1 to 5 by backtracking without using f(i+1)");
		print1tonBacktrack(5,5);
		
		System.out.println("print 5 to 1 by backtracking without using f(i-1)");
		printnto1Backtrack(1,5);
	}
}
