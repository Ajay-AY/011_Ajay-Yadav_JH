import java.util.Scanner;
class A207
 {
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Which Table you want please enter");
	  int n = sc.nextInt();
	 for(int i = 1;i<=10;i++)
	  {
		  System.out.println(n+"x"+i+"="+(n*i));
		  
	  }
	}
 }