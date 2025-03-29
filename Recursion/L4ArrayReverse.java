
public class L4ArrayReverse {
	public static void printArr(int arr[]) {
		for(int i: arr) {
			System.out.print(i);
		}
		System.out.println();
	}
	public static int[] swapArr(int l,int r,int arr[]) {
//		System.out.println("left: "+l+"; right: "+r);
		int temp;
		temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		return arr;
	}
	public static void reverseTwoPointer(int l,int r, int arr[]) {
		if(l>=r) {
			printArr(arr);
			return;
		}
		arr = swapArr(l,r,arr);
		reverseTwoPointer(l+1,r-1,arr);
		
	}
	
	public static void reverseOnePointer(int n,int arr[]) {
		if(n>=arr.length/2) {
			printArr(arr);
			return;
		}
		swapArr(n,arr.length-n-1,arr);
		reverseOnePointer(n+1,arr);
	}
	public static void main(String[] Args) {
		int arr[] = new int[4];
		arr = new int[]{1,2,3,4};
		
		printArr(arr);
		
		reverseTwoPointer(0,3,arr);
		reverseOnePointer(0,arr);
	}
}









