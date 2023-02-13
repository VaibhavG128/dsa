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
			for (int j = 1; j <= n + 1 - i; j++) {
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
			for (int j = 1; j <= n + 1 - i; j++) {
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
			for (int j = 1; j <= n + i - 1; j++) {
				if (j > (n - i) && j < (n + i)) {
					System.out.print("*");
				} else {
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
			for (int j = 1; j <= 2 * n - i; j++) {
				if (j <= i - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
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
	 * @pattern - DIAMOND SHAPE STAR PATTERN
	 * @patternno - 9
	 */
	public static void downwardShapeStar(int n) {
		pyramidStar(n);
		downwardPyramidStar(n);
	}

	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023
	 * @pattern - RIGHT PASCAL STAR PATTERN
	 * @patternno - 10
	 */
	public static void rightPascalStar(int n) {
		for (int i = 1; i <= 2 * n; i++) {
			if (i <= 5) {

				for (int j = 1; j <= i; j++)
					System.out.print("*");
			} else {
				for (int j = 1; j <= 2 * n - i; j++)
					System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 13/02/2023
	 * @modified at - 13/02/2023
	 * @pattern -RIGHT TRIANGLE 0/1 PATTERN
	 * @patternno - 11
	 */
	public static void rightPascalBoolean(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((j + i - 1) % 2);
			}
			System.out.println();
		}
	}

	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 14/02/2023
	 * @modified at - 14/02/2023
	 * @pattern -TRAINGLE PATTERN
	 * @patternno - 12
	 */
	public static void triangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n; j++) {
				if (j <= i) {
					System.out.print(j);
				} else if (j >= (2 * n - i)) {
					System.out.print(2 * n - j + 1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 14/02/2023
	 * @modified at - 14/02/2023
	 * @pattern -RIGHT TRIANGLE NUMBER PATTERN
	 * @patternno - 13
	 */
	public static void rightTriangleNumber(int n) {
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 14/02/2023
	 * @modified at - 14/02/2023
	 * @pattern -RIGHT TRIANGLE CHARACTER'S PATTERN
	 * @patternno - 14
	 */
	public static void rightTriangleCharacter(int n) {
		int k = 64;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(k+j));
			}
			System.out.println();
		}
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 14/02/2023
	 * @modified at - 14/02/2023
	 * @pattern -DOWNWARD TRIANGLE CHARACTER'S PATTERN
	 * @patternno - 15
	 */
	public static void downwardTriangleCharacter(int n) {
		int k = 64;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print((char)(k+j));
			}
			System.out.println();
		}
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 14/02/2023
	 * @modified at - 14/02/2023
	 * @pattern - DOWNWARD TRIANGLE CHARACTER'S RAW PATTERN
	 * @patternno - 16
	 */
	public static void downwardTriangleCharacterRaw(int n) {
		int k;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				k = 64;
				System.out.print((char)(k+i));
			}
			System.out.println();
		}
	}
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023
	 * @pattern - PYRAMID CHARACTER'S PATTERN
	 * @patternno - 17
	 */
	public static void pyramidCharacter(int n) {
		for (int i = 1; i <= n; i++) {
			int k=64;
			for (int j = 1; j <= n + i - 1; j++) {
				if (j > (n - i) && j < (n + i)) {
				k= (j<=n)?k+1:k-1;
				System.out.print((char)k);
			}
			else {
				System.out.print(" ");
			}}
			System.out.println();
		}
	}
	
	/**
	 * @author - Vaibhav Garg
	 * @desc - Helper class to create patterns
	 * @created at - 12/02/2023
	 * @modified at - 12/02/2023
	 * @pattern -RIGHT TRIANGLE CHARACTER'S REVERSE PATTERN
	 * @patternno - 18
	 */
	public static void rightTriangleCharaterReverse(int n) {
		int k = 69;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(k-i+j));
			}
			System.out.println();
		}
	}
	
}
	
