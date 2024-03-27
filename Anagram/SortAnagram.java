package stringbuffers;

public class SortAnagram {
	
	public int[] SortAnagrams(int[] arr){
		int temp = 0;
		int t = arr.length;
		for(int m = 0; m < t; m++){
			for(int n = 0; n<t; n++) {
				if(arr[m] < arr[n]) {
					temp = arr[m];	
					arr[m] = arr[n];
					arr[n] = temp;			
				}
			}
		}
		return arr;
		
	}
	

}
