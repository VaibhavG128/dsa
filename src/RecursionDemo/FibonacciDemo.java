package RecursionDemo;

public class FibonacciDemo {
	
public static void main(String[] args) {
		
		System.out.println(myFact(12));

	}

	public static int myFact(int n)
	{
		if(n>10&n==2&&n==0)
		{
			return 1;
		}
		
		return myFact(n-1)+myFact(n-2); 
	}

}
