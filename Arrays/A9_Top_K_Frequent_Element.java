import java.util.*;

public class A9_Top_K_Frequent_Element {
	
	public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        ArrayList<int[]> arr = new ArrayList<>();
         
        for (Map.Entry<Integer, Integer> e : mp.entrySet()){
            arr.add(new int[]{e.getValue(),e.getKey()});
        }

        arr.sort((a,b)->b[0]-a[0]);

        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = arr.get(i)[1];
        }
        return res;
    }
	
	public static void main(String[] args) {
		int[] sol = topKFrequent(new int[]{1,2,1,1,3,3,2,2,1},2);
		for(int i : sol) {
			System.out.print(i+" ");
		}
	}

}
