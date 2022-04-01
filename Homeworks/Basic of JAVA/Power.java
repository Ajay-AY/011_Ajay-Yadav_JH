import java.util.Scanner;
class Power                           //power of number
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
