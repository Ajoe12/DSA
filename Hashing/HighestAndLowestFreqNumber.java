import java.util.*;

public class HighestAndLowestFreqNumber {

	public static void highestFreq(int arr[]) {
		HashMap<Integer,Integer> mp = new HashMap<>();
		
		int maxVal = 0;
		for(Integer i : arr) {
			if(mp.containsKey(i)) {
				mp.put(i, mp.get(i)+1);
				maxVal=Math.max(maxVal,mp.get(i));
			}else
			mp.put(i, 0);
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		for(Map.Entry<Integer, Integer> e : mp.entrySet()) {
			if(e.getValue()==maxVal) res.add(e.getKey());
		}
		
		for(Integer i : res)
			System.out.println(i);
		
	}
	
	public static void LowestFreq(int arr[]) {
		HashMap<Integer,Integer> mp = new HashMap<>();
		
		for(Integer i : arr) {
			if(mp.containsKey(i)) {
				mp.put(i, mp.get(i)+1);
			}else
			mp.put(i, 0);
		}
		
		
//		int minVal = Integer.MAX_VALUE;
//		for(Map.Entry<Integer, Integer> e : mp.entrySet()) {
//			System.out.println("key : "+e.getKey()+" ; value: "+e.getValue());
//			minVal = Math.min(minVal,e.getValue());
//		}
		
		ArrayList<Integer> res = new ArrayList<>();
		for(Map.Entry<Integer, Integer> e : mp.entrySet()) {
			if(e.getValue()==0) res.add(e.getKey());
		}
		
		for(Integer i : res)
			System.out.println(i);
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,1,2,34,5,2,6,1,3,56,12,56};
		highestFreq(arr);
		LowestFreq(arr);

	}

}
