import java.util.Scanner;
class LeapYear                                          //LeapYear
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%400==0||year%4==0&&year%100!=0)
			System.out.println(year+" Is a Leap Year");
		else
			System.out.println(year+" Is not a Leap Year");
		
	}
	
}
