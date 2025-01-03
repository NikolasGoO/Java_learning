package OOP_exercices;

public class Student {
	public String Name;
	public double[] Grade = new double[3];
	
	public void HasPass()
	{
		double average = Grade[0] + Grade[1] + Grade[2];
		
		if(average >= 60) {
			System.out.println("\nFINAL GRADE = " + average);
			System.out.println("PASS");
		} else if(average < 60) {
			System.out.println("\nFINAL GRADE = " + average);
			System.out.println("FAILED");
			System.out.println("MISSING "+ (average - 6) + " POINTS");
		}
	}
}
