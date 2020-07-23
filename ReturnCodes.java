
public class ReturnCodes {

	private static char helper(int i) {
		return (char)('a' + i - 1);	
	}

	public static String[] getCodes(String input) {
		if(input.length() == 0) {
			String myans[] = {""};
			return myans;
		}
		int firstdigit = input.charAt(0) - '0';
		String smallAns1[] = getCodes(input.substring(1));
		String[] smallAns2 = new String[0];

		int firsttwodigits = 0;
		if(input.length() >= 2) {
			firsttwodigits = (input.charAt(0) - '0')*10 + input.charAt(1) - '0';
			if(firsttwodigits >= 10 && firsttwodigits <= 26) {
				smallAns2 = getCodes(input.substring(2));
			}
		}
		String[] myAns = new String[smallAns1.length + smallAns2.length];
		int k = 0;
		for(int i = 0; i < smallAns1.length; i++) {
			char first = helper(firstdigit);
			myAns[k] = first + smallAns1[i];
			k++;
		}
		for(int i = 0; i < smallAns2.length; i++) {
			char first = helper(firsttwodigits);
			myAns[k] = first + smallAns2[i];
			k++;
		}
		return myAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str [] = getCodes("1123");
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
