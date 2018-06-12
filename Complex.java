package Basic;

import java.util.Scanner;

public class Complex {

	 int real,imag;
	  Complex(int x,int y)
	  {
		  real=x;
		  imag=y;
	  }
	  void Display()

	  {
	  System.out.println(real+"+"+imag+"i");
	  }

	  public static void main(String args[])

	  {
	             int l,b;
	        Scanner s1 = new Scanner(System.in);
	        System.out.print("Real part =");
	        l= s1.nextInt();
	        System.out.print("Imaginary part =");
	        b= s1.nextInt();
	        s1.close();
	        Complex c=new Complex(l,b);
	        c.Display();

	  }
	
	
}
