
public class MinimumCount {

	public static int minCount(int n) {
		if(n == 1)
			return 1;
		if(n == 0)
			return 0;
		int res = n;
		for(int i = 1; i <= n; i++) {
			if(i*i > n)
				break;
			res = Math.min(res, minCount(n - i * i));
		}
		return 1 + res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 17;
		System.out.println(minCount(n));
	}

}
