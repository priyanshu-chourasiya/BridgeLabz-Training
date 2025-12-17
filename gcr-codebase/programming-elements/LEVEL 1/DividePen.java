// declaring a class DividePen which is used to solve pen distribution problem
public class DividePen{
	public static void main(String args[]){
		
		// declaring a variable numberOfPens which stores the number of pens
		int numberOfPens = 14;
		
		// declaring a variable numberOfStudents which stores the number of students
		int numberOfStudents = 3;
		
		// finding how many pens each student will get, using pensOnEachStudent variable
		int pensOnEachStudent = numberOfPens/numberOfStudents;
		
		// find remaining pens after distibuting pens among 3 students
		// using variable remainingPens
		int remainingPens = numberOfPens%numberOfStudents;
		
		// displaying the output
		System.out.println("The Pen Per Student is " + pensOnEachStudent +
									" and the remaining pen not distributed is " + remainingPens);
	}
}