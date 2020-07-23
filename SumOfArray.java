import java.util.*;
public class SumOfArray {
	
	public static int sumOfArray(int input[]) {
		int len = input.length;
		if(len == 1)
			return input[len - 1];
		int sum = 0;
		int arr[] = new int[len - 1];
		for(int i = 1; i < len; i++) {
			arr[i-1] = input[i];
			sum = sum + arr[i-1];
		}
		return input[0] + sumOfArray(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sumOfArray(arr));
	}

}
