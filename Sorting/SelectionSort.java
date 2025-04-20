import java.util.*;

public class SelectionSort {
	public static void print(ArrayList<Integer> arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static ArrayList<Integer> selection(ArrayList<Integer> arr){
		int n = arr.size();
		for(int i=0;i<n-1;i++) {
			int smallestIndex = i;
			for(int j=i+1;j<n;j++) {
				if(arr.get(smallestIndex)>arr.get(j)) {
					smallestIndex = j;
				}
			}
			Collections.swap(arr, i, smallestIndex);
		}
		return arr;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,4,3,2,1));
		arr = selection(arr);
		print(arr);
	}

}
