
public class Charhashing {
	public static int freqCountAlphabets_aToz(char ch,String str) {
		int hash[] = new int[26];
		for(int i=0;i<str.length();i++) {
			hash[str.charAt(i)-'a']++;
		}
		
		return hash[ch-'a'];
	}
	public static int freqCountAlphabets_AToZ(char ch,String str) {
		int hash[] = new int[26];
		for(int i=0;i<str.length();i++) {
			hash[str.charAt(i)-'A']++;
		}
		
		return hash[ch-'A'];
	}
	public static int freqCountAnyChar(char ch,String str) {
		int hash[] = new int[256];
		for(int i=0;i<str.length();i++) {
			hash[str.charAt(i)]++;
		}
		
		return hash[ch];
	}
	public static void main(String args[]) {
		String str1 = "trewererreewq";
		String str2 = "AJAHSAHSAGTWTWGWGWGWGXY";
		String str3 = "trewererreewq@!##!#!**(!()((&@^*@(!*@SJVHBJKANSIUDHWUDYTQBUD";
		System.out.println(freqCountAlphabets_aToz('e',str1));
		System.out.println(freqCountAlphabets_AToZ('W',str2));
		System.out.println(freqCountAnyChar('*',str3));
		
		
	}
}
