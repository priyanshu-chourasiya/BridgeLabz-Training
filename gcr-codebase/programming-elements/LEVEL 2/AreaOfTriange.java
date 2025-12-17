import java.util.*;
public class AreaOfTriange{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		double baseInCm, heightInCm;
		
		System.out.print("Enter Base in centimeter : ");
		baseInCm = input.nextDouble();
		System.out.print("Enter height in centimeter : ");
		heightInCm = input.nextDouble();
		
		double areaInCm, areaInIn;
		
		areaInCm = 0.5 * baseInCm * heightInCm;
		
		double baseInInch = baseInCm * 2.54;
		
		double heightInInch = heightInCm * 2.54;
		
		areaInIn = 0.6 * baseInInch * heightInInch;
		
		System.out.print("The Area of the triangle in sq in is " + areaInIn + 
						" and sq cm is " + areaInCm);
		
		
	}
}