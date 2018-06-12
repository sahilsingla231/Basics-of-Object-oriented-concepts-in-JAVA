package Basic;

import java.util.Scanner;

public class SecondLargest {
	
	public static void main(String[] args) 
    {
	 int n, max=0, smax=0;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter number of elements in the array:");
     n = s.nextInt();
     int a[] = new int[n];
     System.out.println("Enter elements of array:");
     for(int i = 0; i < n; i++)
     {
         a[i] = s.nextInt();
     }
     
     s.close();
     int j;
     
     //without Sorting :-)
     
     for(j=0; j<n;j++)
     {
    	 if(max<a[j])
    	 {
    		 smax=max;
    		 max=a[j];
    	 }
    	 else if(smax<a[j])
    	 {
    		 smax=a[j];
    	 }
     }
     
     System.out.println("Second largest element in array is "+smax);

}
}