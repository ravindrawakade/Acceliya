package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest1
{
   @BeforeMethod
   public void setup()
   {
	   System.out.println("Before Method");
   }
   
   
   @Test (priority = 2)
   public void method1()
   {
	  System.out.println("Method1"); 
   }	
   
   @Test(priority = -1)
   public void method2()
   {
	  System.out.println("Method2"); 
   }
   
   @Test
   public void method3()
   {
	  System.out.println("Method3"); 
   }
   
   @Test
   public void method4()
   {
	  System.out.println("Method4"); 
   }
   
   @Test
   public void method5()
   {
	  System.out.println("Method5"); 
   }
   
   @Test
   public void method6()
   {
	  System.out.println("Method6"); 
   }
   
   @Test
   public void method7()
   {
	  System.out.println("Method7"); 
   }
   
   @Test (priority = -5)
   public void method8()
   {
	  System.out.println("Method8"); 
   }
   
   
   
   
   @AfterMethod
   public void exit()
   {
	   System.out.println("Exit Method");
   }
}

