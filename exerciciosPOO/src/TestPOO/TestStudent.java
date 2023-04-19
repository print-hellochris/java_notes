package TestPOO;
import entities.Student;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student alex = new Student();
		
		alex.name = sc.nextLine();
		alex.gradeOne = sc.nextDouble();
		alex.gradeTwo = sc.nextDouble();
		alex.gradeThree = sc.nextDouble();
		
		System.out.println(alex.ToString());
		sc.close();
	}

}
