import java.util.*;
public class QuickSort {
	
	private static void quickSort(int[] input, int sI, int eI) {
		if(sI >= eI)
			return;
		int pivotpos = partition(input, sI, eI);
		quickSort(input, sI, pivotpos - 1);
		quickSort(input, pivotpos + 1, eI);
	}
	
	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length - 1);
	}
	
	public static int partition(int[] input, int sI, int eI) {
		int pivot = input[sI];
		int count = 0;
		for(int i = sI + 1; i <= eI; i++) {
			if(input[i] <= pivot )
				count++;
		}
		//finding pivot position.
		int pivotpos = sI + count;
		//placing pivot in the pivot position.
		input[sI] = input[sI + count];
		input[sI + count] = pivot;
		int i = sI, j = eI;
		//ensuring that all the elements to the left of pivot is less than pivot and
		//all the elements to the right of pivot is greater than pivot.
		while(i < pivotpos && j > pivotpos) {
			if(input[i] < pivot) {
				i++;
			}
			else {
				if(input[j] > pivot) {
					j--;
				}
				else {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					i++;
					j--;
				}
			}
		}
		return pivotpos;
	}
	
	public static void printArray(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++)
			input[i] = sc.nextInt();
		quickSort(input);
		printArray(input);
	}

}
