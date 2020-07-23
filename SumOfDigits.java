import java.util.*;
public class SumOfDigits {
	
	public static int sumOfDigits(int input) {
		if(input == 0)
			return 0;
		int sum = 0;
		sum = sum + (input % 10);
		return sum + sumOfDigits(input / 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(sumOfDigits(input));

	}

}
