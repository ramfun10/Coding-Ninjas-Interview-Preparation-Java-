import java.util.*;
public class ReplaceCharacter {
	
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length() == 0)
			return input;
		String myans = "";
		if(input.charAt(0) == c1)
			myans = myans + c2;
		else
			myans = myans + input.charAt(0);
		String smallAns = replaceCharacter(input.substring(1), c1, c2);
		return myans + smallAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char c1 = sc.next().charAt(0);
		char c2 = sc.next().charAt(0);
		System.out.println(replaceCharacter(input, c1, c2));
		
	}

}
