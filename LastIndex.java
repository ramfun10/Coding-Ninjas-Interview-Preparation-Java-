import java.util.*;
public class LastIndex {
	
	private static int lastIndex(int[] input, int x, int endIndex) {
		if(endIndex == -1)
			return -1;
		if(input[endIndex] == x)
			return endIndex;
		int ans = lastIndex(input, x, endIndex - 1);
		return ans;
	}
	
	public static int lastIndex(int[] input, int x) {
		return lastIndex(input, x, input.length - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(lastIndex(arr, x));
	}

}
