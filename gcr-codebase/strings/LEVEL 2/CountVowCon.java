import java.util.*;

public class CountVowCon{
	
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
		
		int vovels = 0, couns = 0;
		
		for(int i = 0; i < ans.length(); i++){
			boolean result = CountVowCon.checkChar(ans.charAt(i));
			if(result){
				vovels++;
			}
			else{
				couns++;
			}
		}
		
		System.out.print(vovels + " " + couns);
		
		input.close();
	}
}