import java.util.Scanner;
class Factor                               //Factorization
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
