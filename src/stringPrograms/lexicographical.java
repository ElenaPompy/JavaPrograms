package stringPrograms;

import java.util.Scanner;

public class lexicographical {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int index = s.nextInt();
				
		System.out.println("Smallest and largest substring is : " + smallestAndLargest(str,index));
				
	}
	
	public static String smallestAndLargest(String str, int k)
	{
		String largest = str.substring(0, k);
		String smallest = str.substring(0, k);
        
       
        for(int i=0;i<=str.length()-k;i++)
        {
        	String curr = str.substring(i, i+k);
        	
        	
        	if(curr.compareTo(largest)>0)
        		largest = curr;
        	
        	if(curr.compareTo(smallest)<0)
        		smallest = curr;
        }
		return largest + " " + smallest;
				
	}

}
