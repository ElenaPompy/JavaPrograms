package stringPrograms;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currenctFormatProg {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
	    NumberFormat us = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
	    System.out.println("US: " + us.format(payment));
	    NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
	    System.out.println("India: " + india.format(payment));
	    NumberFormat china = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
	    System.out.println("China: " + china.format(payment));
	    NumberFormat france = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
	    System.out.println("France: " + france.format(payment));

	}

}