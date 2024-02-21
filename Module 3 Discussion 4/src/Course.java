/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 2/21/2023
		 Assignment: Module 3 Discussion 4
		 Instructor: Dr. Sergio Pisano
		 Description: course
 */
import java.util.Scanner;

public class Course {

	public double finalGrade;

	// this method will calculate the average grade for the course exams, quizzes and homework

	public void calculateFinalGrade() {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the average grade for exams? \n");
		double examAverage = in.nextDouble();
		System.out.print("What is the average grade for quizzes? \n");
		double quizzesAverage = in.nextDouble();
		System.out.print("What is the average grade for homework? \n");
		double homework = in.nextDouble();
		finalGrade = Math.round((examAverage * 0.5)+(quizzesAverage * 0.3)+(homework * 0.2));
				// show final grade to classroom 

	}

	public static void main(String[] args) {

		System.out.println("*** Course 1 ***");

		// creates an instance of the course class 1
		Course myCourse1 = new Course();

		// calls the calculateFinalGrade method
		myCourse1.calculateFinalGrade();

		System.out.println("*** Course 2 ***");

		// creates an instance of the course class 2
		Course myCourse2 = new Course();

		// calls the calculateFinalGrade method
		myCourse2.calculateFinalGrade();

		// calculate total average
		double totalAverage = (myCourse1.finalGrade + myCourse2.finalGrade) / 2;

		// print total output
		System.out.printf("The average grade of the two courses is: %.2f\n", totalAverage);

		//Using conditionals check if the average grade is either an A, B, C, D, or F and display it on the screen.
		//This is the criteria you need to use and check:
		//A: totalAverage >= 90.
		//B: totalAverage >=80 but < 90.
		//C: totalAverage >=70 but <80.
		//D: totalAverage >=60 but <70.
		//E: totalAverage <60.

	  if (totalAverage >= 90) {
		  System.out.println("Grade is an A");
	  }
	  else if (totalAverage >= 80) {
		  System.out.println("Grade is a B");
	  }
	  else if (totalAverage >= 70) {
		  System.out.println("Grade is a C");
	  }
	  else if (totalAverage >= 60) {
		  System.out.println("Grade is a D");
	  }
	  else if (totalAverage < 60) {
		  System.out.println("Grade is an D");
	  }

	}

}
/*** Course 1 ***
What is the average grade for exams? 
60
What is the average grade for quizzes? 
60
What is the average grade for homework? 
90
*** Course 2 ***
What is the average grade for exams? 
80
What is the average grade for quizzes? 
100
What is the average grade for homework? 
90
The average grade of the two courses is: 77.00
Grade is a C */

