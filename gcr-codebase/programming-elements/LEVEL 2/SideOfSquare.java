import java.util.*;
public class SideOfSquare{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in); 
		
		int perimeter = input.nextInt();
		
		int side = (int)(perimeter/4);
		
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	}
}