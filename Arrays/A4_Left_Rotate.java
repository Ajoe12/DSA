import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A4_Left_Rotate {

	public static void reverse(ArrayList<Integer> arr,int i,int j) {
		while(i<j) {
			Collections.swap(arr, i, j);
			i++;
			j--;
		}
		
	}
	public static void leftRotateArray(ArrayList<Integer> arr,int k) {
		int n = arr.size();
		k%=n;
		reverse(arr, 0, n-1);
		reverse(arr, 0, n-1-k);
		reverse(arr, n-k, n-1);
	}
	public static void rightRotateArray(ArrayList<Integer> arr,int k) {
		int n = arr.size();
		k%=n;
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
	}
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
//		leftRotateArray(arrayList, 3);
//		System.out.println(arrayList);
		rightRotateArray(arrayList, 3);
		System.out.println(arrayList);

	}

}
