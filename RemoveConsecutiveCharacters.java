import java.util.*;
public class RemoveConsecutiveCharacters {
	
	public static String removeConsecutiveCharacters(String s) {
		if(s.length() <= 1)
			return s;
		String myans = "";
		String smallAns = removeConsecutiveCharacters(s.substring(1));
		if(s.charAt(0) == smallAns.charAt(0))
			return smallAns;
		else
			myans = myans + s.charAt(0);
		return myans + smallAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(removeConsecutiveCharacters(s));

	}

}
