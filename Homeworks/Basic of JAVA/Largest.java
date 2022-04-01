import java.util.Scanner;

class Largest                                          //Largest
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second Number");
		int num2 = sc.nextInt();
		System.out.print("Enter the Third Number");
		int num3 = sc.nextInt();
		if (num2<=num1&&num1>=num3)
			System.out.println(num1+" is the Largest Number");
		else if(num1<=num2&&num2>=num3)
			System.out.println(num2+" is the Largest Number");
		else if(num1<=num3&&num3>=num2)
			System.out.println(num3+" is the Largest Number");
	}
} 
