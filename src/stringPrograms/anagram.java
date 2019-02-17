package stringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		String s2= sc.next();
		
		HashMap hm1 = freqMap(s1);
		System.out.println("Usorted map1 is : " + hm1);
		HashMap hm2 = freqMap(s2);
		System.out.println("Usorted map2 is : " + hm2);
		
		if(hm1.equals(hm2) == true)
		{
			System.out.println("is Anagram");
		}
		else
			System.out.println("not anagram");
		


	}
	

	//return map with characters and respective frequencies
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static HashMap freqMap(String s) 
	{
		
		int len = s.length();
		int i=0;
		HashMap freq = new HashMap();
		while(i<len)
		{
			int count=1;
				
			for(int j=i+1;j<len;j++)
			{
				if((Character.toUpperCase(s.charAt(i))==(Character.toUpperCase(s.charAt(j)))))
				count++;				
			}
			
			char ch = s.charAt(i);
			
			freq.put(Character.toUpperCase(ch),count);
			s = s.replaceAll(String.valueOf(ch), "");	
			s = s.replaceAll(String.valueOf(Character.toUpperCase(ch)), "");
			s = s.replaceAll(String.valueOf(Character.toLowerCase(ch)), "");
		
			len = s.length();							
		}
		return freq;
	}
}
