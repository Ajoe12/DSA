import java.util.ArrayList;
import java.util.Arrays;

public class A1_Second_Largest_Number {
	public static int secLargest(ArrayList<Integer> arr) {
		//time = O(2N)
		int lar = arr.get(0);
		int sec = Integer.MIN_VALUE;
		for(int i : arr){
			lar = Math.max(lar,i );
		}
		for(int i:arr) {
			if(i!=lar) sec = Math.max(i, sec);
		}
		if(Integer.MIN_VALUE==sec) {
			return -1;
		}
		return sec;
	}
	
	public static int optSecLar(ArrayList<Integer> arr) {
		//time O(N)
		int lar = arr.get(0);
		int sec = Integer.MIN_VALUE;
		
		for(int i : arr) {
			if(i>lar) {
				sec=lar;
				lar = i;
			}else if(i>sec && i!=lar) {
				sec=i;
			}
		}
		if(Integer.MIN_VALUE==sec) {
			return -1;
		}
		return sec;
	}
	public static void main(String Args[]) {
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,1));
		System.out.println(secLargest(arrayList));
		System.out.println(optSecLar(arrayList));
	}
}
