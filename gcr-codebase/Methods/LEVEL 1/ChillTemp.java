import java.util.*;

public class ChillTemp{
	
	// method
	public static double calculateWindChill(double temperature, double windSpeed){
		
		return 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
		//windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16
	}
	
	// main method
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter temp : ");
		int temp = input.nextInt();
		System.out.print("Enter windspeed : ");
		double windSpeed = input.nextInt();
		
		// printing
		double result = ChillTemp.calculateWindChill(temp,windSpeed);
		System.out.print(result);
		
		
		input.close();
	}
}