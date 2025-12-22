import java.util.*;

public class ShowVowCon{
	
	// methods
	public static boolean checkChar(char a){
		if(a == 'A' || a == 'E' || a == 'O' || a == 'I' || a == 'U'){
			return true;
		}
		else{
			return false;
		}
	}
	
	// main
	public static void main(String agrs[]){
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter str : ");
		String ans = input.next();
		
		ans = ans.toUpperCase();
		
		for(int i = 0; i < ans.length(); i++){
			boolean result = CountVowCon.checkChar(ans.charAt(i));
			if(result){
				System.out.println("Vovel");
			}
			else{
				System.out.println("Consonents");
			}
		}
		
		input.close();
	}
}