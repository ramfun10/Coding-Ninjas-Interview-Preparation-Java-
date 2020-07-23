import java.util.*;
public class AllIndices {

	private static int[] allIndices(int[] input, int x, int startIndex) {
		if(startIndex == input.length) {
			int ans[] = new int[0];
			return ans;
		}
		int[] smallIndex = allIndices(input, x, startIndex + 1);

		if(input[startIndex] == x) {
			int myans[] = new int[smallIndex.length + 1];
			myans[0] = startIndex;
			for(int i = 0; i < smallIndex.length; i++) {
				myans[i + 1] = smallIndex[i];
			}
			return myans;
		}
		else {
			return smallIndex;
		}
	}
	
	public static int[] allIndices(int[] input, int x) {
		return allIndices(input, x, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		int[] output = allIndices(arr, x);
		for(int i = 0; i < output.length; i++)
			System.out.print(output[i] + " ");
	}

}
