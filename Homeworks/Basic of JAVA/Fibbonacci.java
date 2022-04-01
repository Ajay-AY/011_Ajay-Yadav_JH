import java.util.Scanner;
class  Fibbonacci                             // Fibbonacci Series
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
