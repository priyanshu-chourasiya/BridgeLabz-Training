import java.util.*;

public class FindLength{
	
	// method
	public static int returnlength(String str){
		int result = 0, i = 0;
		while(true){
			try{
				str.charAt(i);
			}
			catch(Exception e){
				break;
			}
			i += 1;
			result += 1;
		}
		return result;
	}
	
	//  main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter str : ");
		String str = input.next();
		
		// method calling
		
		System.out.println(FindLength.returnlength(str));
		
		System.out.print(FindLength.returnlength(str) == str.length());
		
		input.close();
	}
}