package RecursionDemo;

public class FirstDemo {
	
	public static void main(String args[])
	{
		getnum(5);
	}

	public static void getnum(int n)
	{
		if(n<1)
		{
			System.out.println(n +" is less than 1");
		}
		else {
		
			getnum(n-1);
			System.out.println(n);
		}
		
	}
}
