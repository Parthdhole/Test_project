package com.dss; 
public class SwapNumber{
  public static void  main(String[] args)
{ 
	 float first =12.4f;
	 float second=14.5f;
	 
	 System.out.println("----before swaping----");
	 System.out.println(" first Number"+first);
	 System.out.println("second Number"+second);
	 
	 float temporary =first;
	 
	first =second;
	 second = temporary;
	 System.out.println("----after swaping----");
	 System.out.println(" first Number"+first);
	 System.out.println("second Number"+second);
	 
	 
}
}