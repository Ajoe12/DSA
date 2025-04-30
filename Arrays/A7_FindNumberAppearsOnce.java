public class A7_FindNumberAppearsOnce {

	public static int findElementAppearsOnce(int arr[]) {
		int xor=0;
		for(int i : arr) {
			xor^=i;
		}
		return xor;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,3,3,4,4};
		System.out.println(findElementAppearsOnce(arr));
		
		

	}

}
