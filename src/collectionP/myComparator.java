package collectionP;

import java.util.Comparator;

public class myComparator implements Comparator
{
	public int compare(Object o1, Object o2) 
	{
		//Integer i1 = (Integer)obj1;
		//Integer i2 = (Integer)obj2;
		return ((String)o2).compareTo((String)o1);
	}
	
}
