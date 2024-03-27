package string.Assignment;

public class CotainsVowelsOrNot {
	
	public static void main(String[] args) {
		String str ="SUDARCHANAN";
		char[] arr = {'A','E','I','O','U'};
		
		for(char c: str.toCharArray()) {
			for(char vowel: arr) {
				if(c == vowel) {
					System.out.println("Vowel Found" +" - "+ vowel);
				}
			}
		}
			
		
	}

}
