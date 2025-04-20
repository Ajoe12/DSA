import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {
	
	public static void QuickSortArr(ArrayList<Integer> arr,int low,int high) {
		int pI = low;
		int maxInd = high;
		if(low>=high) return;
		while(low<=high) {
			if(arr.get(pI)<arr.get(low) && arr.get(pI)>arr.get(high)) {
				Collections.swap(arr, high, low);
			}
			if(arr.get(pI)>=arr.get(low))
			low++;
			if(arr.get(pI)<=arr.get(high))
			high--;			
		}
		Collections.swap(arr, high, pI);
		QuickSortArr(arr, pI, high-1);
		QuickSortArr(arr, high+1,maxInd );
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,4,3,2,1));
		QuickSortArr(arr,0,arr.size()-1);
		System.out.println(arr);
		
	}

}
