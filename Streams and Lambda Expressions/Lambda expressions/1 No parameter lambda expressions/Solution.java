//  No parameter lambda expressions
//  https://practice.geeksforgeeks.org/problems/no-parameter-lambda-expression/1/?track=Java-Collections-Java-Lambda-Expressions&batchId=318#


//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
	    Scanner sc =new Scanner(System.in);
	    
	    //taking testcases count
	    int t=sc.nextInt();
	    
	    while(t-->0)
	    {
	        //calling helperFunction of class Hello
	        Hello h=helperFunction();
	        
	        //calling Interface method
	        h.sayHello();
	    }
	}
	
	
 // } Driver Code Ends
//User function Template for Java


/*
This is what the interface looks like

interface Hello {
    public void sayHello();
}
*/
public static Hello helperFunction() 
{
    //Your code here
    //Implement sayHello using lambda expression and return the object.
    //Write this in the lambda expression: System.out.println("Hello")
    
    // static function so we use class  name Hello
    Hello f = () -> {System.out.println("Hello");};
    return f;

}

// { Driver Code Starts.

}

interface Hello {
    public void sayHello();
}  // } Driver Code Ends