package stringPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyntxPatternChk {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		int tc = Integer.parseInt(sc.nextLine());
		
		while(tc>0)
		{
			String s = sc.nextLine();
			try
			{
				Pattern.compile(s);
				System.out.println("Valid");
			
			}
			catch(Exception e)
			{
				System.out.println("invalid");
			}
		
			tc--;
		}
		
		

	}

}
