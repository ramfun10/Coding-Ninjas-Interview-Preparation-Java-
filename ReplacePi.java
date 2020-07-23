
public class ReplacePi {
	
	public static String replace(String input) {
		if(input.length() == 0)
			return input;
		String temp = replace(input.substring(1));
		if(input.charAt(0) == 'p' && temp.charAt(0) == 'i') {
			return (3.14 + temp.substring(1));
		}
		else
			return (input.charAt(0) + temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sfadsdpifbfbfsfbspisfpipipi";
		System.out.println(replace(str));

	}

}
