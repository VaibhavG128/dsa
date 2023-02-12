package utilhelper;

/**
 * @author - Vaibhav Garg
 * @desc - Helper class to create patterns
 * @created at - 12/02/2023
 * @modified at - 12/02/2023
 */
public class PatternCreater {

	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023
	 * @pattern - SQUARE STAR PATTERN
	 * @patternno - 1
	 */
	public static void squareStar(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023
	 * @pattern - RIGHT TRIANGLE STAR PATTERN
	 * @patternno - 2
	 */
	public static void rightTriangleStar(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023 
	 * @pattern - RIGHT TRIANGLE NUMBER BY COLUMN PATTERN
	 * @patternno - 3
	 */
	public static void rightTriangleNumberCol(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023 
	 * @pattern - RIGHT TRIANGLE NUMBER BY RAW PATTERN
	 * @patternno - 4
	 */
	public static void rightTriangleNumberRaw(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023 
	 * @patternno - 5
	 * @pattern - DOWNWARD TRIANGLE STAR PATTERN
	 */
	public static void downwardTriangleStar(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023 
	 * @pattern - DOWNWARD TRIANGLE NUMBER PATTERN
	 * @patternno - 6
	 */
	public static void downwardTriangleNumber(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n+1-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023 
	 * @pattern - PYRAMID STAR PATTERN
	 * @patternno - 7
	 */
	public static void pyramidStar(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n+i-1; j++) {
				if(j>(n-i+1)&&j<(n+i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023 
	 * @pattern - DOWNWARD PYRAMID STAR PATTERN
	 * @patternno - 8
	 */
	public static void downwardPyramidStar(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2*n-i; j++) {
				if(j<=i-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
