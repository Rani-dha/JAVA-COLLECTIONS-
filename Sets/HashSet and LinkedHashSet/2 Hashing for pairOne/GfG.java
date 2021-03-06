// Program 2: Hashing for Pair 1
// https://practice.geeksforgeeks.org/problems/hashing-for-pair-1/1/?track=Java-Collections-HashSet&batchId=318#

//Initial Template for Java


import java.util.*;
import java.io.*;

class Gfg
{
    public static void main (String[] args) {
        
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking count of testcases
        int testcases = sc.nextInt();
        while(testcases-- > 0)
        {
            //taking size of array
            int N = sc.nextInt();
            int arr[] =  new int[N];  //array declaration
            
            for(int i = 0; i < N; i++)
             arr[i] = sc.nextInt(); //Input the array
             
             
            int sum = 0; 
            
            //taking sum
            sum = sc.nextInt();
            
            //Creating an object of class Geeks
            Geeks obj = new Geeks();
            
            //Calling sumExists method of class Geeks 
            //and printing the result
            System.out.println(obj.sumExists(arr, N, sum));
        }
    }
}


 // } Driver Code Ends
//User function Template for Java


class Geeks
{
    //Complete this function
    //Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int N, int sum)
    {
       //Your code here, Geeks
       HashSet<Integer> s = new HashSet<>();
       for(int i=0; i< N; i++){
            if(s.contains( sum - arr[i]))
              return 1;
            else 
               s.add(arr[i]);
       }
       return 0;
    }
}

// { Driver Code Starts.


  // } Driver Code Ends


//   Example 1:

// Input:
// N = 10
// arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
// sum = 14
// Output: 
// 1

// Explanation: 
// arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
// and sum = 14.  There is a pair {4, 10} 
// with sum 14.
// Example 2:

// Input:
// N = 2
// arr[] = {2, 5}
// sum = 10
// Output:
// 0

// Explanation: 
// arr[]  = {2, 5} and sum = 10. 
// There is no pair with sum 10.