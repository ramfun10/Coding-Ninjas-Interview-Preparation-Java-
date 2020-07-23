import java.util.*;
public class Print {

	public static void print(int n) {
		if(n > 0) {
			print(n - 1);
			System.out.print(n + " ");
		}
		//return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		print(n);
	}

}
