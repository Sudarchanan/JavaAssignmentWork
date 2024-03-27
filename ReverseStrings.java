package string.Assignment;

public class ReverseStrings {

	public static void main(String[] args) {
		String str = "Hello";
	    char[] str1 = str.toCharArray();
	    int len = str1.length;
	    char[] res = new char[len];
	    
	    System.out.println(len);
	    int index = 0;
	    
	    for (int j = len - 1; j >= 0; j--) {
	            res[index++] = str1[j];
	    }
	    String reversed = new String(res);
	    System.out.println(reversed);
	}
}
