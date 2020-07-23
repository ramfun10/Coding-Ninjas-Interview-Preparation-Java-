import java.util.*;
public class CheckNumber {

	public static boolean checkNumber(int input[], int x) {
		int len = input.length;
		if(len == 0)
			return false;
		if(input[0] == x)
			return true;
		int[] arr = new int[len - 1];
		for(int i = 1; i < len; i++) {
			arr[i - 1] = input[i];
		}
		boolean ans = checkNumber(arr, x);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(checkNumber(arr, x));
	}

}
