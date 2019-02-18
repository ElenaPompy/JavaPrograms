
public class primeNumber 
{
	
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
			return false;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;		
	}
	
	public static void getPrime(int num)
	{
		for(int i=2;i<=num;i++) 
		{
			if(isPrimeNumber(i))
				System.out.print(i+" ");
		}
		
		System.out.println();
	}
	public static void main(String[] args) 
	{
		primeNumber pnum = new primeNumber();
		boolean result = isPrimeNumber(6);
		System.out.println(result);
		getPrime(7);
		getPrime(11);
	}

}
