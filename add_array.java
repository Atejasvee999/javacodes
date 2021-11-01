import java.io.*;
import java.util.Scanner;
public class add_array {
      public static void main (String args[])throws IOException
      {
    	  Scanner scn=new Scanner(System.in);
    	  System.out.println("enter first array length");
    	  int a=scn.nextInt();
    	  System.out.println("enter second array length");
    	  int b=scn.nextInt();
    	  int[]arr1=new int[a];
    	  int[]arr2=new int[b];
    	  System.out.println("enter content of first array");
    	  for(int i=0;i<arr1.length;i++)
    	  {
    		arr1[i]=scn.nextInt();  
    	  }
    	  System.out.println("enter content of second array");
    	  for(int i=0;i<arr2.length;i++)
    	  {
    		  arr2[i]=scn.nextInt();
    	  }
    	  int[]sum=new int[a>b?a:b];
    	  int c=0;
    	  int i=arr1.length-1;
    	  int j=arr2.length-1;
    	  int k=sum.length-1;
    	  while(k>=0)
    	  {
    		  int d=c;
    		  if(i>=0) {
    			  d+=arr1[i];
    		  }
    		  if(j>=0) {
    			  d+=arr2[j];
    		  } 
    		  c=d/10;
    		  d=d%10;
    		  sum[k]=d;
    		  i--;
    		  j--;
    		  k--;
    	  }
    	  if(c!=0)
    		  System.out.print(c+" ");
    	  for(int x:sum)
    	  {
    		  System.out.print(x+" ");
    	  }
      }
}
