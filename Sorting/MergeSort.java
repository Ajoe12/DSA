import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

	public static void merge(ArrayList<Integer> arr,int low,int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid+1;
		while(left<=mid && right<=high) {
			if(arr.get(left)<=arr.get(right)) {
				temp.add(arr.get(left));
				left++;
			}
			else {
				temp.add(arr.get(right));
				right++;
			}
		}
		while(left<=mid) {
			temp.add(arr.get(left));
			left++;
		}
		while(right<=high) {
			temp.add(arr.get(right));
			right++;
		}
		
		for(int i=low;i<=high;i++) {
			arr.set(i, temp.get(i-low));
		}
	}
	public static void mergeSort(ArrayList<Integer> arr,int low,int high) {
		if(low>=high) return;
		int mid = (low+high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1,high);
		merge(arr, low,mid, high);
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5
				));
		mergeSort(arr, 0, arr.size()-1);
		System.out.println(arr);
	}

}
