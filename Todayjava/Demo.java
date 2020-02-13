package com.oops;

class P
{
	int zx = 10;
	{
		System.out.println(zx);
	}
}
class P1 extends P
{
	int zy = 20;
	{
		System.out.println(zy);
	}
}
class P2 extends P1

{
	int z = 30;
	{
		System.out.println(z);
	}
}
public class Demo {
	  
	  public static void main(String[] args) 
	  
	  {
		  P2 c = new P2();

		  System.out.println(c.z); 
		 
	 } 
}
