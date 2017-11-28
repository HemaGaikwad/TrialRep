package com.testyantra.webelementmethods;

public class SumOfPowerOfNumbers {

	public static void main(String[] args) 
	{
		 int c=0,a;  
		    int n=147;
		    
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=(int) (c+(Math.pow(a, a)));  
		    }  
		    System.out.println(c);
		   
	}
}


