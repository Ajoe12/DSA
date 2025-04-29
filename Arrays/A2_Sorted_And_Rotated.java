import java.util.ArrayList;
import java.util.Arrays;

public class A2_Sorted_And_Rotated {
	public static Boolean checkArray(ArrayList<Integer> arr) {
		int n = arr.size();
		Boolean chkFirstDrop = false;
		for(int i=1;i<n;i++) {
			if(arr.get(i)<arr.get(i-1)) {
				if(chkFirstDrop) return false;
				chkFirstDrop=true;
			}
		}
		if(chkFirstDrop && arr.get(n-1)>arr.get(0)) return false;
		return true;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10,1,2,4));
		System.out.println(checkArray(arrayList));
		

	}

}
