/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 2/21/2023
		 Assignment: 6.1 LAB (H)
		 Instructor: Dr. Sergio Pisano
		 Description: Grades
		 */

import java.util.Scanner;

public class ProgramLab {
   public static void main(String[] args) {

      final double HOMEWORK_MAX = 800.0;
      final double QUIZZES_MAX = 400.0;
      final double MIDTERM_MAX = 150.0;
      final double FINAL_MAX = 200.0;    

      Scanner scnr = new Scanner(System.in);
      
      String studentStatus = scnr.next();
      double homeworkPoints = scnr.nextDouble();
      double quizPoints = scnr.nextDouble();
      double midtermScore = scnr.nextDouble();
      double finalScore = scnr.nextDouble();
      double gAverage;
      double ugAverage;
      double dlAverage;
      
      if (studentStatus.equals("UG") || studentStatus.equals("DL") || studentStatus.equals("G") ) {
    	  homeworkPoints = (homeworkPoints/HOMEWORK_MAX) * 100;
    	  quizPoints= (quizPoints/QUIZZES_MAX) * 100;
    	  midtermScore = (midtermScore/MIDTERM_MAX) * 100;
    	  finalScore = (finalScore/FINAL_MAX) * 100;
    	  	if (homeworkPoints>100) {
    	  		homeworkPoints = 100.0;
    	  		System.out.println("Homework: 100.0%");
    	  	}
    	  	else {
    	  System.out.printf("Homework: %.1f%%\n", homeworkPoints); 
    	  	}
    	  	if (quizPoints > 100) {
    	  		quizPoints = 100.0;
    	  		System.out.println("Quizzes: 100.0%");
    	  	}
    	  	else {
    	  		System.out.printf("Quizzes: %.1f%%\n", quizPoints);
    	  	}
    	  	if (midtermScore > 100) {
    	  		midtermScore = 100.0;
    	  		System.out.println("Midterm: 100.0%");
    	  	}
    	  	else {
    	  		System.out.printf("Midterm: %.1f%%\n", midtermScore);
    	  	}
    	    if (finalScore >100) {
    	    	finalScore = 100.0;
    	    	System.out.println("Final Exam: 100.0%");
    	    }
    	    else {
    	  System.out.printf("Final Exam: %.1f%%\n", finalScore);
    	    }
    	  
    	  if (studentStatus.equals("G")) { // for g students, average and grade
    		  gAverage = (homeworkPoints * 15 + quizPoints * 5 + midtermScore * 35 + finalScore * 45)/100;
    		  System.out.printf("G average: %.1f%%\n", gAverage );
    		  
    		  if (gAverage >= 90) {
    			  System.out.println("Course grade: A");
    			
    		  }
    		  else if (gAverage >= 80) {
    			  System.out.println("Course grade: B");
    		  }
    		  else if (gAverage >= 70) {
    			  System.out.println("Course grade: C");
    		  }
    		  else if (gAverage >= 60) {
    			  System.out.println("Course grade: D");
    		  }
    		  else if (gAverage < 60) {
    			  System.out.println("Course grade: F");
    		  }
    	  }
    	  else if (studentStatus.equals("UG")) { //for ug students, average and grade
        		  ugAverage = (homeworkPoints * 20 + quizPoints * 20 + midtermScore * 30 + finalScore * 30)/100;
        		  System.out.printf("UG average: %.1f%%\n", ugAverage );
        		  
        		  if (ugAverage >= 90) {
        			  System.out.println("Course grade: A");
        			
        		  }
        		  else if (ugAverage >= 80) {
        			  System.out.println("Course grade: B");
        		  }
        		  else if (ugAverage >= 70) {
        			  System.out.println("Course grade: C");
        		  }
        		  else if (ugAverage >= 60) {
        			  System.out.println("Course grade: D");
        		  }
        		  else if (ugAverage < 60) {
        			  System.out.println("Course grade: F");
        		  }
    	  }
    	  else if (studentStatus.equals("DL")) { //for dl students, aveage and grade
    		  dlAverage = (homeworkPoints * 5 + quizPoints * 5 + midtermScore * 40 + finalScore * 50)/100;
    		  System.out.printf("DL average: %.1f%%\n", dlAverage );
    		 
    		  if (dlAverage >= 90) {
    			  System.out.println("Course grade: A");
    			
    		  }
    		  else if (dlAverage >= 80) {
    			  System.out.println("Course grade: B");
    		  }
    		  else if (dlAverage >= 70) {
    			  System.out.println("Course grade: C");
    		  }
    		  else if (dlAverage >= 60) {
    			  System.out.println("Course grade: D");
    		  }
    		  else if (dlAverage < 60) {
    			  System.out.println("Course grade: F");
    		  }
    	  }
      }
      else {
    	  System.out.println("Error: student status must be UG, G or DL");
      }

     
   }
}