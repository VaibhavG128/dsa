package RecursionDemo;

public class FactorialWithRec {

	public static void main(String[] args) {
		
		System.out.println(myFact(12));

	}

	public static int myFact(int n)
	{
		if(n>1)
		{
			n = n * myFact(n-1);
		}
		return n;
	}
}
