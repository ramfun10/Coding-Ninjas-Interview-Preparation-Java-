import java.util.*;
public class FirstIndex {
	
	private static int firstIndex(int[] input, int x, int startIndex) {
		if(startIndex >= input.length)
			return -1;
		if(input[startIndex] == x)
			return startIndex;
		int ans = firstIndex(input, x, startIndex + 1);
		return ans;
	}
	
	public static int firstIndex(int[] input, int x) {
		return firstIndex(input, x, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(firstIndex(arr, x));
	}

}
