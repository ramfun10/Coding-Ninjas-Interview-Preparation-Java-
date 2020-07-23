import java.util.*;
public class PrintKeypad {
	
	private static String[] helper(int n) {
		if(n <= 1 || n > 10) {
			System.exit(0);
		}
		if(n == 2) {
			String ans[] = {"a", "b" ,"c"};
			return ans;
		}
		else if(n == 3) {
			String ans[] = {"d", "e", "f"};
			return ans;
		}
		else if(n == 4) {
			String[] ans = {"g", "h", "i"};
			return ans;
		}
		else if(n == 5) {
			String[] ans = {"j", "k", "l"};
			return ans;
		}
		else if(n == 6) {
			String[] ans = {"m", "n", "o"};
			return ans;
		}
		else if(n == 7) {
			String[] ans = {"p", "q", "r", "s"};
			return ans;
		}
		else if(n == 8) {
			String[] ans = {"t", "u", "v"};
			return ans;
		}
		else {
			String[] ans = {"w", "x", "y", "z"};
			return ans;
		}
	}
	
	public static void printKeypad(int n, String outputSoFar) {
		if(n == 0) {
			System.out.println(outputSoFar);
			return;
		}
		String[] getchars = helper(n % 10);
		for(int i = 0; i < getchars.length; i++) {
			printKeypad(n / 10, getchars[i] + outputSoFar);
		}
	}
	
	public static void printKeypad(int n) {
		printKeypad(n, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 234;
		printKeypad(n);
	}

}
