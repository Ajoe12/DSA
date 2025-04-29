public class A5_MoveZeoresKeepOrderOfNonZero {

	public static void print(int[] nums){
        for(int i : nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==1) return;


        int j=-1;
        int i=0;
        for(i=0;i<n;i++){
            if(nums[i]==0){
                j=i+1;
                break;
            }
        }

        if(j==-1) return;

        while(j<n){
            
            if( nums[j]!=0){
                swap(nums,i,j);
                i++;
    
            }
            j++;
        }

    }
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,4,0};
		moveZeroes(nums);
		print(nums);
	}

}
