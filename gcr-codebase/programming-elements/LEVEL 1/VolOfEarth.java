// declaring a class VolOfEarth to find volumne of earth
public class VolOfEarth{
	public static void main(String args[]){	
		// declaring radius of earth in km in radiusOfEarthKm variable
		int radiusOfEarthKm = 6378;
		
		// declaring radiusOfEarthMiles 
		double radiusOfEarthMiles = radiusOfEarthKm * 1.6;
		
		// declaring two varibles to store result value
		double volInKm, volInMiles;
		
		// calculating volume
		
		// in kilometer
		volInKm = 4/3 * 3.14 * (radiusOfEarthKm);
		
		// in meter
		volInMiles = 4/3 * 3.14 * (radiusOfEarthMiles);
		
		// displaying the result
		System.out.println("The volume of earth in cubic kilometers is " + volInKm + 
						" and cubic miles is " + volInMiles);
	}
}