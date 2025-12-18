import java.util.*;

public class YoungTall{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring varibles (height and age)
		int AmarAge, AmarHeight, AkbarAge, AkbarHeight, AnthonyAge, AnthonyHeight;
		
		// taking user input of variables
		System.out.print("Enter AmarAge : ");
		AmarAge = input.nextInt();
		System.out.print("Enter AmarHeight : ");
		AmarHeight = input.nextInt();
		System.out.print("Enter AkbarAge : ");
		AkbarAge = input.nextInt();
		System.out.print("Enter AkbarHeight : ");
		AkbarHeight = input.nextInt();
		System.out.print("Enter AnthonyAge : ");
		AnthonyAge = input.nextInt();
		System.out.print("Enter AnthonyHeight : ");
		AnthonyHeight = input.nextInt();
		
		// finding youngest among them
		// smallest age
		if(AmarAge <= AkbarAge && AmarAge <= AnthonyAge){
			System.out.println("Amar is youngest");
		}
		else if(AkbarAge <= AmarAge && AkbarAge <= AnthonyAge){
			System.out.println("Akbar is youngest");
		}
		else{
			System.out.println("Anthony is youngest");
		}
		
		// finding tallest among them
		// highest height
		if(AmarHeight >= AkbarHeight && AmarHeight >= AnthonyHeight){
			System.out.println("Amar is tallest");
		}
		else if(AkbarHeight >= AmarHeight && AkbarHeight >= AnthonyHeight){
			System.out.println("Akbar is tallest");
		}
		else{
			System.out.println("Anthony is tallest");
		}
		
		
		// closing scanner object
		input.close();
	}
}