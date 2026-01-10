/*
 * AmbulanceRoute – Emergency Patient Navigation (Circular Linked List)
Story: In a hospital, there are multiple buildings connected in a circular fashion:
Emergency → Radiology → Surgery → ICU → Emergency. When an ambulance is bringing in patients, 
it follows a Circular Linked List to decide the nearest available unit for emergency treatment.
Requirements:
● Each node represents a hospital unit.
● Rotate through units until an available one is found.
● Simulate patient redirection in a circular path.
● Remove a unit if it's under maintenance.
 */

package week1.AmbulanceRoute;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmbulanceRoute route = new AmbulanceRoute();
		route.setup();
		
		route.redirectpatient(); // Emergency
        route.head.available = false;

        route.redirectpatient(); // Radiology
        route.head.available = false;

        route.removeUnit("Surgery");

        route.redirectpatient(); // ICU
		
		
	}

}
