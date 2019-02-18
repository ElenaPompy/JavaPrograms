
public class palindrome 
{
	public static void isPalindrome(int num)
	{
		int sum =0;
		int rev = 0;
		int t;
		t = num;
		
		while(num>0)
		{
			rev = num%10;
			sum = sum*10+rev;
			num = num/10;			
		}
		
		if(t==sum)
		
			System.out.println(t+" is palindrome");
		
		else
			System.out.println(t+ " is not palindrome");
			
	}
	public static void main(String[] args) 
	{
		isPalindrome(151);
	}

}
