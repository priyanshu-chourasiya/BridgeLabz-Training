// Declaring a class AverageMarks indicating program's purpose
// To find the Average percent marks 
class AverageMarks{
	public static void main(String args[]){
		// declaring variables which contains marks of Sam out of 100
		
		// storing marks of Sam in Maths
		int maths = 94;
		
		// storing marks of Sam in Physics
		int physics = 95;
		
		// storing marks of Sam in Chemistry
		int chemistry = 96;
		
		// declaring a empty double variable averagePercent which will store the average Percent
		// marks of Sam
		double averagePercent;
		
		// declaring totalMarksObtained variable which will store Sam's total marks
		int totalMarksObtained = maths + physics + chemistry;
		
		// declaring maximumMarks variable and assigning total maximum marks to it
		int maximumMarks = 300;
		averagePercent = ((double)totalMarksObtained/(double)maximumMarks) * 100;
		
		// Displaying the result
		System.out.println("Sam’s average mark in PCM is : " + averagePercent);
	}
}