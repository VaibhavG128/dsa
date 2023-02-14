package pattern;

import java.util.Scanner;

import utilhelper.PatternCreater;
import utilhelper.PatternHelper;

/**
 * @ author - Vaibhav Garg
 * @ desc - To create a pattern program
 * @ created at - 12/02/2023
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
			case 9:
				PatternCreater.downwardShapeStar(number);
				break;
			case 10:
				PatternCreater.rightPascalStar(number);
				break;
			case 11:
				PatternCreater.rightPascalBoolean(number);
				break;
			case 12:
				PatternCreater.triangle(number);
				break;
			case 13:
				PatternCreater.rightTriangleNumber(number);
				break;
			case 14:
				PatternCreater.rightTriangleCharacter(number);
				break;
			case 15:
				PatternCreater.downwardTriangleCharacter(number);
				break;
			case 16:
				PatternCreater.downwardTriangleCharacterRaw(number);
				break;
			case 17:
				PatternCreater.pyramidCharacter(number);
				break;
			case 18:
				PatternCreater.rightTriangleCharaterReverse(number);
				break;
			case 19:
				PatternCreater.diamondStarSpace(number);
			}
				
				
			System.out.println("DO YOU WANT TO CONTINUE Y?N");
			con = scan.next();

		} while (con.equals("y") || con.equals("Y"));
		scan.close();
	}

}
