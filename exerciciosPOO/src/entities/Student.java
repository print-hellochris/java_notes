package entities;

public class Student {
	public String name;
	public double gradeOne;
	public double gradeTwo;
	public double gradeThree;
	public double finalGrade;
	
	
	
	
	
	
	public String isStudentApproved() {
		
		/*public double FinalGrade() {
			finalGrade = (gradeOne + gradeTwo+gradeThree);
			return finalGrade;
			
		} */
		
		finalGrade =(gradeOne + gradeTwo+gradeThree);
		
		if(finalGrade > 60.00) {
			return "PASS";
			}
		
		else {
			double missing = (60.00-finalGrade);
			return "FAILED\nMISSING "+missing;
			}
			}
		
	public String ToString() {
		String situation = isStudentApproved();
		
		return "FINAL GRADE =  "+
				String.format("%.2f%n", finalGrade)
				+situation;	}
	
}

