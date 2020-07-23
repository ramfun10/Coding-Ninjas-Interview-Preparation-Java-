import java.util.*;
public class MultiplyTwoIntegers {
	
	public static int multiplyTwoIntegers(int m , int n) {
		int sum = 0;
		if(n == 0 )
			return 0;
		if(n > 0) {
			sum = sum + m;
		}
		return sum + multiplyTwoIntegers(m, n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
	}

}
