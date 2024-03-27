package string.Assignment;

public class ContainsIntegerOrNot {
	
	public static void main(String[] args) {
	
	String input = "abc123";
	char[] arr = {'1','2','3','4','5','6','7','8','9','0'};
    boolean containsIntegers = false;
    
    for (char c : input.toCharArray()){
    	for(char num:arr) {
    		if(c == num) {
    			containsIntegers = true;
                break;
    		}
    	}

    }
    System.out.println("Contains integers: " + containsIntegers);
    
}
	
}

	
	

