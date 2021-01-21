package stringPrograms;

public class reverseSringOrder {

	public static void main(String[] args) 
	{
		
		String str = "country my is This";
		
		String[] strArr = str.split(" ");
		
		System.out.print("Revere order of string is : ");
		
		for(int i=strArr.length-1;i>=0;i--)
		{
			System.out.print(strArr[i]+ " ");
			System.out.println("test");
		}

	}

}
