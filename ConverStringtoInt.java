
public class ConverStringtoInt {
	
	public static int convertStringtoInt(String input) {
		if(input.length() == 0)
			return 0;
		int a = convertStringtoInt(input.substring(1));
		int b = input.charAt(0) - '0';
		int power = (int)Math.pow(10, input.length() - 1);
		int ans =  b * power + a;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234";
		System.out.println(convertStringtoInt(s));
	}

}
