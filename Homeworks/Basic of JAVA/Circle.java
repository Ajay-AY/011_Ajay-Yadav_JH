import java.util.*;
class Circle                        // Area and Circmfrnc of Circle
{
	int rad;
	Circle(int r)
	{
		this.rad = r;
	}
	
	void area()
	{
		System.out.printf("Area of Circle : %.3f \n",(Math.PI*rad*rad));
	}
	void circumference()
	{
		System.out.printf("Circumference of Circle : %.3f \n",(2*Math.PI*rad));
	}
	
}
class Allinone                       
{
	public static void main(String []args)
	{
		Circle cr = new Circle(10);
		cr.area();
		cr.circumference();
	
	}
}
