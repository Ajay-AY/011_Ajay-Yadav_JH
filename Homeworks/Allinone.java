

/*
class Allinone                             // String
{
	public static void main(String []args)
	{
		String a = "Ajmer";
        String b = "Ajmera";
       	System.out.println(a.toLowerCase());	// ajmer

		System.out.println(b.toUpperCase());   // AJMERA
		
		System.out.println(a.concat(b));       // AjmerAjmera
		System.out.println(a.length());        //  5
		
		String c = "   Space   ";
		String d = "";
		String e = "hello";
		
		System.out.println(c.trim());             // Space
		System.out.println(d.isEmpty());           // true
		System.out.println(e.isEmpty());           // false
		
		System.out.println(a.charAt(2));           // m
		System.out.println(a.indexOf('j'));
		
		System.out.println(a.equals(b));		// false
		System.out.println(e.replace('l','y'));   // heyyo
		
		
		
	}
}
*/
		
		
/*class Allinone                             // SquareRoot without Math.sqrt()
{
	public static void main(String []args)
	{
		int num = 16;
		double temp;
		double sq = num/2;
		do
		{
			temp = sq;
			sq=(temp+(num/sq))/2;
		}
		while((temp-sq)!=0);
		
		System.out.println("Square Root of number is : "+sq);
	}
}
*/


/*
import java.util.Scanner;
class Allinone                             // Fibbonacci Series
{
	public static void main(String []args)
	{
		int a =0;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number till the series must go");
		int n = sc.nextInt();
		for (int i=0;i<=n;i++)
		{
			System.out.print(a+" ");
			int c = a+b;
			a=b;
			b=c;
			
		}
	}
}
*/




/*class Allinone                           // Prime Number

{
	public static void main(String []args)
	{
		for(int j = 2;j<=100;j++)
		{
			int temp=0;
			for(int i=2;i<j;i++)
				{
					if(j%i==0)
					{
						temp++;
					}
				}
			
			if (temp==0)
				System.out.print(j+" ");
		
		}
	}
}
*/


/*class Allinone                           // Palindrome Number

{
	public static void main(String []args)
	{
		int num = 2334;
			int res = 0,rem = 0;
			int q = num;
			while (q!=0)
			{
			rem = q%10;
			 res = res*10 + rem;
			 q =q/10;
			}
			if (num == res)
				System.out.println("This is the Palindrome number");
			else
				System.out.println("This is not a Palindrome number");
	
	}
}



/*import java.util.*;
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
*/

/*
import java.util.*;
class Allinone                               //Area of Rectangle
{
	public static void main(String []args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Two numbers : ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int Area = a*b;
	System.out.println("Area of rec : "+Area);
	
	}
}
*/


/*
import java.util.*;
class Allinone                                         // swap
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
}*/


/*import java.util.Scanner;
class Allinone                               //Factorization
{
	public static void main(String[]args)
	{
		int n,p,res=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i =n;i>0;i--)
		{
			res = i*res;
		}
		System.out.println(res);
	}
}
*/

/*import java.util.Scanner;
class Allinone  //power of number
{
	public static void main(String[]args)
	{
		int n,p,res=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		p = sc.nextInt();
		for(int i =1;i<=p;i++)
		{
			res = n*res;
		}
		System.out.println(res);
	}
}
*/

/*class Allinone                             //add two character
{
	public static void main(String[]args)
	{
		char a ='A';
		char b = 'B';
		System.out.println(a+""+b);
	}
}*/


/*
class Allinone                            //two numbers binary
{
	public static void main(String[]args)
	{
		int a = 1010;
		int b = 100;
		int []arr = new int[6];
		int dig1=0;
		int dig2=0;
		int sum=0;
		int carry=0;
		int count = 0;
		
		for(int j = arr.length-1;j>=0;j--)
		{		sum=0;
				count++;
				dig1 = a%10;
				
				dig2 = b%10;
				
				a = a/10;
			
				b = b/10;
				
				sum = dig1 + dig2 + carry;
				
				//conditions for carryout 
				if(sum==0)
				{
					arr[j]=0;
					 carry = 0;
				}
				else if(sum==1)
				{
					arr[j]=1;
					carry= 0;
				}
				else if(sum==2)
				{
					arr[j]=0;
					carry=1;
				}
				else if(sum==3)
				{
					
					arr[j]=1;
					carry=1;
				}
		}
		
		// print array of binary numbers
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	
	}
}
*/







/*class Allinone                                  //two numbers
{
	public static void main(String[]args)
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("Sum of numbers is :"+sum);
		
	}
}*/


/*
import java.util.Scanner;
class Allinone                                      //Armstrong
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Armstrong Number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum + (int)(Math.pow(rem,3));
			num = num/10;
		}
		if(temp==sum)
			System.out.println(temp+" is an Armstrong Number");
		else
			System.out.println(temp+" is not an  Armstrong Number");
	}
}*/

/*import java.util.Scanner;

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
} */

/**/
