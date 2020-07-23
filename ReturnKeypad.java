import java.util.*;
public class ReturnKeypad {
	
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
	
	public static String[] returnKeypad(int n) {
		if(n == 0) {
			String[] ans = {""};
			return ans;
		}
		String smallAns[] = returnKeypad(n/10);
		String[] getchars = keypad(n%10);
		String[] ans = new String[smallAns.length * getchars.length];
		int k = 0;
		for(int i = 0; i < smallAns.length; i++) {
			for(int j = 0; j < getchars.length; j++) {
				ans[k] = smallAns[i] + getchars[j];
				k++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 234;
		String ans[] = returnKeypad(n);
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
