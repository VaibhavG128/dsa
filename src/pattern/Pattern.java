package pattern;

import java.util.Scanner;

import utilhelper.PatternCreater;
import utilhelper.PatternHelper;

/**
 * @ author - Vaibhav Garg
 * @ desc - To create a pattern program
 * @ create at - 12/02/2023
 * @ modified at - 12/02/2023
 */
public class Pattern {

	public static void main(String args[]) {
		System.out.println("WELCOME TO PATTERN PROGRAM\n\n");
		Scanner scan = new Scanner(System.in);
		String con;
		int select;
		int number;
		do {
			System.out.println("SELECT ONE PATTERN");
			PatternHelper.patternTypes();
			select = scan.nextInt();
			System.out.println("ENTER NUMBER LENGTH TO CREATE PATTERN");
			number = scan.nextInt();
			switch (select) {
			case 1:
				PatternCreater.squareStar(number);
				break;
			case 2:
				PatternCreater.rightTriangleStar(number);
				break;
			case 3:
				PatternCreater.rightTriangleNumberRaw(number);
				break;
			case 4:
				PatternCreater.rightTriangleNumberCol(number);
				break;
			case 5:
				PatternCreater.downwardTriangleStar(number);
				break;
			case 6:
				PatternCreater.downwardTriangleNumber(number);
				break;
			case 7:
				PatternCreater.pyramidStar(number);
				break;
			case 8:
				PatternCreater.downwardPyramidStar(number);
				break;
			}
			System.out.println("DO YOU WANT TO CONTINUE Y?N");
			con = scan.next();

		} while (con.equals("y") || con.equals("Y"));
		scan.close();
	}

}
