package Basic;

import java.util.Scanner;

public class Waveform {

	public static void main(String[] args) 
    {
	 int n;
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
     //sorting
     int j,k,temp;
     for(j=0;j<n-1;j++)
     {
    	 int count=0;
    	 for(k=0;k<(n-1)-j;k++)
    	 {
    		 if(a[k]>a[k+1])
    		 {
    			 temp=a[k];
    			 a[k]=a[k+1];
    			 a[k+1]=temp;
    			 count++;
    		 }
    	 }
    	 if(count==0)
    	 {
    		 break;
    	 }
     }
     int i;
     
     //swapping sorted adjacent elements
     for(i=0;i<n-1;i=i+2)
     {
         temp=a[i+1];
         a[i+1]=a[i];
         a[i]=temp;
     }
     
     System.out.println("Result is ");
    for(i=0;i<n;i++)
     System.out.println(a[i]);

}
}
