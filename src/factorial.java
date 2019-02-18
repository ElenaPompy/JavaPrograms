
public class factorial 
{
	//1. without recursion - using loop
//	public static void getFactorial(int num)
//	{
//		int fact=1;
//		for(int i=num;i>0;i--)
//		{
//			fact = fact * i;
//		}
//		
//		System.out.println("factorial of "+ num+" is " + fact);
//	}
	
	//1. without recursion - using loop
		public static int getFactorialNum(int num)
		{
			if(num==0)
				return 1;
			else
				return num * (getFactorialNum(num-1));
		}

	public static void main(String[] args) 
	{
		//getFactorial(1);
		System.out.println(getFactorialNum(2));
		
	}
}
