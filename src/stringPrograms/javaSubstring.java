package stringPrograms;

import java.util.Scanner;

public class javaSubstring {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		int start = s.nextInt();
		int end = s.nextInt();
		
		System.out.println("Substring of " + str + " is : " + str.substring(start, end));

	}

}
