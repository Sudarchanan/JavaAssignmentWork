package numberClass;

public class Number {
	
	static Boolean checkPrime(int x) {
		
		if(x <= 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if(x % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	static Boolean checkAmstrong(int x) {
		int n = 0 , new_num =0,remainder =0, og_num = x;
		while(og_num !=0) {
			og_num /= 10;
			n++;
		}
		while(og_num !=0) {
			remainder = og_num %10 ;
			new_num += (int) Math.pow(remainder, n);
			og_num /= 10;
		}
		
		if(og_num == new_num) {
			return true;
		}else {
			return false;
		}
	}
	static Boolean checkPalindrome(int x) {
		int new_num =0;
		int og_num = x;
		while(og_num != 0) {
			int digit = og_num%10;
			
			new_num = new_num *10 + digit;
			
			og_num /= 10;
		}

		return new_num == x;

		
	}
	
	public static void main(String[] args) {
		
		System.out.println("isPrime : "+checkPrime(77));
		
		System.out.println("isAmstrong : "+checkAmstrong(153));
		
		System.out.println("isPalindrome : "+checkPalindrome(10101));
		
	}

}
