
public class L4Palindrome {
	public static boolean palindromeCheck(int i,String str) {
		if(i>str.length()/2) return true;
		if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
			System.out.println("0: "+str.charAt(0)+"; reverse index : "+str.charAt(str.length()-i-1)+"; str: "+str);
			return false;
		}
		
		return palindromeCheck(i+1,str);
		
	}
	public static void main(String[] args) {
		System.out.println(palindromeCheck(0,"madame"));
	}
}
