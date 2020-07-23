import java.util.*;
public class GeometricSum {
	
	public static double geometricSum(int k) {
		double sum = 0;
		if( k == 0 )
			return 1;
		if( k > 0 ) {
			double power = Math.pow(2, k);
			sum = sum + (double)(1 / power);
		}
		return sum + geometricSum(k - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println(geometricSum(k));
	}

}
