package com.oops;

class A
{
    String b = "Class A";

}
 
class B extends A
{
    String a = "Class B";
 
	  {
		  System.out.println(super.b); 
	  }
	 
}
 
class C extends B
{
    String s = "Class C";
    int x = 6;
    
    {
	  System.out.println(super.a);
	  System.out.println(x);
  
    }
}
 

  public class MainClass {
	  
	  public static void main(String[] args) 
	  
	  {
		  C c = new C();
  
		  System.out.println(c.s); 
		  //c.display();
	 } 
}
 