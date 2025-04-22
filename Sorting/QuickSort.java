import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {
	public static int func(ArrayList<Integer> arr,int low,int high) {
		int pivot = arr.get(low);
		int i=low;
		int j=high;
		while(i<j) {
			while(pivot>=arr.get(i) && i<=high-1) i++;
			while(pivot<=arr.get(j) && j>=low+1) j--;
			if(i<j) Collections.swap(arr, i, j);
		}
		Collections.swap(arr, low, j);
		return j;
	}
	public static void qs(ArrayList<Integer> arr,int low,int high) {
		if(low<high) {
			int partitionIndex = func(arr,low,high);
			qs(arr,low,partitionIndex-1);
			qs(arr, partitionIndex+1, high);
		}
	}
	//by me
//	public static void QuickSortArr(ArrayList<Integer> arr,int low,int high) {
//		int pI = low;
//		int maxInd = high;
//		if(low>=high) return;
//		while(low<=high) {
//			if(arr.get(pI)<arr.get(low) && arr.get(pI)>arr.get(high)) {
//				Collections.swap(arr, high, low);
//			}
//			if(arr.get(pI)>=arr.get(low))
//			low++;
//			if(arr.get(pI)<=arr.get(high))
//			high--;			
//		}
//		Collections.swap(arr, high, pI);
//		QuickSortArr(arr, pI, high-1);
//		QuickSortArr(arr, high+1,maxInd );
//	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,4,3,2,1));
//		QuickSortArr(arr,0,arr.size()-1);
		qs(arr, 0, arr.size()-1);
		System.out.println(arr);
		
	}

}
