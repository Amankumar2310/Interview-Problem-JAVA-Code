/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int arr[]= new int[n];
	   for(int i=0;i<n;i++)
	   {
	       arr[i]=sc.nextInt();
	   }
	   
	   //int arr[]= {7,3,8,2,1};

	   
	   for(int i=0;i<arr.length-1;i++)
	   {
	       for(int j=0;j<arr.length-i-1;j++)
	       {
	           if(arr[j]>arr[j+1])
	           {
	               int temp=arr[j];
	               arr[j]=arr[j+1];
	               arr[j+1]=temp;
	           }
	       }
	   }
	   for(int i=0;i<arr.length;i++)
	   {
	       System.out.print(arr[i]+" ");
	   }
	}
}
