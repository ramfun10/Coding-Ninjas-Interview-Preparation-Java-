import java.util.*;
public class Power {
	
	public static int power(int x, int n) {
		if(n == 0)
			return 1;
		int c = (int) Math.pow(x, n -1);
		return c * x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(x, n));
	}

}
