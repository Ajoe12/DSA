public class A3_Remove_Dup_Sorted_Array {

	public static int removeArray(int nums[]) {
		int n = nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
	}
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,2,3,3};
		System.out.println(removeArray(nums));
		for(int i:nums) {
			System.out.print(i+" ");	
		}
		

	}

}
