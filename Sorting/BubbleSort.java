import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
	public static void printArr(ArrayList<Integer> arr) {
		for(Integer i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr){
		int n = arr.size();
		
		for(int i=0;i<n-1;i++) {
			boolean isSwap = false;
			for(int j=0;j<n-i-1;j++) {
				if(arr.get(j)>arr.get(j+1)) {
					Collections.swap(arr, j, j+1);
					isSwap = true;
				}
			}
			if(!isSwap) break;
		}
		
		return arr;
	}
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,1,5,2,3));
		arr = bubbleSort(arr);
		printArr(arr);
		
	}
}
