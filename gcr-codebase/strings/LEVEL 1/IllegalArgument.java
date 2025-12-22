import java.util.*;

public class IllegalArgument{
	
	// methods
	public static void generateException(String str){
		
		System.out.print(str.substring(5,1));
	}
	
	public static void handlingException(String str){
		
		try{
			System.out.print(str.substring(5,1));
		}
		catch(IllegalArgumentException e){
			System.out.print(e);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter str : ");
		String str = input.next();
		
		// method calling
		// IllegalArgument.generateException(str);
		IllegalArgument.handlingException(str);
		
		input.close();
	}
}