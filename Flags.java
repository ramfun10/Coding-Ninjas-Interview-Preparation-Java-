
public class Flags {
	//static long ans;
	public static long find_ways(int N, char prev, char prev_prev) {

		if(N == 1) {
			long ans = 1;
			return ans;
		}
		long ans = 0;
		long count = 0;
		if(prev_prev == 'S') {
			long count1 = find_ways(N - 1, 'W', 'B');
			long count2 = find_ways(N - 1, 'R', 'B');
			return ans + count1 + count2;
		}
		if(prev == 'B' && prev_prev == 'W') {
			count = count + find_ways(N - 1, 'R', 'B');
			return ans + count;
		}
		else if(prev == 'B' && prev_prev == 'R') {
			count = count + find_ways(N - 1, 'W', 'B');
			return ans + count;
		}
		else if(prev == 'W') {
			long count1 = find_ways(N - 1, 'B', 'W') ;
			long count2 = find_ways(N - 1, 'R', 'W');
			return ans + count1 + count2;
		}
		//else if(prev == 'R') {
			long count1 = find_ways(N - 1, 'W', 'R') ;
			long count2 = find_ways(N - 1, 'B', 'R');
			return ans + count1 + count2;
		//}
		
	}

	public static long find_Ways(int N) {
		return find_ways(N, 'B', 'S');
		//return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(find_Ways(n));
	}

}
