import java.util.*;

public class StringIndexOut{
	
	// method
	public static void generateExc(String str){
		int length = str.length();
		
		System.out.print(str.charAt(length + 5));
	}
	
	public static void handlingExc(String str){
		
		int length = str.length();
		
		try{
			System.out.print(str.charAt(length + 5));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.print(e);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter str : ");
		String str = input.next();
		
		//StringIndexOut.generateExc(str);
		StringIndexOut.handlingExc(str);
		
		input.close();
	}
	
	
}