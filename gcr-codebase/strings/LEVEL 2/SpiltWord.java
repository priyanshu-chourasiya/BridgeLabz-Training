import java.util.*;

public class SpiltWord{
	
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
	
	public static char[] tosplit(String str){
		int result = returnlength(str);
		
		char[] arr = new char[result];
		
		for(int i = 0; i < result; i++){
			arr[i] = str.charAt(i);
		}
		
		return arr;
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter str : ");
		String str = input.nextLine();
		
		// method calling
		
		char[] result = SpiltWord.tosplit(str);
		
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(str.split("")));
		
		input.close();
	}
}