import java.util.*;
public class Count {
	
	public static int count(int n) {
		if(n == 0)
			return 0;
		int ans = count(n/10);
		return ans+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(count(n));
	}

}
