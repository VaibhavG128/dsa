package basicmathsproblem;

import java.util.Scanner;
import utilhelper.BasicMathHelper;

/**
 * @ author - Vaibhav Garg
 * @ desc - To create a Solution of Math Problems
 * @ created at - 20/02/2023
 * @ modified at - 20/02/2023
 */
public class BasicMathProblems {
	public static void main(String args[]) {
		System.out.println("WELCOME TO MATHS PROGRAM\n\n");
		Scanner scan = new Scanner(System.in);
		String con;
		int select;
		int number;
		do {
			System.out.println("SELECT ONE PROBLEMS");
			BasicMathHelper.mathsProblems();
			select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.println("Enter number");
				number = scan.nextInt();
				System.out.println(BasicMathHelper.countDigits(number));
				break;
			case 2:
				System.out.println("Enter number");
				number = scan.nextInt();
				System.out.println(BasicMathHelper.reverseDigits(number));
				break;
			case 3:
				System.out.println("Enter number");
				number = scan.nextInt();
				System.out.println(BasicMathHelper.palindrome(number));
				break;
			case 4:
				System.out.println("Enter number1");
				number = scan.nextInt();
				System.out.println("Enter number2");
				int number2 = scan.nextInt();
				System.out.println(BasicMathHelper.gcd(number, number2));
				break;
			case 5:
				System.out.println("Enter number");
				number = scan.nextInt();
				System.out.println(BasicMathHelper.armstrong(number));
				break;
			case 6:
				System.out.println("Enter number");
				number = scan.nextInt();
				BasicMathHelper.allDivisorNumber(number);
				break;
			case 7:
				System.out.println("Enter number");
				number = scan.nextInt();
				BasicMathHelper.checkPrimeNumber(number);
				break;
			default:
				System.out.println("wrong input enter valid input");
			}

			System.out.println("DO YOU WANT TO CONTINUE Y?N");
			con = scan.next();

		} while (con.equals("y") || con.equals("Y"));
		scan.close();

	}
}
