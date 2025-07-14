import java.util.*;

public class B3_Longest_Consecutive_squence {

	public static int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();

        for(int i:nums){
            st.add(i);
        }

        int res = 0;
        //might contain duplicate value
        //loop through set only
        for(int i : st){
            int tmpLong = 1;
            if(!st.contains(i-1)){
                while(st.contains(i+tmpLong)){
                    tmpLong++;
                }
            }
            res = Math.max(res,tmpLong);
        }
        return res;
    }
	
	public static void main(String[] args) {
		int[] arr = {100,4,200,1,3,2};
		
		System.out.println(longestConsecutive(arr));


	}

}
