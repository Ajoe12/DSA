import java.util.ArrayList;

public class A6_UnionAndIntersectionTwoSortedArray {

	public static ArrayList<Integer> union(int[] arr1,int arr2[]) {
		ArrayList<Integer> res = new ArrayList<>();
		
		int n1=arr1.length;
		int n2=arr2.length;
		
		int i=0,j=0;
		
		while(i<n1 && j<n2) {
				if(arr1[i]<=arr2[j] ) {
					if(res.size()==0 || arr1[i]!=res.get(res.size()-1)) 

						res.add(arr1[i]);
							
					
					i++;
				}
				else {
					if(res.size()==0 || arr2[j]!=res.get(res.size()-1)) 

						res.add(arr2[j]);
							
					
					j++;
				}
			
			
			
		}
		
		while(i<n1) {
			
				if(res.size()==0 || arr1[i]!=res.get(res.size()-1)) 

					res.add(arr1[i]);
						
				
				i++;
			
		}
		while(j<n2) {
			
			if(res.size()==0 || arr2[j]!=res.get(res.size()-1)) 

				res.add(arr2[j]);
					
			
			j++;
		
	}
		return res;
	}
	
	public static ArrayList<Integer> intersection(int[] a,int[] b) {
		ArrayList<Integer> res = new ArrayList<>();
		
		int na = a.length;
		int nb = b.length;
		
		int i=0,j=0;
		
		while(i<na && j<nb) {
			
			if(a[i]<b[j]) {
				i++;
			}
			else if(b[j]<a[i]) j++;
			
			else {
				
				res.add(a[i]);
				
				
				i++;
				j++;
			}
			
		}
		
		return res;
	}
	public static void main(String[] args) {
		int[] arr1 = {1,1,2,2,2,4,4,4,4,4,6,7,8,9,10};
		int[] arr2 = {2,2,4,4};

		System.out.println(union(arr1, arr2));
		System.out.println(intersection(arr1, arr2));
	}

}
