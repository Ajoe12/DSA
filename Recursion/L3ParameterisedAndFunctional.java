
public class L3ParameterisedAndFunctional {
	public static void sumOfNParameterised(int i,int sum) {
		if(i<1) {
			System.out.println(sum);
			return;
		}
		sumOfNParameterised(i-1,sum+i);
		
	}
	
	public static int sumOfNFunctional(int n) {
		if(n<1) return 0;
		return n+sumOfNFunctional(n-1);
	}
	public static void main(String[] args) {
		sumOfNParameterised(5,0);
		System.out.println(sumOfNFunctional(5));
	}
}
