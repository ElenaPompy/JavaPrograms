package collectionP;

import java.util.TreeSet;

public class treeSetP {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unchecked")
		TreeSet<String> ts = new TreeSet<String>(new myComparator());
		
		ts.add("a");
		ts.add("d");
		ts.add("b");
		ts.add("e");
		ts.add("c");
		
		System.out.println("Sorted set in descending order : "+ ts );
	}



	

}
