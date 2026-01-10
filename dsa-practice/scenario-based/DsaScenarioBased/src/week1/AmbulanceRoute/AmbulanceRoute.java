package week1.AmbulanceRoute;

public class AmbulanceRoute {
	
	Unit head;
	
	public void setup() {
		Unit emergency = new Unit("Emergency",true);
		Unit radio = new Unit("Radio",true);
		Unit surgery = new Unit("Surgery",true);
		Unit icu = new Unit("ICU",true);
		
		emergency.next = radio;
		radio.next = surgery;
		surgery.next = icu;
		icu.next = emergency;
		
		head = emergency;
	}
	
	public Unit findAvailableUnit() {
		
		Unit temp = head;
		
		do {
			if(temp.available) {
				return temp;
			}
			temp = temp.next;
		}
		while(temp != head);
		
		return null;
	}
	
	public void redirectpatient() {
		
		Unit temp = head;
		
		while(!temp.available) {
			System.out.println("Checking : " + temp.name + " not availabe");
			temp = temp.next;
		}
		System.out.println("Patient redirect to : " + temp.name);
		head = temp.next;
		
	}
	
	public void removeUnit(String unitName) {
        Unit temp = head;
        Unit prev = null;

        
        do {
            if (temp.name.equals(unitName)) {
                if (prev != null) {
                    prev.next = temp.next;
                } 
                else {
                   
                    Unit last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                System.out.println(unitName + " removed from route.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Unit not found.");
    }
	
	
}
