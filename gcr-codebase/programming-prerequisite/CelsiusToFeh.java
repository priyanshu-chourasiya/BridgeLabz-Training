import java.util.*;
class CelsiusToFeh{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter temperature in Celsius : ");
	int tempInCel = sc.nextInt();
	int fehrenheit = (tempInCel *9/5) + 32;
	System.out.println(fehrenheit);
}
}