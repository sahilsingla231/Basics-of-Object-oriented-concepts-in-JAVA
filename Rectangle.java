package Basic;

import java.util.Scanner;

public class Rectangle {
	
	  float length;
	  float breadth;

	  Rectangle()

	  {
	    length=0;
	    breadth=0;
	  }
	  
	  float CalculateArea(float l,float b)
	  {
	  length=l;
	  breadth=b;
	    float area=length*breadth;
	    return area;

	  }

	  public static void main(String args[])

	  {

	    Rectangle r=new Rectangle();
	      float l,b;
	      Scanner s1 = new Scanner(System.in);
	        System.out.println("Enter length of Rectangle:");
	        l= s1.nextFloat();
	        System.out.println("Enter breadth of Rectangle");
	        b= s1.nextFloat();
	        s1.close();

	    System.out.println("Area of rectangle="+ r.CalculateArea(l,b));

	  }


}
