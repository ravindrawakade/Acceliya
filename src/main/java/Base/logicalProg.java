package Base;

import java.util.Scanner;

public class logicalProg {

	public static void main(String[] args) 
	{
		int  num = 0 ;
	    System.out.println("Enter A Number");
	    
	    Scanner s = new Scanner (System.in);
	    s.nextInt();
	  
	    
	    if (num%2==0)
	    {
	    	System.out.println("Entered Number Is Even");
	    }
	    else
	    {
	    	System.out.println("Entered Number Is Odd");
	    }

	}

}
