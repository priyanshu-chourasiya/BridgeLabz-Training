import java.util.*;

public class NullPointerDemo{
	
	// method
	public static void generateException(){
		String text = null;;
		
		System.out.print(text.length());
	}
	
	public static void handlingException(){
		
		String text = null;
		
		try{
			text.length();
		}
		catch(NullPointerException e){
			System.out.print(e.getMessage());
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
	
	// main
	public static void main(String agrs[]){
		
		//NullPointerDemo.generateException();
		NullPointerDemo.handlingException();
	}
}