import java.util.*;

public class NumberFormat{
	
	// method
	public static void generateException(String str){
		System.out.print(Integer.parseInt(str));
	}
	
	public static void handlingExcption(String str){
		
		try{
			System.out.print(Integer.parseInt(str));
		}
		catch(NumberFormatException e){
			System.out.print(e);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	// main
	public static void main(String agrs[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter str : ");
		String str = input.next();
		
		// method
		//NumberFormat.generateException(str);
		NumberFormat.handlingExcption(str);
		
		input.close();
	}
}