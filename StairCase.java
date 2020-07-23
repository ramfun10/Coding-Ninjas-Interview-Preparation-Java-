
public class StairCase {

	public static int staircase(int n) {
		if(n <= 1)
			return 1;
		else if(n == 2)
			return 2;
		else {
			return staircase(n - 3) + staircase(n - 2)+ staircase(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(staircase(n));
	}

}
