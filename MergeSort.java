import java.util.*;
public class MergeSort {

	public static void merge(int[] input, int sI, int eI) {
		int mid = (sI + eI)/2;
		int i = sI, j = mid + 1, k= 0;
		int output[] = new int[eI - sI + 1];
		while(i <= mid && j <= eI)
		{
			if(input[i] < input[j]) {
				output[k] = input[i];
				k++;
				i++;
			}
			else {
				output[k] = input[j];
				k++;
				j++;
			}
		}
		while(i <= mid) {
			output[k] = input[i];
			k++;
			i++;
		}
		while(j <= eI) {
			output[k] = input[j];
			k++;
			j++;
		}
		for(int index = 0; index < output.length; index++) {
			input[sI + index] = output[index];
		}
	}

	private static void mergeSort(int input[], int sI, int eI) {
		if(sI >= eI)
			return;
		int mid = (sI + eI)/2;
		mergeSort(input, sI, mid);
		mergeSort(input, mid + 1, eI);
		merge(input, sI, eI);
	}

	public static void mergeSort(int[] input) {
		mergeSort(input, 0, input.length - 1);
	}

	public static void printArray(int[] input) {
		for(int i = 0; i < input.length; i++)
			System.out.print(input[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		for(int i = 0; i < n; i++)
			input[i] = sc.nextInt();
		mergeSort(input);
		printArray(input);
	}

}
