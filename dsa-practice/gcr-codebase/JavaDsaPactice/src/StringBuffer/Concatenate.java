package StringBuffer;

public class Concatenate {
	public static void main(String args[]) {
		
		String[] arr = {"priyanshu" + "is" + "a" + "good"};
		
		StringBuffer sb = new StringBuffer();
		
		for(String s : arr) {
			sb.append(s);
		}
		
		System.out.println(sb.toString());
	}
}
