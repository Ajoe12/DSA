import java.util.*;

public class B4_Product_Array_Except_Self {

	public static int[] OptimalproductExceptSelf(int[] arr) {
		int[] res = new int[arr.length];
		
		//store prefix of each index at its correct index
		//0 index wont have a prefix ie res(0) = 1
		res[0]=1;
		for(int i=1;i<arr.length;i++) {
			res[i]=res[i-1]*arr[i-1];
		}
		
		int postfix = 1;
		for(int i=arr.length-1;i>=0;i--) {
			res[i]*=postfix;
			postfix*=arr[i];
		}
		return res;
	}
	
	public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        if(n==1) return nums;

        int[] pref = nums.clone();
        int[] suf = nums.clone();
        int[] res = new int[n];
        
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]*nums[i];
           
        }
        for(int i=n-2;i>0;i--){
            suf[i]=suf[i+1]*nums[i];
        }
        for(int i=0;i<n;i++){
            if(i==0){
                res[i]=suf[i+1];
            }
            else if(i==n-1){
                res[i]= pref[i-1];
            }else
            res[i]=pref[i-1]*suf[i+1];
        }

        return res;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] res = productExceptSelf(nums);
		for(int i : res) {
			System.out.print(i+" ");
		}
	}

}
