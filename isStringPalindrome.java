
public class isStringPalindrome {

	public static boolean isPalindrome(String input) {
		if(input.length() == 1) {
			return true;
		}
		if(input.length() == 2) {
			if(input.charAt(0) == input.charAt(1)) {
				return true;
			}
			else
				return false;
		}
		if(input.charAt(0) == input.charAt(input.length() - 1)) {
			return isPalindrome(input.substring(1, input.length() - 1));
		}
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abcba"));
	}

}
