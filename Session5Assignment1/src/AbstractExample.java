/*
 * Create an abstract class Figure with following properties and functions:
Properties:
double dim1;
Methods:
abstract void findArea();
abstract void findPerimeter();
Create three subclasses Circle, Rectangle and Triangle that extends Figure class and define both
the methods. Write a program that will find the area and perimeter of 3 Figures and print the
details for all.
 */

import java.util.*;

public class AbstractExample 
{
	public static void main(String args[])
	{
		Figure r= new Rectangle();	//Object of class rectangle
		Circle c= new Circle();		//Object of class circle
		Triangle t= new Triangle();	//Object of class triangle
	
		r.findArea();			
		r.findPerimeter();
		
		c.findArea();
		c.findPerimeter();
		
		t.findArea();
		t.findPerimeter();
		
	}
}


//abstract class Figure with abstract methods findArea and findPerimeter
abstract class Figure
{
	double dim1,dim2;
	Scanner input= new Scanner(System.in);
	
	abstract void findArea();
	
	abstract void findPerimeter();
}

//class circle extends abstract class Figure
class Circle extends Figure
{
	double r, pi;
	
	//circle constructor to initialize value of pi
	Circle()
	{
		pi=3.142;
	}
	
	//area of circle
	void findArea()
	{
		System.out.println("Enter radius of circle -->");
		r= input.nextDouble();
		dim1=pi*r*r;
		System.out.println("Area of circle -->"+dim1);
	}
	
	//perimeter of circle
	void findPerimeter()
	{
		dim2=2*pi*r;
		System.out.println("Perimeter of circle -->"+dim2);
	}
}

//class triangle extends abstract class Figure
class Triangle extends Figure
{
	double a,b,c,s;
	
	//area of triangle
	void findArea()
	{
		System.out.println("Enter 3 sides of triangle -->");
		a= input.nextDouble();
		b= input.nextDouble();
		c= input.nextDouble();
		
		/*triangle can be formed only when sum of 2 sides is greater than or equal to third
		 * check for the condition */
		 
		if(((a+b)>=c)&&((b+c)>=a)&&((c+a)>=b))
		{	
			s=(a+b+c)/2;
			dim1=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
			System.out.println("Area of Triangle -->"+dim1);
		}
		else
		{
			System.out.println("Cannot find area of a triangle.. wrong sides");
		}
	}
	void findPerimeter()
	{
		/*triangle can be formed only when sum of 2 sides is greater than or equal to third
		 * check for the condition */
		if(((a+b)>=c)&&((b+c)>=a)&&((c+a)>=b))
		{
			dim2=(a+b+c);
			System.out.println("Perimeter of Triangle -->"+dim2);
		}
		
		else
		{
			System.out.println("Cannot find perimeter of a triangle.. wrong sides");
		}
		
	}
}

//class rectangle extends abstract class figure
class Rectangle extends Figure
{
	double l,b;
	
	//area of rectangle
	void findArea()
	{
		System.out.println("Enter Length and breadth of rectangle -->");
		l= input.nextDouble();
		b= input.nextDouble();
		dim1=l*b;
		System.out.println("Area of Rectangle -->"+dim1);	
	}
	
	//perimeter of rectangle
	void findPerimeter()
	{
		dim2=2*(l+b);
		System.out.println("Perimeter of Rectangle -->"+dim2);
	}
}