import java.util.ArrayList;
import java.util.Arrays;



public class InsertionSort {

	public static void print(ArrayList<Integer> arr) {
		for (Integer integer : arr) {
			System.out.print(integer+" ");
		}
		System.out.println();
	}
	public static ArrayList<Integer> insertion(ArrayList<Integer> arr) {
		for (int i = 1; i < arr.size(); i++) {
			int curr = arr.get(i);
			int prev = i-1;
			while(prev>=0 && arr.get(prev)>curr) {
				arr.set(prev+1,arr.get(prev));
				
				prev--;
			}
			arr.set(prev+1, curr);
		}
		return arr;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,1,5,2,3));
		arr = insertion(arr);
		print(arr);
	}

}
