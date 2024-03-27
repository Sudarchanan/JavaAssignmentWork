package stringbuffers;

public class QuizAnagram {
	 static boolean checkAnagram(int[] arr1, int[] arr2){
		
		if (arr1.length != arr2.length) {
			System.out.println("Not Anagram");
	        return false;
	    }
		
		for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i] != arr2[i]) {
            	System.out.println("Not Anagram");
                return false;
            }
        }
		
		System.out.println("Anagram");
		return true;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "poly";
		String two = "olap";
		
		int i = one.length();
		int j = two.length();
		
		int[] one1 = new int[i];
		int[] two2 = new int[j];
		
		
		for(int k = 0; k<one.length(); k++) {
			one1[k] = one.charAt(k) - 'a';
            two2[k] = two.charAt(k) - 'a';
		}
		
		SortAnagram sort = new SortAnagram();
		sort.SortAnagrams(one1);
		sort.SortAnagrams(two2);
		
		checkAnagram(one1, two2);
	
		
	}

}
