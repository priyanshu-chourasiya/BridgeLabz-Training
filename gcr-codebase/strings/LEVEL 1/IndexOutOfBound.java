import java.util.*;

public class IndexOutOfBound{
	
	// method
	public static void generateException(String arr[]){
		int i = arr.length + 2;
		System.out.print(arr[i]);
	}
	
	public static void handlingException(String arr[]){
		try{
			System.out.print(arr[arr.length + 2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print(e);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	// main
	public static void main(String args[]){
		
		// arr
		String[] names  = new String[3];
		
		// declaring
		names[0] = "ABC";
		names[1] = "DEF";
		names[2] = "GHI";
		
		// calling methods
		//IndexOutOfBound.generateException(names[]);
		IndexOutOfBound.handlingException(names);
		
	}
}