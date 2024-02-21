 /*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 2/6/2023
		 Assignment: 2.3 LAB (LM): Divide input integers
		 Instructor: Dr. Sergio Pisano
		 Description: Division for Zylabs
		 */
		

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum = scnr.nextInt();
		int divNum = scnr.nextInt();
		int finalNum;
		
		finalNum = userNum / divNum;
		System.out.print(finalNum + " ");
		
		finalNum = finalNum / divNum;
		System.out.print(finalNum + " ");
		
		finalNum = finalNum / divNum;
		System.out.println(finalNum);

	}

}
