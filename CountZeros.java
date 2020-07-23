import java.util.*;
public class CountZeros {
	
	public static int countZeros(int input) {
		int count = 0;
		if(input == 0)
			return 0;
		if(input % 10 == 0)
			count+=1;
		return count + countZeros(input/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(countZeros(input));
		sc.close();
	}
}
