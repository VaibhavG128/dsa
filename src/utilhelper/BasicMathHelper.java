package utilhelper;

/**
 * @ author - Vaibhav Garg
 * @ desc - To create a Math solution program
 * @ created at - 12/02/2023
 * @ modified at - 12/02/2023
 */
public class BasicMathHelper {

	/**
	 * @author - Vaibhav Garg
	 * @desc - Class to show all Math problem naming
	 * @created at - 20/02/2023
	 * @modified at - 20/02/2023
	 */
	public static void mathsProblems() {
		System.out.println("1.COUNT DIGITS");
		System.out.println("2.REVERSE A NUMBER");
		System.out.println("3.CHECK PALINDROME");
		System.out.println("4.GCD OR HCF");
		System.out.println("5.ARMSTRONG NUMBERS");
		System.out.println("6.PRINT ALL DIVISORS");
		System.out.println("7.CHECK FOR PRIME");
	}
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to solve Math problem
	 * @created at - 20/02/2023
	 * @modified at - 20/02/2023
	 * @problem - COUNT DIGITS
	 * @problemno - 1
	 */
	
	public static int countDigits(int number)
	{
		int count=0;
		while(number>0)
		{
			number = number/10;
			count++;
		}
		return count;
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to solve Math problem
	 * @created at - 20/02/2023
	 * @modified at - 20/02/2023
	 * @problem - REVERSE A NUMBER
	 * @problemno - 2
	 */
	public static int reverseDigits(int number)
	{
		int reverse=0;
		while(number>0)
		{
			reverse = reverse*10 + number%10;
			number = number/10;
		}
		return reverse;
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to solve Math problem
	 * @created at - 20/02/2023
	 * @modified at - 20/02/2023
	 * @problem - CHECK PALINDROME
	 * @problemno - 3
	 */
	public static String palindrome(int number) {
		int reverse = reverseDigits(number);
		String result;
		if(reverse==number)
			result = "Palindrome Number";
		else
			result = "Not a Palindrome Number";
		return result;
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to solve Math problem
	 * @created at - 20/02/2023
	 * @modified at - 20/02/2023
	 * @problem - GCD OR HCF
	 * @problemno - 4
	 */
	public static int gcd(int number, int number2) {
		int gcd=0;
		for(int i=1;i<=Integer.min(number, number2);i++)
		{
			if(number%i==0&&number2%i==0)
			{
				gcd = i;
			}
			
		}
		return gcd;
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to solve Math problem
	 * @created at - 20/02/2023
	 * @modified at - 20/02/2023
	 * @problem - ARMSTRONG NUMBERS
	 * @problemno - 5
	 */
	public static String armstrong(int number) {
		int count = countDigits(number);
		int duplinumber  = number;
		int total=0;
		String result;
		while(duplinumber>0)
		{
			total = (int) (total + Math.pow(duplinumber%10,count));
			duplinumber = duplinumber/10;
		}
		if(total==number)
			result = "Number is Palindrome";
		else
			result = "Number is not Palindrome";
		return result;
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to solve Math problem
	 * @created at - 20/02/2023
	 * @modified at - 20/02/2023
	 * @problem - PRINT ALL DIVISORS
	 * @problemno - 6
	 */
	public static void allDivisorNumber(int number) {
		System.out.println("1");
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
				System.out.println(i);
		}
		System.out.println(number);
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to solve Math problem
	 * @created at - 20/02/2023
	 * @modified at - 20/02/2023
	 * @problem - CHECK FOR PRIME
	 * @problemno - 7
	 */
	public static void checkPrimeNumber(int number) {
		Boolean status = false;
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				status = true;
				break;
			}
		}
		if(status&&number!=1)
			System.out.println("Number is not prime");
		else
			System.out.println("Number is prime");
	}

}
