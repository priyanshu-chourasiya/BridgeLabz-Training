// creating a class AgeOfHarry indicating the purpose 
// to find and display age of Harry
class AgeOfHarry{
	public static void main(String args[]){
	
		// declaring a variable name which stores the "Harry" as its value
		String name = "Harry";
		
		// declaring a variable birthYear which is storing 2000 as Harry's birthYear
		int birthYear = 2000;
		
		// declaring a variable currentYear which has 2024 as current year
		int currentYear = 2024;
		
		// decalaring a empty variable age to store the age of Harry
		int age;
		
		// using formule to find age of Harry
		// age is the substraction of currentYear and birthYear
		age = currentYear - birthYear;
		
		// displaying the age of Harry
		System.out.println("Harry's age in 2024 is : " + age);
		
		
	}
}