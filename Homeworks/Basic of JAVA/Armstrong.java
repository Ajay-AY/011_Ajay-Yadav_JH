import java.util.Scanner;
class Armstrong                                      //Armstrong
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
}
