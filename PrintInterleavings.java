
public class PrintInterleavings {
	
	public static void interleavings(String first, String second, String output) {
		if(first.length() == 0 && second.length()== 0) {
			//output = "";
			System.out.println(output);
			return;
		}
		if(first.length() != 0) {
			interleavings(first.substring(1), second, output + first.charAt(0));
		}
		if(second.length() != 0) {
			interleavings(first, second.substring(1), output + second.charAt(0));
		}
	}
	
	public static void interleavings(String first, String second) {
		interleavings(first, second, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "abx";
		String second = "cdy";
		interleavings(first, second);
	}

}
