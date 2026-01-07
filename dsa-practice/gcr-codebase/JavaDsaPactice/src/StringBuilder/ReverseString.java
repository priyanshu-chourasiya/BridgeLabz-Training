package StringBuilder;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring sb object
		StringBuilder sb = new StringBuilder("Priyanshu");
		
		// reversing
		sb.reverse();
		
		// to string
		String ans = sb.toString();
		
		System.out.println(ans);
	}

}
