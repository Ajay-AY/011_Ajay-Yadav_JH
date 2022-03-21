import java.util.*;
class A0215
{
	public static void main(String []args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Two numbers : ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Before Swap A = "+a+" B = "+b);
	int temp;
	temp = a;
	a = b;
	b = temp;
	System.out.println("After Swap A = "+a+" B = "+b);
	
	
	}
}